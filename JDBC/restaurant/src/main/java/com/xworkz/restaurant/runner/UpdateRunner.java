package com.xworkz.restaurant.runner;

import com.xworkz.restaurant.entity.RestEntity;

import javax.persistence.*;

public class UpdateRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            RestEntity re=em.find(RestEntity.class,2);
            if(re!=null){
                re.setRestaurant_address("Banashankari");
                System.out.println("Data Updated successfully");
                et.commit();
            }else {
                System.out.println("Data is not available to update");
            }
        }catch (PersistenceException e){
            et.rollback();
        }finally {
            em.close();
        }
    }
}
