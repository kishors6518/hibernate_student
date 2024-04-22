package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentInsert {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.setId(7);
		student.setName("Nilesh Sagar");
		student.setMark(99);
		student.setPhone(8785485466l);
		student.setAddress("Lamjana");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		
		

	}

}
