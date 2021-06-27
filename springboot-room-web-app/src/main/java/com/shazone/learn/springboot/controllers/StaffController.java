package com.shazone.learn.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shazone.learn.springboot.service.StaffService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/staffs")
public class StaffController {
	
	private final StaffService staffService;
	
	
	@GetMapping
	public String getAllStaffs(Model model) {
		model.addAttribute("staffs", staffService.getAllStaffs());
		return "staffs";
	}

}
