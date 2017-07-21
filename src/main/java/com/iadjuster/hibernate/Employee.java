package com.iadjuster.hibernate;

// http://www.tutorialspoint.com/hibernate/hibernate_mapping_files.htm
/**
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

public class Employee {
	private int id;

	private String firstName;
	private String lastName;
	private int salary;  

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {}
	public Employee(String fname, String lname, int salary) {
		this.firstName = fname;
		this.lastName = lname;
		this.setSalary(salary);
	}

}
