package com.trycatch.data.jpa.txdiag.repository.dao;

import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("com.trycatch.data.jpa.txdiag.repository.dao.HysDrugInfoRepositoryCustom")
public interface HysDrugInfoRepositoryCustom {
    List<HysDrugInfoEntity> findAll();
    HysDrugInfoEntity find(Long id);
    HysDrugInfoEntity findTest(Long id);
}
