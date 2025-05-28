package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestEntity;

import javax.persistence.*;

public class ReadRunner {
    public static void main(String[] args) {
     EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
     EntityManager em=emf.createEntityManager();
     EntityTransaction et=em.getTransaction();
     try{
     et.begin();
     RestEntity re=em.find(RestEntity.class,1);
     if(re!=null){
         System.out.println(re);
     }else{
         System.out.println("Data is Null");
     }
     }catch (PersistenceException e){
         et.rollback();
     }finally {
         emf.close();
     }
    }
}
