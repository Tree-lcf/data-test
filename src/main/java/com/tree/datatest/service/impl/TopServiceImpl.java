package com.tree.datatest.service.impl;

import com.tree.datatest.domain.TDeviceBranch;
import com.tree.datatest.domain.TStatHlDay;
import com.tree.datatest.mapper.TopMapper;
import com.tree.datatest.service.TopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TopServiceImpl implements TopService {

    @Autowired
    private TopMapper topMapper;

    @Override
    public List<TStatHlDay> listTop(TStatHlDay tStatHlDay,List<TDeviceBranch> list) {

        Date date = tStatHlDay.getDay();

        List<String> deviceList = new ArrayList<>();

        for (TDeviceBranch device:list
             ) {
            String id = device.getDeviceId();
            deviceList.add(id);
        }

        return topMapper.listTop(date,deviceList);
    }
}
