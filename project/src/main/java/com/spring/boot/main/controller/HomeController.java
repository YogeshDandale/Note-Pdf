package com.spring.boot.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.main.model.Person;
import com.spring.boot.main.service.HomerService;

@RestController
public class HomeController {

	@Autowired
	HomerService hs;
	
	//insert data
	@RequestMapping(value = "/savedata",method = RequestMethod.POST)
	public String  saved(@RequestBody Person p)
	{
			
			Person pp=hs.savedata(p);
			
		return "SuccessFullySave";
		
	}
	//All User
	@RequestMapping(value = "/displayalldata" ,method = RequestMethod.GET)
	public Iterable<Person> displayA()
	{
		Iterable<Person>list=hs.displayAlldata();
	
		return list;
		
	}
	//for single user
	@GetMapping(value = "/login/{uname}/{pass}")
	public Person Logcheck(@PathVariable("uname")String un,@PathVariable("pass") String pa)
	{
		Person s=hs.findbyunandpass(un,pa);
		
		return s;
	}
	
	@RequestMapping(value ="/update/{sid}",method = RequestMethod.PUT)
	public Person update(@PathVariable("sid")int un,@RequestBody Person p)
	{
		Person pp=hs.edit(un);
		hs.savedata(p);
		return pp;
		
	}
	@RequestMapping(value ="/update2/{sid}",method = RequestMethod.PATCH)
	public Person update2(@PathVariable("sid")int un,@RequestBody Person p)
	{
		Person pp=hs.edit(un);
		hs.savedata(p);
		return pp;
		
	}
	
	
	@RequestMapping(value = "/delete/{sid}" ,method = RequestMethod.DELETE)
	public String delete(@ModelAttribute Person un)
	{
		hs.delete(un);
		
		return "successFully";
	}
}
