package org.ycpait.geometryapp.entity;

public class Shape {
	protected String color;
	
	public Shape(String color) {
		
		super();
		System.out.println();
		this.color = color;
	}
	public void draw() {
		System.out.println("Circle drawn using color: "+ this.color);
	}
}

