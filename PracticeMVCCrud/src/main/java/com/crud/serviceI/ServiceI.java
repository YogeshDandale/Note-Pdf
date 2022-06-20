package com.crud.serviceI;

import java.util.List;

import com.crud.model.Employee;

public interface ServiceI {

	public List<Employee> getalldata();

	public int postdata(Employee e);

	public Employee editdata(Employee e);

	public int update(Employee e);

	public int delete(int i);

}
