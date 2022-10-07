package com.Sprint2.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Sprint2.config.HibernateUtil;
import com.Sprint2.dao.StudentDao;
import com.Sprint2.entity.Student;

public class StudentDaoimpl implements StudentDao {
	
	 Scanner sc = new Scanner(System.in);
	  	Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		

	public void getStudentBy() {
		//	  	Session s = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Student id");
		int i = sc.nextInt();
		Student st = s.get(Student.class,i);
		System.out.println(st.getSid()+" "+ st.getFname()+" "+st.getLname()+" "+ st.getSemail()+" "+ st.getSaddres()+" "+st.getSphone());
		
	}

	@SuppressWarnings({ "deprecation" })
	public void addStudent() {
		//	  	Session s = HibernateUtil.getSessionFactory().openSession();
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		String  f,l,e,a;
		long p;

		System.out.println("Enter fisrt name");
		f = sc.next();
		
		System.out.println("Enter last name");
		l = sc.next();
		
		System.out.println("Enter email id");
		e = sc.next();
		
		System.out.println("Enter addres");
		a = sc.next();
		
		System.out.println("Enter phone No");
		p = sc.nextLong();
		
		Student s1 = new Student();
		s1.setFname(f);
		s1.setLname(l);
		s1.setSemail(e);
		s1.setSaddres(a);
		s1.setSphone(p);
		
		s.save(s1);
		t.commit();
	}
	 @SuppressWarnings({ "deprecation" })
	public void updateStudent() {
    // 	Session s = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter Student id");
		int i = sc.nextInt();
		Student st1 = s.get(Student.class,i);
		System.out.println("Enter Student email id");
		String e = sc.next();
		st1.setSemail(e);		
		s.update(st1);
		t.commit();
		
	}

	@SuppressWarnings("deprecation")
	public void deleteStudent() {
   // 	Session s = HibernateUtil.getSessionFactory().openSession();
	     System.out.println("Enter Student adress");
	     int i = sc.nextInt();
		 Student st2 = s.get(Student.class,i);
		 s.delete(st2);
		 System.out.println("delete successfully");
		 t.commit();
	}

}
