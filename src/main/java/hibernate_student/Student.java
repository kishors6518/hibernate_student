package hibernate_student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "student_info")
public class Student {
	
	@Id
	private int id;
	@Column(name = "std_name")
	private String name;
	private double mark;
	@Column(unique = true)
	private long phone;
	private String address;

}
