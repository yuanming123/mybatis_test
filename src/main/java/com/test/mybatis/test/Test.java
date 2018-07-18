package com.test.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.test.mybatis.dao.StudentMapper;
import com.test.mybatis.entity.Student;
import com.test.mybatis.entity.StudentClass;
import com.test.mybatis.entity.Teacher;

public class Test {
	public static void main(String[] args) throws IOException {
		//获得mybatis的环境配置文件
    	String resource="mybatis-config.xml";
    	InputStream inputStream=Resources.getResourceAsStream(resource);
    	//创建会话工厂
    	SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
    	//通过工厂得到SqlSession
    	 SqlSession sqlSession1= sqlSessionFactory.openSession();
    	  //通过SqlSession操作数据库
    	 //普通查询
    	 StudentMapper studentMapper1 = sqlSession1.getMapper(StudentMapper.class);
    	 List<Student> list = studentMapper1.queryStudent();
    	 Iterator<Student> itList = list.iterator();
    	 while(itList.hasNext()) {
    		 System.out.println(itList.next().toString());
    	 }
    	 sqlSession1.close();
    	 
    	 SqlSession sqlSession2= sqlSessionFactory.openSession();
   	  //通过SqlSession操作数据库
   	 //普通查询
   	 //List<Student> list1 = sqlSession2.selectList("queryStudent");
    	 StudentMapper studentMapper2 = sqlSession2.getMapper(StudentMapper.class);
    	 studentMapper2.queryStudent();
    	 sqlSession2.close();
    	 
    	  //一对一
          /*Teacher teacher =sqlSession.selectOne("queryTeacherById", 1);
          System.out.println();*/
    	 //一对多
    	/*List<StudentClass> list =sqlSession.selectList("queryStudentClass",1);
        Iterator<StudentClass> it = list.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next().toString());
        }*/
    	
    	//pagehelper实现的分页查询 
    	/*PageHelper.startPage(1, 10);
    	List<Student> list = sqlSession.selectList("queryStudent");
    	Iterator<Student> it = list.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next().toString());
    	}*/
    	
    	//动态sql
    	/*Student student = new Student();
    	student.setName("张三");
    	List<Student> list = sqlSession.selectList("queryStudentByName",student);
    	Iterator<Student> it = list.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next().toString());
    	}*/
        
      //释放资源
      //sqlSession.close();
	}
}
