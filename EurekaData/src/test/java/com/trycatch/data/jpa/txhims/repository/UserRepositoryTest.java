package com.trycatch.data.jpa.txhims.repository;

import com.trycatch.data.jpa.Application;
import com.trycatch.eurekabean.data.txhims.entity.UserTestEntity;
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
public class UserRepositoryTest {
    private final static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    @Qualifier("com.trycatch.data.jpa.txhims.repository.UserRepository")
    private UserRepository userRepository;
    private Long userID = 1L;

    @Test
    public void testFind(){
        try{
            UserTestEntity entity = userRepository.find(userID);
            logger.info("testFind  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.debug("======="+e.getMessage());
        }
    }

    @Test
    public void testFind0(){
        try{
            UserTestEntity entity = userRepository.find(0L);
            logger.info("testFind0  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.debug("======="+e.getMessage());
        }
    }

    @Test
    public void testFindTest(){
        try{
            UserTestEntity entity = userRepository.findTest(1L);
            logger.info("=======testFindTest  userEntity ,{}",entity.toString());
        }catch (Exception e){
            logger.debug("=======Exception     "+e.getMessage());
        }
    }
}
