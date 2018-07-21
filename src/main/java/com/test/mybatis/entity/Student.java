package com.test.mybatis.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias(value="Student")
public class Student implements Serializable{
	private int id;
	private String studentno;
	private String name;
	private double grade;
	private int classid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentno() {
		return studentno;
	}
	public void setStudentno(String studentno) {
		this.studentno = studentno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getClassid() {
		return classid;
	}
	public void setClassid(int classid) {
		this.classid = classid;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentno=" + studentno + ", name=" + name + ", grade=" + grade + ", classid="
				+ classid + "]";
	}
}
