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
    	 SqlSession sqlSession= sqlSessionFactory.openSession();
    	  //通过SqlSession操作数据库
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
    	Student student = new Student();
    	student.setName("张三");
    	List<Student> list = sqlSession.selectList("queryStudent",student);
    	Iterator<Student> it = list.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next().toString());
    	}
        
      //释放资源
      sqlSession.close();
	}
}
