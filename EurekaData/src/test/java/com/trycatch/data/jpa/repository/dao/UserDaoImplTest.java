package com.trycatch.data.jpa.repository.dao;

import com.trycatch.data.jpa.config.DataConfig;
import com.trycatch.data.jpa.config.JpaConfig;
import com.trycatch.data.jpa.entity.UserEntity;
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
public class UserDaoImplTest {

    private final static Logger logger = LoggerFactory.getLogger(UserDaoImplTest.class);

    @Autowired
    private UserDao userDao;

    private Integer userID = 1;

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
