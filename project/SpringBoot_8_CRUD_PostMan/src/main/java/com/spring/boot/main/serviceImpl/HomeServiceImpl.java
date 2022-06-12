package com.spring.boot.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.main.model.Person;
import com.spring.boot.main.repository.HomeRepository;
import com.spring.boot.main.service.HomerService;

@Service
public class HomeServiceImpl implements HomerService {

	@Autowired
	HomeRepository hr;
	@Override
	public Person savedata(Person p) {
		
		return hr.save(p);
	}
	@Override
	public Iterable<Person> displayAlldata() {
		Iterable<Person> all = hr.findAll();
		
		return all;
	}
	@Override
	public Person findbyunandpass(String un, String pa) {
		
		return hr.findByUnameAndPass(un,pa);
	}
	@Override
	public void delete(Person un) {
		hr.delete(un);

	}
	@Override
	public Person edit(int un) {
		
		return hr.findBySid(un);
	}
	
	

}
