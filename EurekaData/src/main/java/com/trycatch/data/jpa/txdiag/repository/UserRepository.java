package com.trycatch.data.jpa.txdiag.repository;

import com.trycatch.data.jpa.txdiag.repository.dao.UserRepositoryCustom;
import com.trycatch.eurekabean.data.txdiag.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("com.trycatch.data.jpa.txdiag.repository.UserRepository")
public interface UserRepository extends CrudRepository<UserEntity, Long>,UserRepositoryCustom{
    //此方法如果查询为空返回对象就是空，不会返回异常
    @Query("select u from com.trycatch.eurekabean.data.txdiag.entity.UserEntity u where u.id = :id")
    UserEntity find(@Param("id") Long id);
}
