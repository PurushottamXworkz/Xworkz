package com.xworkz.bank.repo;

import com.xworkz.bank.entity.BankEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;
@Repository
public class BankRepoImpl implements  BankRepo{

    @Override
    public boolean saveData(BankEntity entity) {
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

//    @Override
//    public List<BankEntity> getAll() {
//        System.out.println("Invoking Repo");
//        return Persistence.createEntityManagerFactory("x-workz").createEntityManager().createNamedQuery("getAll").getResultList();
//    }
//
//    @Override
//    public BankEntity getNameById(int requestedIdFromFrontEnt){
//        System.out.println("Invoking repo class");
//        return (BankEntity) Persistence.createEntityManagerFactory("x-workz").createEntityManager().createNamedQuery("findById").setParameter("id",requestedIdFromFrontEnt).getSingleResult();
//    }
//
//    @Override
//    public void updateById(BankEntity bankEntity) {
//        EntityManager em=Persistence.createEntityManagerFactory("x-workz").createEntityManager();
//        em.getTransaction().begin();
//        em.merge(bankEntity);
//        em.getTransaction().commit();
//
//    }


}
