package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertData
{

	public static void main(String[] args) 
	{
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("Raviraj");
          EntityManager em = emf.createEntityManager();
          EntityTransaction et = em.getTransaction();
          
          Person person1 = new Person();
          person1.setId(1);
          person1.setName("Somnath Bagal");
          person1.setAge(27);
          
          Person person2 = new Person();
          person2.setId(2);
          person2.setName("Vishal Godase");
          person2.setAge(25);
          
          Pan pan1 = new Pan();
          pan1.setId(1);
          pan1.setPanNum("DGLPJ8055S");
          pan1.setAddress("Ranzani Tal-Madha Dist-Solapur");
          
          Pan pan2 = new Pan();
          pan2.setId(2);
          pan2.setPanNum("DGLIT7328V");
          pan2.setAddress("Rajale Tal-Phaltan Dist-Satara");
          
          person1.setPan(pan1);
          person2.setPan(pan2);
          
          pan1.setPerson(person1);
          pan2.setPerson(person2);
          
          et.begin();
          em.persist(person1);
          em.persist(person2);
          em.persist(pan1);
          em.persist(pan2);
          et.commit();
          
          System.err.println("Data Inserted Successfully");
        		  
	}

}
