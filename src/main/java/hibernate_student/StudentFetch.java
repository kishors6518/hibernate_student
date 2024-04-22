package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentFetch {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		
		Student student=manager.find(Student.class, 5);
		if(student!=null)
		{
			System.out.println(student);
		}
		else
		{
			System.out.println("ID not found");
		}
		

	}

}
