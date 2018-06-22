package com.trycatch.data.jpa.service;


import com.trycatch.data.jpa.config.DataConfig;
import com.trycatch.data.jpa.config.JpaConfig;
import com.trycatch.data.jpa.entity.UserEntity;
import com.trycatch.data.jpa.repository.UserRepositoryTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class, JpaConfig.class})
public class UserServiceTest {
    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    private UserService userService;

    private Long userID = 1L;

    @Test
    public void testFind(){
        UserEntity userEntity = userService.find(userID);
        logger.info("testFind  userEntity ,{}",userEntity);
    }

    @Test
    public void testFind0(){
        try {
            UserEntity userEntity = userService.find(0L);
            logger.info("testFind0  userEntity  ,{}", userEntity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }

    @Test
    public void testFindAll(){
        List<UserEntity> ListUserEntity = userService.findAll();
        logger.info("testFindAll  ListUserEntity  ,{}", ListUserEntity);
    }

    @Test
    public void testFindTest(){
        try{
            UserEntity userEntity = userService.findTest(1L);
            logger.info("testFindTest  userEntity  ,{}",userEntity);
        }catch (Exception e){
            logger.error("Exception",e);
        }
    }
}
