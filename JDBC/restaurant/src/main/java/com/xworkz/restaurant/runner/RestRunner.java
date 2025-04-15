package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestEntity;

import javax.persistence.*;

public class RestRunner {
    public static void main(String[] args) {
        RestEntity o=new RestEntity();
        o.setRestaurant_name("Anna-kutira");
        o.setRestaurant_address("Kattriguppe");
        o.setRestaurant_owner("Srujan");
        o.setContact(7845126352L);
        o.setFamous_for("Biriyani");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try{
           et.begin();
           em.persist(o);
           et.commit();
        }catch (PersistenceException e){
           et.rollback();
        }finally {
           em.close();
       }
    }
}
