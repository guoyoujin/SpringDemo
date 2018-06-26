package com.trycatch.data.jpa.test.txdiag.service;

import com.trycatch.data.jpa.Application;
import com.trycatch.data.jpa.txdiag.service.UserService;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserServiceTest {
    private final static Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

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
