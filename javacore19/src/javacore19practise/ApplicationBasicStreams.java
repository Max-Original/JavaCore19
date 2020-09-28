package javacore19practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class ApplicationBasicStreams {

	public static void main(String[] args) throws Exception {
		
		File file = new File("BasicStreams.txt");
		writeUsingOutputStream("Hello to you", file);

		String textFromFileIS = readUsingInputStream(file);
		System.out.println(textFromFileIS);
		
		File file2 = new File("BasicStreams2.txt");
		writeUsingWriter("Welcome", file2);
		String textFromReader = readUsingReader(file2);
		System.out.println(textFromReader);
	}
	public static String readUsingInputStream(File file) throws IOException{
		StringBuilder stringBuilder = new StringBuilder();
		InputStream inputStream = new FileInputStream(file);
		int information = inputStream.read();
		char data;
		
		while(information != -1) {
			data = (char)information;
			stringBuilder.append(data);
			information = inputStream.read();
		}
		inputStream.close();
		
		return stringBuilder.toString();
	}
	
	public static void writeUsingOutputStream(String data, File file)throws IOException{
		OutputStream outputSream = new FileOutputStream(file);
		outputSream.write(data.getBytes());
		outputSream.close();
	}
	public static void writeUsingWriter(String data, File file)throws IOException{
		Writer writer = new FileWriter(file);
		writer.write(data);
		writer.close();
	}
	public static String readUsingReader(File file)throws IOException{
		StringBuilder stringBuilder = new StringBuilder();
		Reader reader = new FileReader(file);
		
		char [] arrayOfChars = new char[100];
		reader.read(arrayOfChars);
		
		for(char runChar : arrayOfChars) {
			stringBuilder.append(runChar);
		}
		reader.close();
		
		return stringBuilder.toString();
	}
}
