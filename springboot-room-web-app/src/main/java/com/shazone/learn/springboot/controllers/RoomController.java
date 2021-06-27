package com.shazone.learn.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shazone.learn.springboot.service.RoomService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/rooms")
@AllArgsConstructor
public class RoomController {
	
	private final RoomService roomService;
	
	@GetMapping
	public String getAllRooms(Model model) {
		model.addAttribute("rooms", roomService.getAllRooms());
				
		return "rooms";
	}

}
