package com.shazone.learn.springboot;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.shazone.learn.springboot.model.Room;


@SpringBootApplication
public class SpringbootRoomCliAppApplication {
	private static final Logger LOG = LoggerFactory.getLogger(SpringbootRoomCliAppApplication.class);
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			LOG.info("Starting CLR application");
			ResponseEntity<List<Room>> rooms = restTemplate.exchange("http://localhost:8080/api/rooms", 
					HttpMethod.GET, null, new ParameterizedTypeReference<List<Room>>() {
					});
			rooms.getBody().forEach(room->{
				LOG.info(room.toString());
			});
			
			LOG.info("Finishing CLR application");
			
			LOG.info("-------------------FIZ BUZZZ------------------");
			for(int i=1;i<=100;i++) {
				if(i%3==0 && i%5==0) {
				  LOG.info("==> FIZZBUZZ "+i);
				}else if(i%3==0) {
					LOG.info("==> FIZZ "+i);
				}else if(i%5==0) {
					LOG.info("==> BUZZ "+i);
				}else {
					LOG.info("==> "+i);
				}
			}
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRoomCliAppApplication.class, args);
	}

}
