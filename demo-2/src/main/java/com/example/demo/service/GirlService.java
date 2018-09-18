package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Girl;

public interface GirlService {
	public void saveGirl(Girl girl) throws Exception;
	
	public List<Girl> getAllGirls();
}
