package com.tree.datatest.service.impl;

import com.tree.datatest.domain.Telemetry;
import com.tree.datatest.service.DailyDataService;
import com.tree.datatest.utils.HiveConn;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class DailyDataServiceImpl implements DailyDataService {

    String tableName = "new_energy.ods_combiner_box_d";

    @Override
    public double getHrs(Telemetry telemetry) throws SQLException {

        System.out.println("telemetry" + telemetry);

        String deviceId = telemetry.getDeviceId();
        String measure_dt = telemetry.getMeasureDt();
        String route = telemetry.getRoute();
        double capacity = telemetry.getCapacity();
        int type = telemetry.getType();


        String sql = "SELECT p2m2," + route + ",ts FROM " + tableName + " WHERE deviceid ='"+deviceId
                + "' and measur_dt ='" + measure_dt + "' ORDER BY ts";

        Connection conn = HiveConn.getConn();
        Statement stmt = HiveConn.getStmt(conn);
        System.out.println("Running: " + sql);

        ResultSet res = stmt.executeQuery(sql);
        Map<Integer, Telemetry> results = new HashMap<>();
        int i=0;
        while (res.next()) {
            Telemetry tele = new Telemetry();
            tele.setV(res.getFloat("p2m2"));
            tele.setI(res.getFloat(route));
            tele.setTs(res.getString("ts"));

            results.put(i,tele);
            i++;
        }
        HiveConn.closeStmt(stmt);
        HiveConn.closeConn(conn);
        float sum = 0;
        for (int j = 0; j < results.size()-1; j++) {
            float v1 = results.get(j).getV();
            float i1 = results.get(j).getI();
            Long ts1 = Long.parseLong(results.get(j).getTs());

            float v2 = results.get(j+1).getV();
            float i2 = results.get(j+1).getI();
            Long ts2 = Long.parseLong(results.get(j+1).getTs());

            float p = (v1*i1 + v2*i2)/2;
            float ts = ts2-ts1;

            sum = sum + p*ts;

        }
//        除以2个1000，一个是KW，一个是毫秒
        if (type ==1) {
            return sum/capacity/(1000*1000)/3600;
        }
        return sum/(1000*1000)/3600;



}
}
