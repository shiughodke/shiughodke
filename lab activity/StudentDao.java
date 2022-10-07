package com.Sprint2.dao;

public interface StudentDao {
   
	//fetch student detail from db table
	public void getStudentBy();
	
	//saving new student detail into db table
	public void addStudent();
	
	//changing existing student detail from db table
	public void updateStudent();
	
	//remove existing student detail from db table
	public void deleteStudent();
	
}
