package javacore19practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class ApplicationSerialize {

	public static void main(String[] args) throws Exception {
			
		File document = new File("serailizedStudent.txt");
		Student st = new Student(20, "Max", "Lys");
		serializeObject(st, document);
		
		System.out.println(deserealizeObject(document));
	}
	public static void serializeObject(Serializable Object, File file) throws Exception{
	OutputStream os = new FileOutputStream(file);
	ObjectOutputStream oos = new ObjectOutputStream(os);
	oos.writeObject(Object);
	oos.close();
	os.close();
	}
	public static Serializable deserealizeObject(File file) throws Exception{
	InputStream is = new FileInputStream(file);
	ObjectInputStream ois = new ObjectInputStream(is);
	Serializable object = (Serializable) ois.readObject();
	ois.close();
	is.close();
	
	return object;
	}
}
