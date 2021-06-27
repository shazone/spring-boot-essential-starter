package com.shazone.learn.springboot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shazone.learn.springboot.service.StaffService;
import com.shazone.learn.springboot.models.StaffMember;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/staffs")
@AllArgsConstructor
public class StaffRestController {
	private final StaffService staffService;
	
	@GetMapping
	public List<StaffMember> getAllStaffs(){
		return staffService.getAllStaffs();
	}

}
