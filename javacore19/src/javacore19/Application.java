package javacore19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws Exception {
		Employee employee1 = new Employee("Max", 666, 10000000);
		File file = new File("file1.txt");
		employee1.serialize(employee1, file);
		System.out.println("Перше завдання " + employee1.deserealize(file));

		List<Employee> listEmloyees = new ArrayList();

		Employee employee2 = new Employee("Petro", 555, 10000000);
		Employee employee3 = new Employee("Ivan", 777, 10000000);

		listEmloyees.add(employee2);
		listEmloyees.add(employee3);

		File fileSer = new File("Employees.ser");

		FileOutputStream os = new FileOutputStream("E:\\Eclipce\\javacore19\\Employees.ser", true);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(listEmloyees);
		oos.close();
		os.close();

		FileInputStream is = new FileInputStream("E:\\Eclipce\\javacore19\\Employees.ser");
		ObjectInputStream ois = new ObjectInputStream(is);
		Serializable object = (Serializable) ois.readObject();
		ois.close();
		is.close();
		System.out.println("Друге завдання " + object);

	}

}
