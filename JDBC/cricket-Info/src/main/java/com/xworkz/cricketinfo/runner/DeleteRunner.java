package com.xworkz.cricketinfo.runner;

import com.xworkz.cricketinfo.entity.CricketEntity;

import javax.persistence.*;

public class DeleteRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em = emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            CricketEntity cr=em.find(CricketEntity.class,2);
            if(cr!=null){
                System.out.println("Data is deleted");
                em.remove(cr);
                et.commit();
            }else{
                System.out.println("Data is not present to delete");
            }

        }catch (PersistenceException e){
            et.rollback();
        }finally{
            emf.close();
        }
    }
}
