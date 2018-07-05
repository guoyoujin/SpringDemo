package com.trycatch.data.jpa.base;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable> extends CrudRepository<T,ID> {
    List<T> findListByNativeSql(String sql, Class<T> clzss);

}
