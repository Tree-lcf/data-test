package com.tree.datatest.service;

import com.tree.datatest.domain.TDeviceBranch;
import com.tree.datatest.domain.Telemetry;

import java.util.List;

public interface BranchService {

    List<TDeviceBranch> listBranch();
}
