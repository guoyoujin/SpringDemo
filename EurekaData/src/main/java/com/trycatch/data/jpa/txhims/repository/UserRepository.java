package com.trycatch.data.jpa.txhims.repository;

import com.trycatch.data.jpa.txhims.repository.dao.UserRepositoryCustom;
import com.trycatch.eurekabean.data.txhims.entity.UserTestEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("com.trycatch.data.jpa.txhims.repository.UserRepository")
public interface UserRepository extends CrudRepository<UserTestEntity, Long>,UserRepositoryCustom<UserTestEntity,Long> {
    //此方法如果查询为空返回对象就是空，不会返回异常
    @Query("select u from com.trycatch.eurekabean.data.txhims.entity.UserTestEntity u where u.id = :id")
    UserTestEntity find(@Param("id") Long id);
}
