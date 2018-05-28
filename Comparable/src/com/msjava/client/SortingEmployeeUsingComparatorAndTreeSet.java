package com.msjava.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.msjava.model.Employee;

public class SortingEmployeeUsingComparatorAndTreeSet {

	public static void main(String[] args) {
		// sorting list of objects of Wrapper classes
		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("S");
		strList.add("H");
		strList.add("W");
		strList.add("I");
		strList.add("N");
		Collections.sort(strList);
		for (String str : strList) {
			System.out.print(" " + str);
		}
		System.out.println("");
		//Set<Employee> setEmployeeObject2 = new TreeSet<Employee>(sortByName);

		// List of Employee object
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(10, "Muthu", 25, 10000));
		empList.add(new Employee(10, "Sridhar", 29, 20000));
		empList.add(new Employee(5, "Suresh", 35, 5000));

		Set<Employee> setEmployeeObject1 = new TreeSet<Employee>(sortByName);
		for (Employee employee : empList) {
			// check employee Name added already in set else add employee object
			// in set
			// if id is equal then check the name are equals
			if (!setEmployeeObject1.contains(employee)) {
				setEmployeeObject1.add(employee);
			}
		}
		System.out.println("*********");
		System.out.println("" + setEmployeeObject1);

	}

	/**
	 * Comparator to sort employees list or array in order of Name
	 */
	public static Comparator<Employee> sortByName = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

	/**
	 * Comparator to sort employees list or array in order of id
	 */
	public static Comparator<Employee> sortById = new Comparator<Employee>() {
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
	public static Comparator<Employee> sortByIdName = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			int flag;
			flag = o1.getId() - o2.getId();
			if (flag == 0)
				flag = o1.getName().compareTo(o2.getName());
			return flag;
		}
	};

	

}
