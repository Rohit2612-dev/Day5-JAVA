package org.ycpait.geometryapp.entity;

public class Circle extends Shape{
	
	private float radius;
//	private String color;
	
	
	public Circle(float radius, String color) {
		super(color);
		this.radius = radius;
//		this.color = color;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public float calculateArea() {
		return 3.14f * radius * radius;
	}
	
	public float calculatePerimeter() {
		return 2* 3.14f *radius; 
	}
	
	@Override   //built-in Annotation to check if overriding is
				//appropriate
				//it is recommended to annotation for overridden methods
				//not mandate
	//Overridden method	q
	public void draw() {
		super.draw();
		System.out.println("With radius:"+this.radius);
		
	}
	
//	public void draw() {
//		System.out.println("Circle drawn using color: "+ this.color);
//	}
}

