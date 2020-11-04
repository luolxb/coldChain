package com.coldchain.repository;

import com.coldchain.entity.CpDeviceEs;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.util.Optional;

public interface CpDeviceEsRepository extends ElasticsearchCrudRepository<CpDeviceEs,String> {

    @Override
    Optional<CpDeviceEs> findById(String id);
}
