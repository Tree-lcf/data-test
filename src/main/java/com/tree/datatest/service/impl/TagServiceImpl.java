package com.tree.datatest.service.impl;

import com.tree.datatest.domain.TStatHlDay;
import com.tree.datatest.mapper.TagMapper;
import com.tree.datatest.service.TagService;
import com.tree.datatest.utils.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public TStatHlDay getTagDevice(TStatHlDay tStatHlDay) {
        String deviceId = tStatHlDay.getDeviceId();
        System.out.println(deviceId);
        Date day = tStatHlDay.getDay();
        System.out.println(day);
        return tagMapper.getTagDevice(deviceId, day);

    }
}
