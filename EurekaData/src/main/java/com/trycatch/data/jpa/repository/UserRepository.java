package com.trycatch.data.jpa.repository;

import com.trycatch.data.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Query("select u from UserEntity u where u.id = :id")
    UserEntity find(@Param("id") Integer id);
}
