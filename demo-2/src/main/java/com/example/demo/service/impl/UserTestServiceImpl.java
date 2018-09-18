package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.other.UserTestMapper;
import com.example.demo.model.UserTest;
import com.example.demo.service.UserService;

@Service
public class UserTestServiceImpl implements UserService{
	
	@Autowired
	private UserTestMapper userTestMapper;

	@Override
	public List<UserTest> getUserTest() {
		return userTestMapper.selectAll();
	}

}
