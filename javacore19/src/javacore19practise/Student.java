package javacore19practise;

import java.io.Serializable;

//if the field containse transient, it means that this field wont be seen; 

public class Student implements Serializable {
	private transient int age;
	private transient String firstName;
	private String lastName;

	public Student(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + "]";
	}
	
}
