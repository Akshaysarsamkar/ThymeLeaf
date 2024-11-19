package com.example.demo.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Mycontroller {
	
	@RequestMapping(path = "/home" , method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name","Akshay kumar");
		model.addAttribute("date",LocalDate.now());
		return "home";
	}
	
	
	@GetMapping("/iteration_array")
	public String IterationArray(Model m) {
		String array[] = {"AKshay","Karan","Pankaj","Sandip"};
		m.addAttribute("names", array);
		return "iteration";
	}
	
	@GetMapping("/list")
	public String IterationList(Model m) {
		
		List<String> car = new ArrayList<>();
		
		car.add("BMW");
		car.add("Oddi");
		car.add("Tata");
		car.add("Suzuki");
		
		m.addAttribute("carname", car);
		
		return "list";
	}
	
	@GetMapping("/cs")
	public String conditionalStatement(Model m) {
		m.addAttribute("ShopStatus",false);
		m.addAttribute("gender","m");
		m.addAttribute("number","karan");
		return "conditional"; 
	}
	
	@GetMapping("/child")
	public String InheritanceTemplate() { 
		return "Child";
	}
	
	@GetMapping("/navbar")
	public String InheritanceTemplate1(Model m) { 
		m.addAttribute("title","Inheritance template");
		m.addAttribute("name","Akshay");
		m.addAttribute("age",89);

		return "navbar";
	}

}
