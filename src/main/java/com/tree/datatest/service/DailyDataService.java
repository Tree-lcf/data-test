package com.tree.datatest.service;

import com.tree.datatest.domain.Telemetry;

import java.sql.SQLException;


public interface DailyDataService {

    String tableName = "new_energy.ods_combiner_box_detail_d";
    double capacity = 5.49;

    public double getHrs(Telemetry telemetry) throws SQLException;
}
