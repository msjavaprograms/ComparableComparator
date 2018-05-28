package com.msjava.client;

import java.util.Comparator;

import com.msjava.model.Employee;

public class EmployeeComparatorByIdByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int flag;
		flag = o1.getId() - o2.getId();
		if (flag == 0)
			flag = o1.getName().compareTo(o2.getName());
		return flag;
	}

}
