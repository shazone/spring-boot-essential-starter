package com.shazone.learn.springboot.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shazone.learn.springboot.models.StaffMember;

public interface StaffRepository extends JpaRepository<StaffMember, String> {

}
