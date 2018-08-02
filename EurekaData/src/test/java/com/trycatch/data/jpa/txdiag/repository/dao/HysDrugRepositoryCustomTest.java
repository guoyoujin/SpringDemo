package com.trycatch.data.jpa.txdiag.repository.dao;

import com.trycatch.data.jpa.Application;
import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class HysDrugRepositoryCustomTest {

    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryCustomTest.class);

    @Autowired
    @Qualifier(value="com.trycatch.data.jpa.txdiag.repository.dao.impl.HysDrugInfoRepositoryImpl")
    private HysDrugInfoRepositoryCustom hysDrugInfoRepositoryCustom;

    private Long userID = 1L;

    @Test
    public void testFind(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepositoryCustom.find(userID);
            logger.info("testFind  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFind0(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepositoryCustom.find(0L);
            logger.info("testFind0  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindTest(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepositoryCustom.findTest(1L);
            logger.info("=======testFindTest  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }
}