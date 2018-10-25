package com.cg.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Employeecontrol {

	@RequestMapping(value="/work")
	public String getAllDetails()
	{
		return "EmployeeOne";
	}
}
