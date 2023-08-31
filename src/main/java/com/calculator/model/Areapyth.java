package com.calculator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="triangle")
public class Areapyth {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="base")
	private double base;
	
	@Column(name="height")
	private double height;
	
	@Column(name="area")
	private double area;
	
	@Column(name="pythagorus")
	private double pythagorus;
	
	public Areapyth()
	{
	}
	
	public Areapyth(double base, double height, double area, double pythagorus) {
		super();
		this.base = base;
		this.height = height;
		this.area = area;
		this.pythagorus = pythagorus;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPythagorus() {
		return pythagorus;
	}
	public void setPythagorus(double pythagorus) {
		this.pythagorus = pythagorus;
	}
	
}


