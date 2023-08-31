package com.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.Areapyth;
import com.calculator.model.Median;
import com.calculator.model.Perimeter;
import com.calculator.service.Areapythservice;
import com.calculator.service.Medianservice;
import com.calculator.service.Perimeterservice;

@CrossOrigin
@RestController
@RequestMapping("/triangle")
public class Trianglecontroller {
	
         @Autowired
		 private Areapythservice service;
		 
         @Autowired
         private Perimeterservice service1;
         
         @Autowired
         private Medianservice service2;
         
         
		 @PostMapping("/areapyth/post")
		    public Areapyth calculateArea(@RequestBody Areapyth obj) {
		        return service.calculateAreaAndPythagorus(obj);
		    }
		 
		 @GetMapping("/areapyth")
		 public List<Areapyth> getAreasofTriangle(){
			 return service.getAreaAndPythagorus();
		 }
		 
		 @GetMapping("/areapyth/history")

		 public List<Areapyth> getAreasofTriangle1() {

		 return service.getAreaAndPythagorus();

		 }
		
		 @PostMapping("/perimeter/post")
		 public Perimeter calculatePerimeter(@RequestBody Perimeter perim) {
		        return service1.calculatePerimeter(perim);
		 }
		 @GetMapping("/perimeter")
		 public List<Perimeter> getPerimeter(){
			 return service1.getPerimeterofTriangle();
		 }
		 
		 @GetMapping("/perimeter/history")
		 public List<Perimeter> getPerimeter1(){
			 return service1.getPerimeterofTriangle();
		 }
		 
		 
		 @PostMapping("/median/post")
			 public Median calculateMedian(@RequestBody Median med) {
			        return service2.calculateMedian(med);
			 }
		 
		 @GetMapping("/median")
			 public List<Median> getMedian(){
				 return service2.getMedianofTriangle();
}
		 @GetMapping("/median/history")
		 public List<Median> getMedian1(){
			 return service2.getMedianofTriangle();
}
}
