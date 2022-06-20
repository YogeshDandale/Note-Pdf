package com.crud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.doa.Dao;
import com.crud.model.Employee;
import com.crud.serviceI.ServiceI;
@Service
public class ServiceImpl  implements ServiceI{

	@Autowired
	Dao di;
	@Override
	public List<Employee> getalldata() {
		
		return di.getalldata();
	}
	@Override
	public int postdata(Employee e) {
		
		return di.postdata(e);
	}
	@Override
	public Employee editdata(Employee e) {
		
		return di.editdata(e);
	}
	@Override
	public int update(Employee e) {
		
		return di.update(e);
	}
	@Override
	public int delete(int i) {
		
		return di.delete(i);
	}

}
