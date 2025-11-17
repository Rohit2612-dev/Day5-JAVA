package org.ycpait.geometryapp;

interface Printable{
	
	void print();	
	static void of() {}
	
	default void printFormat() {
		System.out.println("Printing the format");
	}
}
public interface Drawable {
	int PX=1;
	//public static final int PX = 1;
	//static final int PX = 1;
	//public final int PX =1;    //Most recommended 
	void draw();
	void print();
}

class Circle implements Drawable{
	@Override
	public void draw() {
		System.out.println(PX);
	}
	
	@Override
	public void print() {	
	}
	public void printFormat() {
	}
	class Main{
		public static void main(String[]args) {
			Drawable d;
		}
	}
}
