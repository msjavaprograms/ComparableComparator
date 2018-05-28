package com.msjava.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.msjava.model.Employee;

public class SortingEmployeeListOfObjUsingComparator {
	public static void main(String args[]) {
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(new Integer(10));
		integerList.add(new Integer(20));
		List<String> stringList = new ArrayList<String>();
		stringList.add(new String("Agnisha"));
		stringList.add(new String("Anu"));
		// List of Integer will work, List of String will work
		Collections.sort(integerList);
		Collections.sort(stringList);

		// List of Employee object
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Muthu", 25, 10000));
		empList.add(new Employee(20, "Sridhar", 29, 20000));
		empList.add(new Employee(5, "Suresh", 35, 5000));
		//empList.add(new Employee(1, "Ashwin", 32, 50000));
		// List of employee object is not working.
		// We are specifying which object (Salary) to sort to comparable method.
	/*	Collections.sort(empList);
		for (Employee employee : empList) {
			System.out.println(employee);
		}*/

		/**
	     * Comparator to sort employees list or array in order of id
	     */
		Comparator<Employee> sortById = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getId() == o2.getId())
					return 0;
				else if (o1.getId() > o2.getId())
					return 1;
				else
					return -1;
			}
		};
		
		/**
	     * Comparator to sort employees list or array in order of Name
	     */
		Comparator<Employee> sortByName = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		
		/**
	     * Comparator to sort employees list or array in order of Age
	     */		
		Comparator<Employee> sortByAge = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {				
				return o1.getAge() - o2.getAge();
			}			
		};
	
		/**
		 * Comparator to sort employees list or array in order of Name
		 */
		Comparator<Employee> sortByIdName = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				int flag;
				flag = o1.getId() - o2.getId();
				if (flag == 0)
					flag = o1.getName().compareTo(o2.getName());
				return flag;
			}
		};

		// pass object and comparator object - sort by id 
		System.out.println("Sort by ID : ");
		System.out.println("--------------");
		Collections.sort(empList, sortById);
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("Sort by Name : ");
		System.out.println("--------------");
		// pass object and comparator object - sort by name 
		Collections.sort(empList, sortByName);
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		System.out.println("Sort by Age :");
		System.out.println("--------------");
		// pass object and comparator object - sort by age 
		Collections.sort(empList, sortByAge);
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		System.out.println("\n Sort by Id and Name :");
		System.out.println("--------------");
		// pass object and comparator object - sort by age 
		Collections.sort(empList, sortByIdName);
		for (Employee employee : empList) {
			System.out.println(employee);
		}
	}
}











 