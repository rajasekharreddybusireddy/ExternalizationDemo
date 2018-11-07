package com.blogspot.javabyrajasekhar.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableExample {

	public static void main(String[] args) {

		Employee employee = new Employee("1", "rajasekhar", "50000");

		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream((new FileOutputStream("employee.txt")));
			objectOutputStream.writeObject(employee);
			objectOutputStream.close();

			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee.txt"));
			Employee emp = (Employee) objectInputStream.readObject();
			System.out.println(emp.getEno());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			objectInputStream.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
