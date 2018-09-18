package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.base.GirlMapper;
import com.example.demo.model.Girl;
import com.example.demo.service.GirlService;

@Service
public class GirlServiceImpl implements GirlService{
	
	@Autowired
	private GirlMapper girlMapper;

	@Override
	public void saveGirl(Girl girl) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Girl> getAllGirls() {
		return girlMapper.selectAll();
		
	}

}
