package com.trycatch.data.jpa.txdiag.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable> extends CrudRepository<T,ID> {
    List<T> findListByNativeSql(String sql, Class<T> clzss);
}
