package com.tk.singletableinheritence;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="information")

@Inheritance(strategy=InheritanceType.SINGLE_TABLE)	

@DiscriminatorColumn(name ="emp_type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("EMP")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int eid;
	String name;
	int salary;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		
	}
	
	
	
	
	
	

}
