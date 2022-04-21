package com.snacks.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.snacks.entity.SnacksEntity;
import com.snacks.repository.SnacksRepository;
@Repository
public class SnacksDao {
	@Autowired
	SnacksRepository sr;

	public String addDetails(SnacksEntity se) {
		sr.save(se);
		return "Saved";
	}

	public String putDetails(SnacksEntity se) {
		sr.save(se);
		return null;
	}

	public String delDetails(int id) {
		sr.deleteById(id);
		return "Deleted";
	}

	public List<SnacksEntity> getDetails() {
		return sr.findAll();
       
	}
	


}
