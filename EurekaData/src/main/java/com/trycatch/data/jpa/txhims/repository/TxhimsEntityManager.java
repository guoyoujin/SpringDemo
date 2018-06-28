package com.trycatch.data.jpa.txhims.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TxhimsEntityManager {
    @PersistenceContext
    @Autowired
    @Qualifier("txhimsEntityManagerFactory")
    public EntityManager entityManager;
}
