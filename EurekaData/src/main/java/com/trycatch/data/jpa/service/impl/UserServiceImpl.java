package com.trycatch.data.jpa.service.impl;

import com.trycatch.data.jpa.entity.UserEntity;
import com.trycatch.data.jpa.repository.UserRepository;
import com.trycatch.data.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public UserEntity find(Long id){
        return this.userRepository.find(id);
    }

    @Override
    public UserEntity findTest(Long id){
        return this.userRepository.findTest(id);
    }
}
