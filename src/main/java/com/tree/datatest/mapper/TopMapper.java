package com.tree.datatest.mapper;

import com.tree.datatest.domain.TStatHlDay;

import java.util.Date;
import java.util.List;

public interface TopMapper {

    List<TStatHlDay> listTop(Date date,List<String> deviceList);
}
