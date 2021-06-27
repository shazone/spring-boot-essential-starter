package com.shazone.learn.springboot;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Runner implements CommandLineRunner {
	private final RabbitTemplate rabbitTemplate;
	private final ObjectMapper objectMapper;

	@Autowired
	private ConfigurableApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		int index;// = (int) ((Math.random()) * (28-1)) + 1;
		AsyncPayload payload;
		
		for(int i=0;i<10;i++) {
			index = (int) ((Math.random()) * (28-1)) + 1;
			payload = new AsyncPayload();
			System.out.println("ROOM to be cleaned: id ==>"+index);
			payload.setId(index);
			payload.setModel("ROOM");
			rabbitTemplate.convertAndSend("operation", "shazonehotel.room.cleaner",objectMapper.writeValueAsString(payload));	
		}
				
		context.close();
	}

}
