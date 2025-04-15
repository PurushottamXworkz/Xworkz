package com.xworkz.demo.runner;

import com.xworkz.demo.entity.DemoEntity;
import org.hibernate.internal.build.AllowSysOut;

import javax.persistence.*;

public class ReadRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
           DemoEntity dm= em.find(DemoEntity.class,1);
            System.out.println(dm);
        }catch (PersistenceException e){
            et.rollback();
        }
    }
}
