package runner;

import entity.EventEntity;

import javax.persistence.*;

public class DeleteRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et= em.getTransaction();
       try{
           et.begin();
           EventEntity ee=em.find(EventEntity.class,3);
           if(ee!=null){
               em.remove(ee);
               et.commit();
               System.out.println("Data deleted");
           }else{
               System.out.println("Data is not present to delete");
           }
       }catch(PersistenceException e){
           et.rollback();
       }finally {
           em.close();
       }
    }
}
