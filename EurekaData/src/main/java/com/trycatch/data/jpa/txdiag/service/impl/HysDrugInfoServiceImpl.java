package com.trycatch.data.jpa.txdiag.service.impl;

import com.trycatch.data.jpa.txdiag.repository.HysDrugInfoRepository;
import com.trycatch.data.jpa.txdiag.service.HysDrugInfoService;
import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("com.trycatch.data.jpa.txdiag.service.impl.HysDrugInfoServiceImpl")
public class HysDrugInfoServiceImpl implements HysDrugInfoService {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    @Resource(name="com.trycatch.data.jpa.txdiag.repository.HysDrugInfoRepository")
    private HysDrugInfoRepository hysDrugInfoRepository;


    @Override
    public HysDrugInfoEntity findTest(Long id) {
        return this.hysDrugInfoRepository.findTest(id);
    }

    @Override
    public List<HysDrugInfoEntity> list() {
        return this.hysDrugInfoRepository.findAll();
    }

    @Override
    public HysDrugInfoEntity find(Long id) {
        return this.hysDrugInfoRepository.find(id);
    }

    @Override
    public List<HysDrugInfoEntity> findAll() {
        return this.hysDrugInfoRepository.findAll();
    }

    @Override
    public List<HysDrugInfoEntity> findListByNativeSql(String queryString, Class<HysDrugInfoEntity> clzss) {
        return this.hysDrugInfoRepository.findListByNativeSql(queryString,clzss);
    }
}
