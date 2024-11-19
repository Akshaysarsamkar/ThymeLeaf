package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Entity.Product;
import com.example.demo.Entity.Student;

@Controller
public class DemoExample {

	@GetMapping("/Example")
	public String IterationExample1(Model m) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("Akshay", "A"));
		list.add(new Student("sam", "B"));
		list.add(new Student("suraj", "C"));

		m.addAttribute("list", list);

		return "StudentGrade";
	}

	@GetMapping("/Example1")
	public String IterationExample2(Model m) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("Pen", 52.45f));
		list.add(new Product("Book", 88.25f));
		list.add(new Product("Notebook", 87f));
		list.add(new Product("earezer", 87.98f));

		m.addAttribute("list", list);

		return "ProductPrice";
	}

	@GetMapping("/user")
	public String ConditionalStatement1(Model m) {
		m.addAttribute("role", "Admin");
		m.addAttribute("membership", "NotActive");
		return "user";
	}

	@GetMapping("/include")
	public String IncludeFragment() {
		return "include";
	}

	@GetMapping("/insert")
	public String insertFragment(Model m) {
		m.addAttribute("title", "this is title of inser fragment");
		m.addAttribute("name", "AkshayKumar");
		m.addAttribute("age", 45);

		return "insert";
	}

	@GetMapping("/replace")
	public String replacefragment() {
		return "replace";
	}
	
	@GetMapping("/switch1")
	public String Switch1Example(Model m) {
		m.addAttribute("AccountStatus", "Banned");
		return "switch";
	}

}
