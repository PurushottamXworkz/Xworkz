package runner;

import entity.EventEntity;

import javax.persistence.*;

public class EventRunner {
    public static void main(String[] args) {
        EventEntity ev=new EventEntity();
        ev.setEvent_Name("Tech Talk");
        ev.setEvent_organizer("Google Dev");
        ev.setEvent_attendee("Vinayaka");
        ev.setContact(9876556210L);
        ev.setAddress("Bangalore");
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("x-workz");
       EntityManager em= emf.createEntityManager();
       EntityTransaction et= em.getTransaction();
       try{
           et.begin();
           System.out.println("data created");
           em.persist(ev);
           et.commit();
       }catch(PersistenceException e){
           et.rollback();
       }finally{
           em.close();
       }
    }
}
