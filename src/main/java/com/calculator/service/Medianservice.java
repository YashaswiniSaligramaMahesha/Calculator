package com.calculator.service;

import java.text.DecimalFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.model.Median;
import com.calculator.repository.Medianrepository;

@Service
public class Medianservice {
	@Autowired
	private Medianrepository repository;
	public Median calculateMedian(Median med) {
		
		double base = med.getBase();
		double height = med.getHeight();
		double hypotenuse=med.getHypotenuse();

		 double median = Math.sqrt((2*base * base) + (2*hypotenuse * hypotenuse)-(height*height)/4);
		 
		 DecimalFormat df = new DecimalFormat("#.###");
			med.setMedian(Double.parseDouble(df.format(median)));
		 
		 return repository.save(med);
}
	public List<Median> getMedianofTriangle() {
		
		return repository.findAll();
	}
	
}
