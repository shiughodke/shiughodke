package com.HbOnetoOne;

	
	import java.util.Iterator;
	import java.util.List;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;

import HbOnetoOne.Entity.Address;
import HbOnetoOne.Entity.Employee;

public class FetchData {

		@SuppressWarnings({"rawtypes","deprecation","unchecked"})
		
		public static void main(String[] args) {
			
	        SessionFactory sf =  new Configuration().configure().buildSessionFactory();
	         
	         //open an connection with db & session object perform CRUD 
	         Session s = sf.openSession();
	         
	         //save permanently any operation performed on db
	         Transaction t = s.beginTransaction();
	        
	 		 Query q = s.createQuery("from Employee");
	 		List<Employee> al= q.getResultList();
	 		
	 		Iterator<Employee> itr = al.iterator();
	 		while(itr.hasNext()) {
	 			Employee em = itr.next();
	 		
	 		
	 		System.out.println(em.getEid()+ " " + em.getEname() + " " + em.getProfile() + " " + em.getDept());
	 		
	 		Address addr = em.getAddress();
	 		System.out.println(addr.getAid() + " " + addr.getAddr() + " " + addr.getCity() + " " + addr.getState() + " " + addr.getPincode());
	 		
	 		s.close();
	        sf.close(); 
	 		}
		  }

	     }



