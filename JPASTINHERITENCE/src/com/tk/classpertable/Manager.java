package com.tk.classpertable;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "mge_table")
public class Manager extends Employee{

	private static final long serialVersionUID = 1L;
	
	String dpartmentName;
	
	public String getDpartmentName() {
		return dpartmentName;
	}
	public void setDpartmentName(String dpartmentName) {
		this.dpartmentName = dpartmentName;
	}
	
	

}
