package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	
	public double distance(int x2, int y2) {
		double dx = this.x - x2;
		double dy = this.y - y2;
		double d = Math.sqrt(dx*dx + dy*dy);
		
		return d;
	}
	
	public boolean equals(Object obj) {
		 if (obj instanceof Point) {
			 Point pomocna = (Point)obj;
			 // Smatramo da su 2 tacke jednake ukoliko su im koordinate jednake
			 if(this.x == pomocna.getX() && this.y == pomocna.getY())
				 return true;
			 else
				 return false;
		 } else {
			 return false;
		 }
	}
	
	public boolean contains(int x, int y) {
		return this.distance(x, y) <= 2;
	}
	//set i get
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return this.x;
		//moze i return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return this.y; // ili return y;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public boolean isSelected() {
		return this.selected; //ili return selected;
	}
	
	public String toString() {
		return "("+x+","+y+")";  //(x,y)
	}
}
