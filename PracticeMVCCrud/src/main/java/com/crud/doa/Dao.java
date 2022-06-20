package com.crud.doa;

import java.util.List;

import com.crud.model.Employee;

public interface Dao {

public	List<Employee> getalldata();

public int postdata(Employee e);

public Employee editdata(Employee e);

public int update(Employee e);

public int delete(int i);

}
