package com.trycatch.data.jpa.txdiag.service;


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
public class HysDrugInfoTest {
    private final static Logger logger = LoggerFactory.getLogger(HysDrugInfoTest.class);

    @Autowired
    @Resource(name="com.trycatch.data.jpa.txdiag.service.impl.HysDrugInfoServiceImpl")
    private HysDrugInfoService hysDrugInfoService;

    private Long id = 1L;

    @Test
    public void testFind(){
        try {
            HysDrugInfoEntity hysDrugInfoEntity = hysDrugInfoService.find(id);
            logger.info("testFind  hysDrugInfoEntity ,{}",hysDrugInfoEntity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFind0(){
        try {
            HysDrugInfoEntity hysDrugInfoEntity = hysDrugInfoService.find(0L);
            logger.info("testFind0  hysDrugInfoEntity  ,{}", hysDrugInfoEntity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindAll(){
        List<HysDrugInfoEntity> listHysDrugInfoEntity = hysDrugInfoService.findAll();
        logger.info("testFindAll  listHysDrugInfoEntity  ,{}", listHysDrugInfoEntity);
    }

    @Test
    public void testFindTest(){
        try{
            HysDrugInfoEntity hysDrugInfoEntity = hysDrugInfoService.findTest(1L);
            logger.info("testFindTest  hysDrugInfoEntity  ,{}",hysDrugInfoEntity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindListByNativeSql(){
        try{
            List<HysDrugInfoEntity> listHysDrugInfoEntity = hysDrugInfoService.findListByNativeSql("select *from hys_drug_infos",HysDrugInfoEntity.class);
            logger.info("testFindListByNativeSql  listHysDrugInfoEntity  ,{}",listHysDrugInfoEntity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }
}