package com.trycatch.data.jpa.txdiag.repository;

import com.trycatch.data.jpa.base.BaseRepository;
import com.trycatch.data.jpa.txdiag.repository.dao.UserRepositoryCustom;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository("com.trycatch.data.jpa.txdiag.repository.UserRepository")
public interface UserRepository extends BaseRepository<UserEntity, Long>,UserRepositoryCustom{

}
