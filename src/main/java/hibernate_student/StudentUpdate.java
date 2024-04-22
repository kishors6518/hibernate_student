package hibernate_student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdate {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(2);
		student.setName("Piyush");
		student.setMark(99.99);
		student.setPhone(9850231729l);
		student.setAddress("Rajgurunagar");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("kishor");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student  student2= manager.find(Student.class, student.getId());
		if(student2!=null)
		{
			transaction.begin();
			manager.merge(student2);
			transaction.commit();
		}
		else
		{
			System.out.println("ID not found");
		}

	}

}
