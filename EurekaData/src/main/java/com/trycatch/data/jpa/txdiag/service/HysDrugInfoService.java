package com.trycatch.data.jpa.txdiag.service;

import com.trycatch.data.jpa.base.BaseService;
import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
@Component("com.trycatch.data.jpa.txdiag.service.HysDrugInfoService")
public interface HysDrugInfoService extends BaseService<HysDrugInfoEntity,Long> {
    HysDrugInfoEntity findTest(Long id);
}
