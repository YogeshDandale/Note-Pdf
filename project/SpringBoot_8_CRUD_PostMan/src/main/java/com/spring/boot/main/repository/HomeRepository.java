package com.spring.boot.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.main.model.Person;

@Repository
public interface HomeRepository  extends CrudRepository<Person, Integer>{

	Person findByUnameAndPass(String un, String pa);
		Person findBySid(int un);
}
