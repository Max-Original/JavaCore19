package javacore19practise;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ApplicationRandomAccessFile {

	public static void main(String[] args) throws Exception {
		
		File file = new File("randomAccessFile.txt");
		String data = "Custom text Custom text Custom text Custom text Custom text Custom text";
		
		writeToFile(file, 0, data);
		
		writeToFile(file, 10, "13 13 13 13 13 13");
		System.out.println(readFromFile(file, 0, 100));
		
	}
	public static void writeToFile(File file,int position,String data) throws IOException{
		RandomAccessFile files = new RandomAccessFile(file,"rw");
		files.seek(position);
		files.write(data.getBytes());
		files.close();
	}
	public static String readFromFile(File file, int position, int size) throws IOException{
		StringBuilder stringBuilder = new StringBuilder();
		RandomAccessFile randomAccess = new RandomAccessFile(file, "rw");
		randomAccess.seek(position);
		byte [] bytes = new byte[size];
		randomAccess.read(bytes);
		randomAccess.close();
		
		for(byte run : bytes) {
			stringBuilder.append((char)run);
		}
		
		return stringBuilder.toString();
	}
}

