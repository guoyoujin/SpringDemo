package com.trycatch.data.jpa.txdiag.service;

import java.util.List;

public interface BaseService<T,TD>  {
    List<T> list();
    T find(TD id);
    List<T> findAll();
    List<T> findListByNativeSql(String queryString, Class<T> clzss);
}
