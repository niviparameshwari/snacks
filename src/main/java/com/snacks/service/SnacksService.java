package com.snacks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snacks.dao.SnacksDao;
import com.snacks.entity.SnacksEntity;

@Service
public class SnacksService {
@Autowired
SnacksDao sd;

	public String addDetails(SnacksEntity se) {
		return sd.addDetails(se) ;
	}

	public String putDetails(SnacksEntity se) {
		return sd.putDetails(se);
	}

	public String delDetails(int id) {
		return sd.delDetails(id);
	}

	public List<SnacksEntity> getDetails() {
		return sd.getDetails();
	}

	
	
	
}
