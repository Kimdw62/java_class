package com.wxfx.simple;

public class Circle {
	private double rad = 0;
	private final double PI = 3.14;
	
	public Circle(double r) {
		//System.out.println("simple���� ��������ϴ�.");
		setRad(r);
	}

	public void setRad(double r) {
		if(r < 0) { 
			rad = 0;
			return; 
		}
		rad = r;
   }
   public double getArea() {
	   return (rad * rad) * PI;
   }
}
