package com.shazone.learn.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.shazone.learn.springboot.data.StaffRepository;
import com.shazone.learn.springboot.models.Position;
import com.shazone.learn.springboot.models.StaffMember;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StaffService {
	/*private static final List<StaffMember> staffs = new ArrayList<>();
	static {
			staffs.add(new StaffMember(UUID.randomUUID().toString(), "Abah", "Tok Bah",Position.CONCIERGE.toString()));
			staffs.add(new StaffMember(UUID.randomUUID().toString(), "Mummy", "Tok Wan",Position.FRONT_DESK.toString()));
			staffs.add(new StaffMember(UUID.randomUUID().toString(), "Adam", "Shazwan",Position.HOUSEKEEPING.toString()));
			staffs.add(new StaffMember(UUID.randomUUID().toString(), "Pami", "Shazwan",Position.SECURITY.toString()));
			staffs.add(new StaffMember(UUID.randomUUID().toString(), "Iris", "Shazwan",Position.SECURITY.toString()));
	}*/
	private final StaffRepository staffRepository;
	
	public List<StaffMember> getAllStaffs() {return staffRepository.findAll();}
	
	
}
