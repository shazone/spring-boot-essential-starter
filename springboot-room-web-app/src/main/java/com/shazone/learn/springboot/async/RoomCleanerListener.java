package com.shazone.learn.springboot.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shazone.learn.springboot.models.Room;
import com.shazone.learn.springboot.service.RoomService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class RoomCleanerListener {
	private static Logger LOG = LoggerFactory.getLogger(RoomCleanerListener.class);
	
	private final ObjectMapper mapper;
	private final RoomService roomService;
	
	public void receiveMessage(String message) {
		//LOG.warn("receiveMessage:::::::"+message);
		try {
			AsyncPayload  payload = mapper.readValue(message, AsyncPayload.class);
			//LOG.warn("payload.getModel()::::"+payload.getModel());
			if("ROOM".equals(payload.getModel())) {
				//LOG.warn("payload.getId():::::::"+payload.getId());
				Room room = roomService.getById(payload.getId());
				
				LOG.info("ROOM {}:{} needs to be cleaned", room.getNumber(), room.getName());
			}else {
				LOG.warn("Unknown model type");
			}

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	

}
