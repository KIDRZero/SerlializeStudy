package com.bbb.test;

public class Student extends Person {
   private int score;



public Student(String name, char sex, int year, double age, int score) {
	super(name, sex, year, age);
	this.score = score;
}



public int getScore() {
	return score;
}



public void setScore(int score) {
	this.score = score;
}
   
}
