package com.calculator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.calculator.model.Areapyth;

@Repository
	public interface Areapythrepository extends JpaRepository<Areapyth, Long>{


	
}