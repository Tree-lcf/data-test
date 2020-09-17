package com.tree.datatest.controller;

import com.tree.datatest.domain.TStatHlDay;
import com.tree.datatest.domain.Telemetry;
import com.tree.datatest.service.DailyDataService;
import com.tree.datatest.service.PowerService;
import com.tree.datatest.service.TagService;
import com.tree.datatest.utils.JasonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;


@RestController
@RequestMapping("api/v1/pub/telemetry")
public class DataTestController {

    @Autowired
    private DailyDataService dailyDataService;

    @Autowired
    private PowerService powerService;

    @Autowired
    private TagService tagService;

    @PostMapping("dailyData")
    public JasonData dailyData(@RequestBody Telemetry telemetry){

//        telemetry.setRoute();


        double dData=0;

//        表示计算日可用小时数，type=1，否则计算发电量，type=0

        try {
           dData = dailyDataService.getHrs(telemetry);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return JasonData.buildSuccess(dData);
    }

    @PostMapping("tag")
    public JasonData tag(@RequestBody TStatHlDay tStatHlDay){

        System.out.println("tStatHlDay" + tStatHlDay);
        TStatHlDay tagDevice = tagService.getTagDevice(tStatHlDay);

        return JasonData.buildSuccess(tagDevice);
    }

    @PostMapping("loss")
    public JasonData loss(@RequestBody TStatHlDay tStatHlDay) throws SQLException {

        System.out.println("tStatHlDay" + tStatHlDay);
//        先求该组串的日发电量
        double power = powerService.getPower(tStatHlDay);
//        先求标杆
        TStatHlDay tagDevice = tagService.getTagDevice(tStatHlDay);
//        再求标杆发电量
        double tagPower = powerService.getPower(tagDevice);

        double deltaPower = tagPower - power;

        return JasonData.buildSuccess(deltaPower);
    }

}
