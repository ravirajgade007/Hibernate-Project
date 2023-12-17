package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveData {

	public static void main(String[] args) 
	{
		   EntityManagerFactory emf = Persistence.createEntityManagerFactory("Raviraj");
		   EntityManager em = emf.createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   
		   Person person1 = em.find(Person.class, 2);
		   em.remove(person1);
		   
		   Pan pan1 = em.find(Pan.class,2);
		   em.remove(pan1);
		   
		   et.begin();
		   et.commit();
		   
		   System.err.println("Data Removed Successfully");
		   
	}

}
