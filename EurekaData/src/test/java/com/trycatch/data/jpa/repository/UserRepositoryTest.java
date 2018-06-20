package com.trycatch.data.jpa.repository;

import com.trycatch.data.jpa.DataConfig;
import com.trycatch.data.jpa.config.JpaConfig;
import com.trycatch.data.jpa.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataConfig.class, JpaConfig.class})
public class UserRepositoryTest {
    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
    @Autowired
    private UserRepository userRepository;

    private Integer userID = 1;

    @Test
    public void testFindTest(){
        UserEntity entity = userRepository.find(userID);
        logger.debug("======="+entity.getId().toString());
    }
}
