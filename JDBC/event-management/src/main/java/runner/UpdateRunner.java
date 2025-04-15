package runner;

import entity.EventEntity;

import javax.persistence.*;

public class UpdateRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em= emf.createEntityManager();
       EntityTransaction et= em.getTransaction();
       try{
           et.begin();
           EventEntity ee=em.find(EventEntity.class,1);
           if(ee!=null){
               ee.setEvent_attendee("Raghuttam");
               et.commit();
               System.out.println("Data is updated");
           }else{
               System.out.println("Data is not present to update");
           }

       }catch (PersistenceException e){
           et.rollback();
       }finally{
           em.close();
       }
    }
}
