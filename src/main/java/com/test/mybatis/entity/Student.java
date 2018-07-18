package com.test.mybatis.entity;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;

@Alias(value="Student")
public class Student {
	private int id;
	private String studentno;
	private String name;
	private BigDecimal grade;
	
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
	public BigDecimal getGrade() {
		return grade;
	}
	public void setGrade(BigDecimal grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentno=" + studentno + ", name=" + name + ", grade=" + grade + "]";
	}
}
