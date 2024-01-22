package com.prowings.serializaiton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
//		Employee emp1 = new Employee(10, "Ram");
		
//		System.out.println(emp1);
		
		File file = new File("myEmployee.txt");

		//Serialization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp1);
		System.out.println("Object written to file successfully!!");
		
		//Deserialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee desrializedEmp = (Employee) ois.readObject();
		System.out.println("Employee after deserialization : "+desrializedEmp);
		System.out.println(desrializedEmp.getCountry());
	}

}
