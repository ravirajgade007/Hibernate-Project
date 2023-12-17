package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args)
	{
		   EntityManagerFactory emf = Persistence.createEntityManagerFactory("Raviraj");
		   EntityManager em = emf.createEntityManager();
		   EntityTransaction et = em.getTransaction();
		   
		   Person person1 = new Person();
		   person1.setId(2);
		   person1.setName("Ajay Pawar");
		   person1.setAge(26);
		   
		   Pan pan1 = new Pan();
		   pan1.setId(2);
		   pan1.setPanNum("DGLPA7955A");
		   pan1.setAddress("Ranzani Tal-Madha Dist-Solapur");
		   
		   		   
		   et.begin();
		   em.merge(person1);
		   em.merge(pan1);
		   et.commit();
		   
		   System.err.println("Data Updated Successfully");
	}

}
