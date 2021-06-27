package com.shazone.learn.springboot.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shazone.learn.springboot.models.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{
	
}
