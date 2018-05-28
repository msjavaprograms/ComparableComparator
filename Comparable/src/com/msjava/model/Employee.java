package com.msjava.model;

public class Employee implements Comparable<Employee>{

	private int id;
    private String name;
    private int age;
    private long salary;
	
	//constructor    
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	// Getter setter method
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	// toString method to display list values
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age
				+ ", salary=" + salary + "]";
	}


	// Compares this object with the specified object for order
    // for example sorting by salary
	@Override
	public int compareTo(Employee empObj) {
		if (this.getSalary() == empObj.getSalary())
			return 0;
		else if (this.getSalary() > empObj.getSalary())
			return 1;
		else
			return -1;
	}
    
}
