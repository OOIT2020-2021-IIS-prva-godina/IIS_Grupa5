package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	private Point upperLeft;
	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Point upperLeft, int width, int height, boolean selected) {
		this(upperLeft, width, height); // poziv prethodno definisanog konstruktora; 
										// mora biti prva naredba u okviru ove metode!
		this.selected = selected;
	}
	
	 //Povrsina i obim pravougaonika:
	public int area() {
		return width * height;
	}
	public int circumference() {
		return 2*width + 2*height;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocni = (Rectangle)obj;
			if(this.upperLeft.equals(pomocni.upperLeft) && this.width == pomocni.width 
					&& this.height == pomocni.height)
				return true;
			else 
				return false;
		}else
			return false;
	}
	
	public boolean contains(int x, int y) {
		return (upperLeft.getX() < x && upperLeft.getX() + width > x
				&& upperLeft.getY() < y && upperLeft.getY() + height > y);
	}
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	//Metode pristupa (GET i SET metode)
	public Point getUpperLeft() {
		return upperLeft;
	}
	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString() {
		return "UpperLeft: " + upperLeft + ", width: " + width + ", height: " + height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, height);
		
		if(selected) {
			g.setColor(Color.BLUE);
			g.drawRect(upperLeft.getX()-2,upperLeft.getY()-2 , 4, 4);
			g.drawRect(upperLeft.getX() + width - 2, upperLeft.getY()-2, 4, 4);
			g.drawRect(upperLeft.getX()- 2,upperLeft.getY() + height - 2 , 4, 4);
			g.drawRect(upperLeft.getX() + width - 2,upperLeft.getY() + height - 2 , 4, 4);
		}
	}

	@Override
	public void moveTo(int x, int y) {
		upperLeft.moveTo(x, y);
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		upperLeft.moveBy(byX, byY);
		
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Rectangle)
			return this.area() - ((Rectangle)o).area();
		return 0;
	}
	
}
