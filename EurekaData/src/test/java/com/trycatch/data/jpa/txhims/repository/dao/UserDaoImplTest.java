package com.trycatch.data.jpa.txhims.repository.dao;

import com.trycatch.data.jpa.Application;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
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
public class UserDaoImplTest {

    private final static Logger logger = LoggerFactory.getLogger(UserDaoImplTest.class);

    @Autowired
    private UserDao userDao;

    private Long userID = 1L;

    @Test
    public void testFind(){
        UserEntity entity = userDao.find(userID);
        logger.debug("======="+entity.toString());
    }

    @Test
    public void testFindAll(){
        List<UserEntity> listUserEntity = userDao.findAll();
        logger.debug("======="+listUserEntity.toString());
    }
}
