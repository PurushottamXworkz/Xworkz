package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestEntity;

import javax.persistence.*;

public class RestRunner {
    public static void main(String[] args) {
        RestEntity o=new RestEntity();
        o.setRestaurant_name("Ayodya");
        o.setRestaurant_address("Kattriguppe");
        o.setRestaurant_owner("Ramesh");
        o.setContact(7845126351L);
        o.setFamous_for("Idli-vada");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et= em.getTransaction();
        try{
           et.begin();
           em.persist(o);
            System.out.println("Data Saved Successfully");
           et.commit();
        }catch (PersistenceException e){
           et.rollback();
        }finally {
           em.close();
       }
    }
}
