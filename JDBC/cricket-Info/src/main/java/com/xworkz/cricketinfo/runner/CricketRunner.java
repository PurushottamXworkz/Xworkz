package com.xworkz.cricketinfo.runner;

import com.xworkz.cricketinfo.entity.CricketEntity;

import javax.persistence.*;

public class CricketRunner {
    public static void main(String[] args) {
        CricketEntity entity=new CricketEntity();
        entity.setJerseyNumber(18);
        entity.setHeight(5.5f);
        entity.setAge(28);
        entity.setName("Virat");
        entity.setLocation("Haryana");
        entity.setCountry("India");
        entity.setIplTeam("RCB");
        entity.setOrderOfPlayer("Mid Order");
        entity.setInternationalScores(12000);
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("x-workz");

        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            em.persist(entity);
            System.out.println(entity);
            et.commit();
            System.out.println("Data saved successfully");
        }catch (PersistenceException e){
            et.rollback();
        }
    }
}
