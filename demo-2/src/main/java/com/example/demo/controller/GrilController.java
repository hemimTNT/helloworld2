package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Girl;
import com.example.demo.model.UserTest;
import com.example.demo.service.GirlService;
import com.example.demo.service.UserService;

@RestController
public class GrilController {
	
	@Autowired
	private GirlService girlService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/girl")
	public List<Girl> getAllGirl() {
		return girlService.getAllGirls();
	}
	
	@GetMapping("/userTest")
	public List<UserTest> getUserTest() {
		return userService.getUserTest();
	}
	
}
