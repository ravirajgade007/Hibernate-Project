package OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pan 
{
   @Id
   private int id;
   private String address;
   private String panNum;
   
   @OneToOne
   private Person person;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPanNum() {
	return panNum;
}

public void setPanNum(String panNum) {
	this.panNum = panNum;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}
   
}
