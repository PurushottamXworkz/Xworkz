package com.xworkz.railwaybooking.repo;

import com.xworkz.railwaybooking.entity.RailwayBookingEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
@Repository
public class RailwayBookingImpl implements RailwayBookingRepo{

    @Override
    public boolean saveData(RailwayBookingEntity entity) {
        boolean isSaved=false;
        if(entity!=null){
           EntityManager em= Persistence.createEntityManagerFactory("x-workz").createEntityManager();
           em.getTransaction().begin();
           em.persist(entity);
           em.getTransaction().commit();
           isSaved=true;
        }
        return isSaved;
    }
}
