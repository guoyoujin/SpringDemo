package com.trycatch.data.jpa.txdiag.repository;

import com.trycatch.data.jpa.base.BaseRepository;
import com.trycatch.data.jpa.txdiag.repository.dao.HysDrugInfoRepositoryCustom;
import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import org.springframework.stereotype.Repository;

@Repository("com.trycatch.data.jpa.txdiag.repository.HysDrugInfoRepository")
public interface HysDrugInfoRepository extends BaseRepository<HysDrugInfoEntity, Long>,HysDrugInfoRepositoryCustom {

}
