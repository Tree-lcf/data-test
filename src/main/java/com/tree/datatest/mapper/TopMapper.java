package com.tree.datatest.mapper;

import com.tree.datatest.domain.TStatHlDay;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface TopMapper {

    List<TStatHlDay> listTop(@Param("date") Date date, @Param("deviceList") List<String> deviceList);
}
