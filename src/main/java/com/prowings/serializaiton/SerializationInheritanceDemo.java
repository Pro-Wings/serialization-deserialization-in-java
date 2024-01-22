package com.prowings.serializaiton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationInheritanceDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person p1 = new Person("male", 5.10f, 65);
		
		Employee emp1 = new Employee(10, "Ram", "Female", 5.5f, 55);
		
		System.out.println(emp1);
		System.out.println("Gender : "+ emp1.getGender());
		System.out.println("Height : "+ emp1.getHeight());
		System.out.println("Weight : "+ emp1.getWeight());
		
		File file = new File("EmployeeInheritance.txt");

		//Serialization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("Object written to file successfully!!");
		
		//Deserialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
//		Person desrializedPerson = (Person) ois.readObject();
		Employee desrializedEmp = (Employee) ois.readObject();
		System.out.println("Employee after deserialization : "+desrializedEmp);
		System.out.println("Gender : "+ desrializedEmp.getGender());
		System.out.println("Height : "+ desrializedEmp.getHeight());
		System.out.println("Weight : "+ desrializedEmp.getWeight());
//		System.out.println(desrializedEmp.getCountry());
//		System.out.println(desrializedPerson);
	}

}
