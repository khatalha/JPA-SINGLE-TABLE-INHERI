package com.tk.singletableinheritence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR")
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
