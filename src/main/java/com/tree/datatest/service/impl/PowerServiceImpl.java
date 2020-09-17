package com.tree.datatest.service.impl;

import com.tree.datatest.domain.TStatHlDay;
import com.tree.datatest.domain.Telemetry;
import com.tree.datatest.service.DailyDataService;
import com.tree.datatest.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.text.SimpleDateFormat;

@Service
public class PowerServiceImpl implements PowerService {

    @Autowired
    private DailyDataService dailyDataService;

    @Override
    public double getPower(TStatHlDay tStatHlDay) {

//        TStatHlDay tagDevice = tagService.getTagDevice(tStatHlDay);
        Telemetry TagTelemetry = new Telemetry();
        TagTelemetry.setDeviceId(tStatHlDay.getDeviceId());
        TagTelemetry.setRouteId(tStatHlDay.getRoute());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        TagTelemetry.setMeasurDt(simpleDateFormat.format(tStatHlDay.getDay()));
        TagTelemetry.setType(0);
        double power=0;
        try {
            power = dailyDataService.getHrs(TagTelemetry);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return power;
    }
}
