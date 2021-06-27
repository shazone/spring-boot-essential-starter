package com.shazone.learn.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room {
	
	private long id;
	private String number;
	private String name;
	private String info;
	
}
