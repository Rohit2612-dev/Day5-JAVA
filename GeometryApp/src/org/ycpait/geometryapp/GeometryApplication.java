package org.ycpait.geometryapp;

import org.ycpait.geometryapp.entity.Circle;
import org.ycpait.geometryapp.entity.Rectangle;

public class GeometryApplication {
	public static void main(String[] args) {
		
		Circle c = new Circle(5, "red");
		System.out.println("Area of Circle is: "+ c.calculateArea());
		System.out.println("Perimeter of Circle is: "+ c.calculatePerimeter());
		c.draw();
		
		System.out.println();
		
		Rectangle r = new Rectangle(10, 20, "Blue");
		System.out.println("Area of Rectangle: "+ r.calculateArea());
		System.out.println("Perimeter of Rectangle: "+ r.calculatePerimeter());
		r.draw();
	}
}
	
