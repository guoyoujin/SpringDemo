package com.trycatch.data.jpa.txdiag.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class TxdiagEntityManager {
    @PersistenceContext
    @Autowired
    @Qualifier(value = "txdiagEntityManagerFactory")
    public EntityManager entityManager;
}
