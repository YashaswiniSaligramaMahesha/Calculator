package com.calculator.service;

import java.text.DecimalFormat;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calculator.model.Areapyth;
import com.calculator.repository.Areapythrepository;
@Service
public class Areapythservice {

	@Autowired
	private Areapythrepository repository;

	public Areapyth calculateAreaAndPythagorus(Areapyth obj) {

	    double base = obj.getBase();
	    double height = obj.getHeight();

	    double pythagorus = Math.sqrt((base * base) + (height * height));
	    double area = 0.5 * base * height;

	    DecimalFormat df = new DecimalFormat("#.###");
	    obj.setPythagorus(Double.parseDouble(df.format(pythagorus)));
	    obj.setArea(Double.parseDouble(df.format(area)));

	    return repository.save(obj);

	}

	public List<Areapyth> getAreaAndPythagorus() {
	    return repository.findAll();
	}

	
}
