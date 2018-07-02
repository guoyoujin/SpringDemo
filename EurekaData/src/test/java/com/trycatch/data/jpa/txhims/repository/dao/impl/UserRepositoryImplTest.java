package com.trycatch.data.jpa.txhims.repository.dao.impl;

import com.trycatch.data.jpa.Application;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
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
public class UserRepositoryImplTest {
    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryImplTest.class);

    @Autowired
    @Qualifier(value="com.trycatch.data.jpa.txhims.repository.dao.impl.UserRepositoryImpl")
    private UserRepositoryImpl userRepositoryImpl;

    private Long userID = 1L;

    @Test
    public void testFind(){
        try{
            UserEntity entity = userRepositoryImpl.find(userID);
            logger.info("testFind  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFind0(){
        try{
            UserEntity entity = userRepositoryImpl.find(0L);
            logger.info("testFind0  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindTest(){
        try{
            UserEntity entity = userRepositoryImpl.findTest(1L);
            logger.info("=======testFindTest  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }
}
