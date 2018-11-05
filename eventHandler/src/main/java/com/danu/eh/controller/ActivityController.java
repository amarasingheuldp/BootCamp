package com.danu.eh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danu.eh.model.Activity;

@Controller
//@RequestMapping(value="/app")
public class ActivityController {
	
	@RequestMapping(value="/greeting")
	public String getWelcomeMessage(Model model){
		model.addAttribute("msg", "Hi Spring, you awsome");
		return "welcome";
	}
	
	@RequestMapping(value="/addActivity")
	public String addActivity(@ModelAttribute("activities") Activity activity){
		System.out.println(activity.getActivityName());
		//return "forward:addSubActivity";
		
		if(activity.getActivityName()==null){
			return "addActivity";
		}else{
			//return "redirect:addSubActivity.html";//value not coming to this loop
			return "forward:addSubActivity.html";
		}
	}
	
	@RequestMapping(value="/addSubActivity")
	public String addSubActivity(@ModelAttribute("activities") Activity activity){
		System.out.println("Sub activity is " + activity.getActivityName());
		return "addActivity";
	}

}
