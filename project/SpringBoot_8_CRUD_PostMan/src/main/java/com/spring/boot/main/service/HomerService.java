package com.spring.boot.main.service;

import com.spring.boot.main.model.Person;

public interface HomerService {

 Person	savedata(Person p);

Iterable<Person> displayAlldata();

Person findbyunandpass(String un, String pa);

void delete(Person un);

Person edit(int un);


}
