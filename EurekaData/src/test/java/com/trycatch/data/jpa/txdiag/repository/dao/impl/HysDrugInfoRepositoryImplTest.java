package com.trycatch.data.jpa.txdiag.repository.dao.impl;


import com.trycatch.data.jpa.Application;
import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
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
public class HysDrugInfoRepositoryImplTest {
    private final static Logger logger = LoggerFactory.getLogger(HysDrugInfoRepositoryImpl.class);

    @Autowired
    @Qualifier(value="com.trycatch.data.jpa.txdiag.repository.dao.impl.HysDrugInfoRepositoryImpl")
    private HysDrugInfoRepositoryImpl hysDrugInfoRepositoryImpl;

    private Long userID = 1L;

    @Test
    public void testFind(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepositoryImpl.find(userID);
            logger.info("testFind  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFind0(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepositoryImpl.find(0L);
            logger.info("testFind0  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindTest(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepositoryImpl.findTest(1L);
            logger.info("=======testFindTest  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }
}
