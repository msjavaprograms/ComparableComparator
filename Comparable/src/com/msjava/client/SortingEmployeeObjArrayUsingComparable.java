package com.msjava.client;

import java.util.Arrays;

import com.msjava.model.Employee;

public class SortingEmployeeObjArrayUsingComparable {

	public static void main(String[] args) {
		
		// sorting object array
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Muthu", 25, 10000);
		empArr[1] = new Employee(20, "Sridhar", 29, 20000);
		empArr[2] = new Employee(5, "Suresh", 35, 5000);
		empArr[3] = new Employee(1, "Ashwin", 32, 50000);
		
		//sorting employees array using Comparable interface implementation
		// Comparable implement Custome Employee class in sorting by  salary refer employee class
		Arrays.sort(empArr);
		for (Employee employee : empArr) {
			System.out.println(employee);
		}
		//System.out.println(Arrays.toString(empArr));
	}
}
