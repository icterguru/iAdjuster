package com.iadjuster.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class LocalJDBC_EmployeeMain {
	private static SessionFactory sf; 

	public static void main(String[] args) {
		try{
			//sf = new Configuration().configure().buildSessionFactory();
			Configuration cf = new Configuration();
			cf.configure("com/iadjuster/hibernate/hibernate.cfg.xml");
			//cf.configure("assets/configs/hibernate-config.xml"); // AWS_iadjustertest
			sf = cf.buildSessionFactory(); 

		}catch (Throwable ex) { 
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex); 
		}
		LocalJDBC_EmployeeMain ME = new LocalJDBC_EmployeeMain();

		/* Add few employee records in database */
		Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
		Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
		Integer empID3 = ME.addEmployee("John", "Paul", 10000);

		/* List down all the employees */
		ME.listEmployees();

		/* Update employee's records */
		ME.updateEmployee(empID1, 5000);

		/* Delete an employee from the database */
		ME.deleteEmployee(empID2);

		/* List down new list of the employees */
		ME.listEmployees();
	}
	/* Method to CREATE an employee in the database */
	public Integer addEmployee(String fname, String lname, int salary){
		Session session = sf.openSession();
		Transaction tx = null;
		Integer employeeID = null;
		try{
			tx = session.beginTransaction();
			Employee employee = new Employee(fname, lname, salary);
			employeeID = (Integer) session.save(employee); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
		return employeeID;
	}
	/* Method to  READ all the employees */
	public void listEmployees( ){
		Session session = sf.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee").list(); 
			for (Iterator iterator = 
					employees.iterator(); iterator.hasNext();){
				Employee employee = (Employee) iterator.next(); 
				System.out.print("First Name: " + employee.getFirstName()); 
				System.out.print("  Last Name: " + employee.getLastName()); 
				System.out.println("  Salary: " + employee.getSalary()); 
			}
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}
	/* Method to UPDATE salary for an employee */
	public void updateEmployee(Integer EmployeeID, int salary ){
		Session session = sf.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Employee employee = 
					(Employee)session.get(Employee.class, EmployeeID); 
			employee.setSalary( salary );
			session.update(employee); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}
	/* Method to DELETE an employee from the records */
	public void deleteEmployee(Integer EmployeeID){
		Session session = sf.openSession();
		Transaction tx = null;
		try{
			tx = session.beginTransaction();
			Employee employee = 
					(Employee)session.get(Employee.class, EmployeeID); 
			session.delete(employee); 
			tx.commit();
		}catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}finally {
			session.close(); 
		}
	}
}