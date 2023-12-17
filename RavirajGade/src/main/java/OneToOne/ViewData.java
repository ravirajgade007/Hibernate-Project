package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ViewData {

	public static void main(String[] args) 
	{
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("Raviraj");
	   EntityManager em = emf.createEntityManager();
	   EntityTransaction et = em.getTransaction();
	   
	   Person person1 = em.find(Person.class, 1);
	   System.err.println("*****SHOWING DETAILS OF PERSON*****");
	  System.out.println("Id:"+person1.getId());
	  System.out.println("Name:"+person1.getName());
	  System.out.println("Age:"+person1.getAge());
	  
	  Person person2 = em.find(Person.class, 2);
	  System.out.println("Id:"+person2.getId());
	  System.out.println("Name:"+person2.getName());
	  System.out.println("Age:"+person2.getAge());
	  
	  System.out.println();
	  
	  Pan pan1 = em.find(Pan.class, 1);
	  System.err.println("*****SHOWING DETAILS OF PAN*****");
	  System.out.println("Id:"+pan1.getId());
	  System.out.println("Pan Number:"+pan1.getPanNum());
	  System.out.println("Address:"+pan1.getAddress());
	  
	  System.out.println();
	  
	  Pan pan2 = em.find(Pan.class, 2);
	  System.out.println("Id:"+pan2.getId());
	  System.out.println("Pan Number:"+pan2.getPanNum());
	  System.out.println("Address:"+pan2.getAddress());
	  
	   et.begin();
	   em.persist(person1);
	   em.persist(person2);
	   em.persist(pan1);
	   em.persist(pan2);
	   et.commit();
	   
	    
	}
}
