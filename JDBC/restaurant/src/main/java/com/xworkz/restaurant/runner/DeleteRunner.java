package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestEntity;

import javax.persistence.*;

public class DeleteRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            RestEntity re=em.find(RestEntity.class,2);
            if(re!=null){
                em.remove(re);
                et.commit();
                System.out.println("data is deleted");
            }else{
                System.out.println("Data is not present to delete");
            }
        }catch (PersistenceException e){
            et.rollback();
        }finally {
            emf.close();
        }
    }
}
