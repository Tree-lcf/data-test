package com.tree.datatest.mapper;

import com.tree.datatest.domain.TStatHlDay;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface TagMapper {

    TStatHlDay getTagDevice(@Param("deviceId")String deviceId,@Param("day") Date day);

}
