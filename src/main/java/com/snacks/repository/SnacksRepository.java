package com.snacks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.snacks.entity.SnacksEntity;

public interface SnacksRepository extends JpaRepository<SnacksEntity, Integer>{
}
