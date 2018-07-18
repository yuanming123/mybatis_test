package com.test.mybatis.entity;

import java.util.List;

public class StudentClass {
	private int id;
	private String number;
	private String classname;
	private List<Student> studentList;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	@Override
	public String toString() {
		return "StudentClass [id=" + id + ", number=" + number + ", classname=" + classname + ", studentList="
				+ studentList + "]";
	}
}
