package com.xworkz.demo.repo;

import com.xworkz.demo.entity.DemoEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DemoImplementation implements Demo{
    @Override
    public void saveData(DemoEntity de) {
       EntityManager em= Persistence.createEntityManagerFactory("x-workz").createEntityManager();
       em.getTransaction().begin();
       em.persist(de);
       em.getTransaction().commit();
    }
}
