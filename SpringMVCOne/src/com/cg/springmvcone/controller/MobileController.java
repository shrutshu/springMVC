package com.cg.springmvcone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.springmvcone.dto.Mobile;

@Controller
public class MobileController {
 
	@RequestMapping(value="/home")
	public String getAllMobile(@ModelAttribute("my") Mobile mob )
	{
		return "AddMobile";
	}
	@RequestMapping(value="adddata",method=RequestMethod.POST)
	public String addMobileData(@ModelAttribute("my") Mobile mobile){
		System.out.println(mobile.getMobileId()+" "+mobile.getMobileName()+" "+mobile.getMobilePrice());
		return "Success";
	}
}
