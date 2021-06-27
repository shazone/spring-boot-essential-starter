package com.shazone.learn.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shazone.learn.springboot.data.RoomRepository;
import com.shazone.learn.springboot.models.Room;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class RoomService {
	
	private final RoomRepository roomRepository;
	
	
	public List<Room> getAllRooms() {
		return roomRepository.findAll();
	}


	public Room getById(long id) {
		return roomRepository.getById(id);
	}
}
