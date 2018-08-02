package com.trycatch.data.jpa.txdiag.repository.dao.impl;

import com.trycatch.data.jpa.txdiag.repository.TxdiagEntityManager;
import com.trycatch.data.jpa.txdiag.repository.dao.HysDrugInfoRepositoryCustom;
import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository("com.trycatch.data.jpa.txdiag.repository.dao.impl.HysDrugInfoRepositoryImpl")
public class HysDrugInfoRepositoryImpl extends TxdiagEntityManager implements HysDrugInfoRepositoryCustom {
    private final static Logger logger = LoggerFactory.getLogger(HysDrugInfoRepositoryImpl.class);

    @Override
    public List<HysDrugInfoEntity> findAll() {
        logger.info("=========== txdiag HysDrugInfoRepositoryImpl   findAll()");
        Query query =  this.entityManager.createQuery("select t from com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity t");
        try {
            return (List<HysDrugInfoEntity>)query.getResultList();
        }catch (Exception e){
            logger.info("=========== txdiag  findAll HysDrugInfoRepositoryImpl   Exception(),{}",e);
            return null;
        }
    }

    @Override
    public HysDrugInfoEntity find(Long id) {
        logger.info("=========== txdiag HysDrugInfoRepositoryImpl   find()");
        Query query =this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity t where t.id = :id ")
                .setParameter("id",id);
        try {
            return (HysDrugInfoEntity) query.getSingleResult();
        }catch (Exception e){
            logger.info("=========== txdiag find HysDrugInfoRepositoryImpl   Exception(),{}",e);
            return null;
        }
    }

    @Override
    public HysDrugInfoEntity findTest(Long id) {
        logger.info("=========== txdiag HysDrugInfoRepositoryImpl   findTest()");
        Query query = this.entityManager
                .createQuery("select t from com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity t where t.id = :id ")
                .setParameter("id", id);
        try {
            return (HysDrugInfoEntity) query.getSingleResult();
        }catch (Exception e){
            logger.info("=========== txdiag findTest HysDrugInfoRepositoryImpl   Exception(),{}",e);
            return null;
        }
    }
}
