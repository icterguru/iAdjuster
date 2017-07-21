package com.iadjuster.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//http://www.tutorialspoint.com/hibernate/hibernate_mapping_files.htm
/** https://www.youtube.com/watch?v=yPu6qV5byu4
 * 
 * Before running this program, the Employee table needs to be created using the following command;
 *  
* create table Employee (
id INT NOT NULL auto_increment,
first_name VARCHAR(20) default NULL,
last_name  VARCHAR(20) default NULL,
salary     INT  default NULL,
PRIMARY KEY (id)
);
* @author Dr.Mokter
*
*/


public class InsertEmployeeMain {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		
		cf.configure("com/iadjuster/hibernate/hibernate.cfg.xml");
	
		
		SessionFactory sf = cf.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Employee e = new Employee();
		e.setFirstName("Mokter Hossain");
		e.setLastName("MMH");
		e.setSalary(50000);
		
		s.persist(e);
		
		t.commit();
		s.close();
			
	}

}
