package com.coldchain.service;

import com.coldchain.entity.CpDeviceEs;

import java.util.List;

public interface CpDeviceEsService {

    void saveAll(List<CpDeviceEs> cpDeviceEsList);

    void save(CpDeviceEs cpDeviceEs);
}
