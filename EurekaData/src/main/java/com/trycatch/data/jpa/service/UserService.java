package com.trycatch.data.jpa.service;

import com.trycatch.data.jpa.entity.UserEntity;
import com.trycatch.data.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

   List<UserEntity> findAll();
   UserEntity find(Integer id);
   UserEntity findTest(Integer id);
}
