package com.calculator.service;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.model.Areapyth;
import com.calculator.model.Median;
import com.calculator.model.Perimeter;
import com.calculator.repository.Perimeterrepository;

@Service
public class Perimeterservice {
		@Autowired
		private Perimeterrepository repository;
		public Perimeter calculatePerimeter(Perimeter perim) {
			
			double Perimeter=perim.getSide1()+perim.getSide2()+perim.getSide3();
			
			DecimalFormat df = new DecimalFormat("#.###");
			perim.setPerimeter(Double.parseDouble(df.format(Perimeter)));
			return repository.save(perim);
}
		public List<Perimeter> getPerimeterofTriangle() {
			
			return repository.findAll();
		}
		
		
}
		
