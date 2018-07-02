package com.trycatch.data.jpa.base;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public class BaseRepositoryImpl<T, TD extends Serializable> extends SimpleJpaRepository<T, TD> implements BaseRepository<T, TD> {

    private final EntityManager entityManager; //父类没有不带参数的构造方法，这里手动构造父类

    private Class<T> entityClass;

    public BaseRepositoryImpl(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
        this.entityManager = em;
        this.entityClass = domainClass;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findListByNativeSql(String sql, Class<T> clzss) {
        return entityManager.createNativeQuery(sql, clzss).getResultList();
    }
}
