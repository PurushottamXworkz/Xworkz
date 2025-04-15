package com.xworkz.demo.runner;

import com.xworkz.demo.entity.DemoEntity;

import javax.persistence.*;

public class UpdateRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf =Persistence.createEntityManagerFactory("x-workz");
       EntityManager em= emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
           DemoEntity dm = em.find(DemoEntity.class,5);
            System.out.println("Old data "+dm);
            if(dm!=null){
                System.out.println("setting new values");
                dm.setBookName("MERN");
                DemoEntity isUpdated=em.merge(dm);
                System.out.println("updated data"+isUpdated);
                et.commit();
            }else{
                System.out.println("Data is not updated");
            }
        }catch (PersistenceException e){
        et.rollback();
        }finally {
            emf.close();
        }
    }
}
