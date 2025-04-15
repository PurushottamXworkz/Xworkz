package com.xworkz.cricketinfo.runner;

import com.xworkz.cricketinfo.entity.CricketEntity;

import javax.persistence.*;

public class ReadRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            CricketEntity cr=em.find(CricketEntity.class,2);
            System.out.println(cr);
        }catch (PersistenceException e){
            et.rollback();
        }
    }
}
