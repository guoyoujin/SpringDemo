package com.trycatch.data.jpa.txdiag.repository;

import com.trycatch.data.jpa.Application;
import com.trycatch.eurekabean.data.txdiag.entity.HysDrugInfoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class HysDrugInfoRepositoryTest {
    private final static Logger logger = LoggerFactory.getLogger(HysDrugInfoRepositoryTest.class);

    @Autowired(required = false)
    @Resource(name="com.trycatch.data.jpa.txdiag.repository.HysDrugInfoRepository")
    private HysDrugInfoRepository hysDrugInfoRepository;
    private Long userID = 1L;

    @Test
    public void testFind(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepository.find(userID);
            logger.info("testFind  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFind0(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepository.find(0L);
            logger.info("testFind0  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindTest(){
        try{
            HysDrugInfoEntity entity = hysDrugInfoRepository.findTest(1L);
            logger.info("testFindTest  HysDrugInfoEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindListByNativeSql(){
        try{
            List<HysDrugInfoEntity> listEntity = hysDrugInfoRepository.findListByNativeSql("select *from hys_drug_infos",HysDrugInfoEntity.class);
            logger.info("testFindListByNativeSql  listEntity  ,{}",listEntity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }
}
