package com.calculator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="median")
public class Median {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="base")
	private double base;
	
	@Column(name="height")
	private double height;
	
	@Column(name="hypotenuse")
	private double hypotenuse;
	
	@Column(name="median")
	private double median;
	
	public int getId() {
		return id;
	}
	
	public Median(double base, double height, double hypotenuse, double median) {
		super();
		this.base = base;
		this.height = height;
		this.hypotenuse = hypotenuse;
		this.median = median;
	}
	public Median() {
		
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBase() {
		return base;
	}
	public void setBase(long base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHypotenuse() {
		return hypotenuse;
	}
	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}
	public double getMedian() {
		return median;
	}
	public void setMedian(double median) {
		this.median = median;
	}
	
}
