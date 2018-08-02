package com.trycatch.data.jpa.txdiag.repository.dao;

import com.trycatch.data.jpa.Application;
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
public class UserRepositoryCustomTest {

    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryCustomTest.class);

    @Autowired
    @Qualifier(value="com.trycatch.data.jpa.txdiag.repository.dao.impl.UserRepositoryImpl")
    private UserRepositoryCustom userRepositoryCustom;

    private Long userID = 1L;

    @Test
    public void testFind(){
        try{
            UserEntity entity = userRepositoryCustom.find(userID);
            logger.info("testFind  userEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFind0(){
        try{
            UserEntity entity = userRepositoryCustom.find(0L);
            logger.info("testFind0  userEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindTest(){
        try{
            UserEntity entity = userRepositoryCustom.findTest(1L);
            logger.info("=======testFindTest  userEntity ,{}",entity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }
}
