package com.tree.datatest.mapper;

import com.tree.datatest.domain.Device;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeviceMapper {
    List<Device> listDevice();
    public Device getDeviceByNo(@Param("deviceIds")List<String> deviceIds);
}


