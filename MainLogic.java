package com.mondee;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  

public class MainLogic {

	public static void main(String[] args) {

		
		Session session = HibernateUtil.getSessionFactory().openSession();

	    Transaction t = session.beginTransaction();
	    
	
	    Student s1=new Student();    
	    
	      //Insert Query:
	    s1.setSid(1);    
	    s1.setSname("Swathi");    
	    s1.setSmarks(45);  
	    
	    session.save(s1);  
	    t.commit();  
		session.close();

	}

}
