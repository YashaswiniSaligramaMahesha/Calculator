package com.calculator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="perimeter")
public class Perimeter {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="side1")
	private double side1;
	
	@Column(name="side2")
	private double side2;
	
	@Column(name="side3")
	private double side3;
	
	@Column(name="perimeter")
	private double perimeter;
	
	public int getId() {
		return id;
	}
	public Perimeter(double side1, double side2, double side3, double perimeter) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.perimeter = perimeter;
	}
	public Perimeter(){
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	
}