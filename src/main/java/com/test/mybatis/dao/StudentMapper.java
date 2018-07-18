package com.test.mybatis.dao;

import java.util.List;

import com.test.mybatis.entity.Student;

public interface StudentMapper {
	public List<Student> queryStudentByName(Student student);
	
	public List<Student> queryStudent();
}
