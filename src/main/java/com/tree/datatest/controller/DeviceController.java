package com.tree.datatest.controller;


import com.tree.datatest.domain.TDeviceBranch;
import com.tree.datatest.domain.TStatHlDay;
import com.tree.datatest.service.BranchService;
import com.tree.datatest.service.DeviceService;
import com.tree.datatest.service.TopService;
import com.tree.datatest.utils.JasonData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("api/v1/pub/device/")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;


    @GetMapping("list")
    public JasonData getDeviceList(){

        return JasonData.buildSuccess(deviceService.listDevice());

    }

    @Autowired
    private BranchService branchService;

    @GetMapping("branch")
    public JasonData getBranchList(){

        return JasonData.buildSuccess(branchService.listBranch());

    }

    @Autowired
    private TopService topService;

    @CrossOrigin
    @PostMapping("top")
    public JasonData getTopList(@RequestBody TStatHlDay tStatHlDay){

        List<TDeviceBranch> list = branchService.listBranch();
        List<TStatHlDay> dayList = topService.listTop(tStatHlDay,list);

        if (dayList.size() == 0){
            return JasonData.buildError("该日查无数据，请重试");
        }
        Collections.sort(dayList);
//        dayList.subList(0,3);
//        Map<TStatHlDay,Integer> map = new HashMap<>();

        return JasonData.buildSuccess(dayList.subList(0,1));

    }


}