package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdateSpeData {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		
		Student student=manager.find(Student.class, 3);
		if(student!=null)
		{
			student.setAddress("Mumbai");
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.merge(student);
			transaction.commit();
		}
		else
		{
			System.out.println("ID not found");
		}

	}

}
