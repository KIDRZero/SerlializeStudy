package com.bbb.test2;



import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	transient private char sex;
	private int year;
	private double age;

	public Person(String name, char sex, int year, double age) {
		super();
		this.name = name;
		this.sex = sex;
		this.year = year;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}
    private void writeObject(ObjectOutputStream out) throws IOException{
    	out.defaultWriteObject();
    	out.writeChar(sex);
    	
    }
    private void readObject(ObjectInputStream in) throws ClassNotFoundException, IOException{
    	in.defaultReadObject();
    	sex=in.readChar();
    	
    	
    }
}

