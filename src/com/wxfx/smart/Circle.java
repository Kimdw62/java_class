package com.wxfx.smart;

public class Circle {
	private double rad = 0;
	static final double PI = 3.14;
	
	public Circle(double r) {
		//System.out.println("smart에서 만들었습니다.");
		setRad(r);
	}

	public void setRad(double r) {
		if(r < 0) { 
			this.rad = 0;
			return; 
		}
		this.rad = r;
   }
   public double getArea() {
	   return (rad * rad) * PI;
   }
}
