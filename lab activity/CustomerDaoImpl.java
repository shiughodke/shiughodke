package com.Sprint1.daoimpl;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Sprint1.config.HibernateUtil;
import com.Sprint1.dao.CustomerDao;
import com.Sprint1.entity.Coustomer;


public class CustomerDaoImpl implements CustomerDao {
      
      Scanner sc = new Scanner(System.in);
  	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction t = session.beginTransaction();
	
	
	public void getCustomerBy() {
	//  	Session s = HibernateUtil.getSessionFactory().openSession();
     System.out.println("Enter Customer id");
     int i = sc.nextInt();
 	Coustomer cd = session.get(Coustomer.class,i);
     System.out.println(cd.getCid()+" "+cd.getCfname()+" "+cd.getClname()+" "+cd.getCphone()+" "+cd.getCemail()+" "+cd.getCaddr());
			
	}
	
	@SuppressWarnings("deprecation")
	public void addCustomer() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		String f,l,e,a;
		Long p;
		System.out.println("Enter first name");
		f = sc.next();
		
		System.out.println("Enter last name");
		l = sc.next();
		
		System.out.println("Enter email id");
		e = sc.next();
		
		System.out.println("Enter address");
		a = sc.next();
		
		System.out.println("Enter phone number ");
		 p = sc.nextLong();
		 
		 Coustomer c = new Coustomer();
		 c.setCfname(f);
		 c.setClname(l);
		 c.setCemail(e);
		 c.setCaddr(a);
		 c.setCphone(p);
		 
	      session.save(c);
		 t.commit();     
		
	}

	@SuppressWarnings("deprecation")
	public void updateCustomer() {
		//Session s = HibernateUtil.getSessionFactory().openSession();
       System.out.println("Enter Customer id");
       int i = sc.nextInt();
       Coustomer cd1 = session.get(Coustomer.class,i);
       System.out.println("Enter Customer phone number");
       long pp = sc.nextLong();
       cd1.setCphone(pp);
       session.update(cd1);
       t.commit();
       
	}

	@SuppressWarnings("deprecation")
	public void deleteCustomer() {
   // 	Session s = HibernateUtil.getSessionFactory().openSession();
	       System.out.println("Enter Customer id");
	       int i = sc.nextInt();
	       Coustomer cd2 = session.get(Coustomer.class,i);
	       session.delete(cd2);
	       System.out.println("delete successfully");
	       t.commit();
	       
		
	}

}

