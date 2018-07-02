package com.trycatch.data.jpa.txhims.repository;

import com.trycatch.data.jpa.txhims.repository.dao.UserRepositoryCustom;
import com.trycatch.eurekabean.data.txhims.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository("com.trycatch.data.jpa.txhims.repository.UserRepository")
public interface UserRepository extends BaseRepository<UserEntity, Long>,UserRepositoryCustom {
//    //此方法如果查询为空返回对象就是空，不会返回异常
//    @Query("select u from com.trycatch.eurekabean.data.txhims.entity.UserEntity u where u.id = :id")
//    UserEntity find(@Param("id") Long id);
}
