package com.wxfx.smart;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		setWidth(width);
		setHeight(height);
	}
	
	public void setWidth(int w) {
		if(w < 0) { 
			this.width = 0;
			return; 
		}
		this.width = w;
	}
	public void setHeight(int h) {
		if(h < 0) { 
			this.height = 0;
			return; 
		}
		this.height = h;
	}

	public int getArea() {
		return width * height;
	}
}
