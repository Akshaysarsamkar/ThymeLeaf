package com.example.demo.Entity;

public class Student {

	private String name;
	private String grade;

	public Student(String name, String grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
