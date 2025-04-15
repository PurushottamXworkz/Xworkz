package runner;

import entity.EventEntity;

import javax.persistence.*;

public class ReadRunner {
    public static void main(String[] args) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
       EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            EventEntity ee=em.find(EventEntity.class,1);
            System.out.println(ee);
        }catch (PersistenceException e){
            et.rollback();
        }finally{
            em.close();
        }
    }
}
