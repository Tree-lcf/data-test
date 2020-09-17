package com.tree.datatest.service;

import com.tree.datatest.domain.TStatHlDay;
import org.springframework.stereotype.Service;

@Service
public interface PowerService {

    double getPower(TStatHlDay tStatHlDay);
}
