package hibernate_student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentFetchAll {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		
		Query query=manager.createQuery("SELECT s FROM Student s");
		List<Student> list=query.getResultList();
		System.out.println(list);

	}

}
