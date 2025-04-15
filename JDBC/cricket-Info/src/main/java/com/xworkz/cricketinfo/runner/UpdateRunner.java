package com.xworkz.cricketinfo.runner;

import com.xworkz.cricketinfo.entity.CricketEntity;

import javax.persistence.*;

public class UpdateRunner {
    public static void main(String[] args) {
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            CricketEntity cr=em.find(CricketEntity.class,2);
            if(cr!=null){
                System.out.println("Updating new values");
                cr.setInternationalScores(14907);
                CricketEntity isUpdated=em.merge(cr);
                System.out.println(isUpdated);
                et.commit();
            }else{
                System.out.println("Data not updated");
            }
        }catch (PersistenceException e){
            et.rollback();
        }finally {
            emf.close();
        }


    }
}
