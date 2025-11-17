package org.ycpait.geometryapp.entity;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
//	private String color;
	
	public Rectangle(int length, int breadth, String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
//		this.color = color;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int calculateArea() {
		return length * breadth;
	}
	
	public int calculatePerimeter() {
		return 2*(length+breadth);
	}
	
	public void draw() {
		super.draw();
		System.out.println("With Length:"+this.length+ " And Breadth:"+ this.breadth);
		
	}
//	public void draw() {
//		System.out.println("Circle drawn using color: "+ this.color);
//}
}

