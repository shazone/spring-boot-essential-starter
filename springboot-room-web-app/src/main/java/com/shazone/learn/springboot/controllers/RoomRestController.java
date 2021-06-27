package com.shazone.learn.springboot.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shazone.learn.springboot.service.RoomService;
import com.shazone.learn.springboot.models.Room;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/rooms")
@AllArgsConstructor
public class RoomRestController {
	private final RoomService roomService;
	
	@GetMapping
	public List<Room> getAllRoom(){
		return roomService.getAllRooms();
	}

}
