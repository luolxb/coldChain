package com.coldchain.service.impl;

import com.coldchain.entity.CpDeviceEs;
import com.coldchain.repository.CpDeviceEsRepository;
import com.coldchain.service.CpDeviceEsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CpDeviceEsServiceImpl implements CpDeviceEsService {

    @Autowired
    private CpDeviceEsRepository cpDeviceEsRepository;

    @Override
    public void saveAll(List<CpDeviceEs> cpDeviceEsList) {
        cpDeviceEsRepository.saveAll(cpDeviceEsList);
    }

    @Override
    public void save(CpDeviceEs cpDeviceEs) {
        cpDeviceEsRepository.save(cpDeviceEs);
    }
}
