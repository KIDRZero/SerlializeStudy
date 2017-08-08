package com.aaa.test;

import java.io.Serializable;

public class Person2 implements Serializable {
	private String name;
	transient private char sex;
	private int year;
	private double age;

	public Person2(String name, char sex, int year, double age) {
		super();
		this.name = name;
		this.sex = sex;
		this.year = year;
		this.age = age;
	}

	public Person2() {
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

}