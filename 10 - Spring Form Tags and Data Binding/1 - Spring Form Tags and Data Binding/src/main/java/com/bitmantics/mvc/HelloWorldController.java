package com.bitmantics.mvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormVersionTwo(HttpServletRequest request, Model model) {
		String StudentName = request.getParameter("studentName");
		StudentName = StudentName.toUpperCase();
		model.addAttribute("Message",StudentName);
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("studentName") String StudentName,
			Model model) {
/*		String StudentName = request.getParameter("studentName");*/
		StudentName = StudentName.toUpperCase();
		model.addAttribute("Message",StudentName);
		return "helloWorld";
	}
	
}
