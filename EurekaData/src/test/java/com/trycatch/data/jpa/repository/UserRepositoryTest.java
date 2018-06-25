package com.trycatch.data.jpa.repository;

import com.trycatch.data.jpa.config.DataConfig;
import com.trycatch.data.jpa.config.JpaConfig;
import com.trycatch.data.jpa.txdiag.repository.UserRepository;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
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
    private Long userID = 1L;

    @Test
    public void testFind(){
        try{
            UserEntity entity = userRepository.find(userID);
            logger.info("testFind  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.debug("======="+e.getMessage());
        }
    }

    @Test
    public void testFind0(){
        try{
            UserEntity entity = userRepository.find(0L);
            logger.info("testFind0  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.debug("======="+e.getMessage());
        }
    }

    @Test
    public void testFindTest(){
        try{
            UserEntity entity = userRepository.findTest(1L);
            logger.info("testFindTest  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.debug("======="+e.getMessage());
        }
    }
}
