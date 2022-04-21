package com.snacks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.snacks.entity.SnacksEntity;
import com.snacks.service.SnacksService;

@RestController
public class SnacksController {
	@Autowired
	SnacksService ss;
	
	@PostMapping("/add") 
	public String addDetails(@RequestBody SnacksEntity se) {
		return ss.addDetails(se);
	}
	
	@PutMapping("/put")
	public String putDetails(@RequestBody SnacksEntity se) {
		return ss.putDetails(se);
	}
	
	@DeleteMapping("/del/{id}")
	public String delDetails(@PathVariable int id) {
		return ss.delDetails(id);
	}
	
	@GetMapping("/get")
	public List <SnacksEntity> getDetails() {
		return ss.getDetails();
	}

}
