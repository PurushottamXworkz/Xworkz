package com.xworkz.demo.runner;

import com.xworkz.demo.entity.DemoEntity;

import javax.persistence.*;

public class DeleteRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em = emf.createEntityManager();
       EntityTransaction et = em.getTransaction();
       try{
           et.begin();
           DemoEntity dm=em.find(DemoEntity.class,5);
           if(dm!=null){
               em.remove(dm);
               System.out.println("Data is deleted");
           }else{
               System.out.println("Data is not present to delete");
           }
           et.commit();
       }catch (PersistenceException e){
           et.rollback();
       }finally {
           em.close();
       }
    }
}
