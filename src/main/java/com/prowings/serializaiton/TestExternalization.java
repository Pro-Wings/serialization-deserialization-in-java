package com.prowings.serializaiton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student std = new Student(10, "Ram", 30);
		
		File file = new File("myEmployee.txt");

		//Serialization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(std);
		System.out.println("Object written to file successfully!!");
		
		//Deserialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student desrializedStd = (Student) ois.readObject();
		System.out.println("Student after deserialization : "+desrializedStd);

		
	}

}
