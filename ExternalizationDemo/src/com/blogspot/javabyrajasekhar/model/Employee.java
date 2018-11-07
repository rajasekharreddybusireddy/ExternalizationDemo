package com.blogspot.javabyrajasekhar.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	private String eno;
	private String name;
	private String salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String eno, String name, String salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
	}

	public String getEno() {
		return eno;
	}

	public void setEno(String eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		eno = (String) in.readObject();
		name = (String) in.readObject();
		//salary = (String) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(eno);
		out.writeObject(name);
		// out.writeObject(salary);
	}

}
