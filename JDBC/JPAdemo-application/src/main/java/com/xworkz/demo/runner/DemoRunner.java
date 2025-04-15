package com.xworkz.demo.runner;

import com.xworkz.demo.entity.DemoEntity;

import javax.persistence.*;

public class DemoRunner {
    public static void main(String[] args) {

        DemoEntity demo = new DemoEntity();
        demo.setAuthor("Ramesh");
        demo.setPrice(130.24);
        demo.setLanguage("English");
        demo.setPublisherName("Swapna");
        demo.setBookName("Complete Reference Java");
        demo.setGenre("Technology");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(demo);
            et.commit();//save data permenent
        }catch (PersistenceException e){
            et.rollback();
        }finally {
            em.close();
        }


    }
}
