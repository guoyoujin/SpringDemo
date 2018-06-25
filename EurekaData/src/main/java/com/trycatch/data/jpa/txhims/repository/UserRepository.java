package com.trycatch.data.jpa.txhims.repository;

import com.trycatch.data.jpa.txhims.repository.dao.UserDao;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>,UserDao {
    //此方法如果查询为空返回对象就是空，不会返回异常
    @Query("select u from UserEntity u where u.id = :id")
    UserEntity find(@Param("id") Long id);
}
