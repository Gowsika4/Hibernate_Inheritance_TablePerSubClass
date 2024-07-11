package com.model;

import jakarta.persistence.*;

@Entity  
@Table(name="EMP100")
@Inheritance(strategy=InheritanceType.JOINED)

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;


public Employee(){
	super();
}
public  Employee(String name) {
	super();
	this.name=name;
}
public Employee(int id,String name) {
	super();
	this.id=id;
	this.name=name;
	
}
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
