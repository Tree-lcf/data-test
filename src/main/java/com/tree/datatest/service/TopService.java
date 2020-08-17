package com.tree.datatest.service;

import com.tree.datatest.domain.TDeviceBranch;
import com.tree.datatest.domain.TStatHlDay;

import java.util.List;

public interface TopService {

    List<TStatHlDay> listTop(TStatHlDay tStatHlDay,List<TDeviceBranch> list);
}
