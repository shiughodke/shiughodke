package com.HbOnetoManyUni.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.HbOnetoManyUni.Entity.Students;
import com.HbOnetoManyUni.Entity.Trainer;
import com.HbOnetoManyUni.config.HibernateUtil;
import com.HbOnetoManyUni.dao.TrainerDao;

public class TrainerDaoImpl implements TrainerDao{
	@SuppressWarnings("deprecation")

	public void addTrainer() {
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		
    	Trainer tt = new Trainer (); //// Create Trainer object
    	tt.setTname("Sami");
    	tt.setCname("java");
    	tt.setDesignation("Map");
    	
    	Students ss = new Students();
    	ss.setAid(104);
    	ss.setName("Shubham");
    	ss.setEmail("Shubham@gmail.com");
    	ss.setPhone(965425629);
    	
    	
    	Students ss1 = new Students(); // Create student object
    	ss1.setAid(105);
    	ss1.setName("Shivani");
    	ss1.setEmail("shivani@gmail.com");
    	ss1.setPhone(964891238);
    	
    	
    	ArrayList<Students> a1 = new ArrayList<Students>(); 
    	a1.add(ss); // calling
    	a1.add(ss1);
    	
    	tt.setStudents(a1); // set student data with trainer object
    	s.save(tt); // save object
    	t.commit(); // commit
    	s.close();  // close object
    	
    	
    	
	}

	@SuppressWarnings("deprecation")
	public void fetchTrainer() {
		
    	Session s = HibernateUtil.getSessionFactory().openSession();
        Query<Trainer> q = s.createQuery("from Trainer");
        List ll = q.getResultList();
        
        Iterator<Trainer> itr = ll.iterator();
		while(itr.hasNext()) {
			Trainer ta = itr.next();
			System.out.println(ta.getTname() + " " + ta.getCname());
			
			List<Students> all = ta.getStudents();
			Iterator<Students> itr2 = all.iterator();
			while(itr2.hasNext()) {
				Students stu = itr2.next();
				System.out.println(stu.getName() + " "+ stu.getPhone() + " " + stu.getEmail());
			}
			
		}
		s.close();
		
        
        
		
	}

}
