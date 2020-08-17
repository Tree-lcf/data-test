package com.tree.datatest.service.impl;

import com.tree.datatest.domain.TDeviceBranch;
import com.tree.datatest.domain.Telemetry;
import com.tree.datatest.mapper.BranchMapper;
import com.tree.datatest.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchMapper branchMapper;

    @Override
    public List<TDeviceBranch> listBranch() {
        return branchMapper.listBranch();
    }
}
