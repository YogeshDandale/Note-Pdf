package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.model.Employee;
import com.crud.serviceI.ServiceI;


@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	ServiceI si;
	
	@RequestMapping("/")
	public String prilogin() {
		return "login";
	}
	@RequestMapping("/log")
	public String log(@RequestParam ("uname")String uname,@RequestParam ("pass") String pass,Model m) {
		List<Employee>list=si.getalldata();
		m.addAttribute("data",list);
		return "success";
	}
	@RequestMapping("/reg")
	public String plogin() {
		return "register";
	}
	
	@RequestMapping("/regp")
	public String reg(@ModelAttribute Employee e,Model m) {
		
		int es=si.postdata(e);
		List<Employee>list=si.getalldata();
		
		if (es > 0) {
			m.addAttribute("data", list);
			return "success";
		} else
		{
			return "login";
		}
		
	}
	@RequestMapping("/edit")
	public String edit(@ModelAttribute Employee e,Model m) {
		Employee d=si.editdata(e);
		m.addAttribute("data", d);
		return "edit";
	}
	@RequestMapping("/update")
	public String update(@ModelAttribute Employee e,Model m) {
		int i=si.update(e);
		List<Employee>list=si.getalldata();
		m.addAttribute("data", list);
		return "success";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") int i, Model m) {
		int sd=si.delete(i);
		List<Employee> list = si.getalldata();
		if (i > 0) {
			m.addAttribute("data", list);
			return "success";
		} else {
			return "login";
		}
	}
}
