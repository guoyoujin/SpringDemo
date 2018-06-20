package com.trycatch.data.jpa.service;


import com.trycatch.data.jpa.DataConfig;
import com.trycatch.data.jpa.config.JpaConfig;
import com.trycatch.data.jpa.entity.UserEntity;
import com.trycatch.data.jpa.repository.UserRepositoryTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class, JpaConfig.class})
public class UserServiceTest {
    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    private UserService userService;

    private Integer userID = 1;

    @Test
    public void testFindTest(){
        UserEntity userEntity = userService.find(userID);
        logger.debug(String.format("%s",true));
        logger.debug(userEntity.toString());
    }
}
