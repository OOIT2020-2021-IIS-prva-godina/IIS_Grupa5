package geometry;

public class Donut extends Circle{

	private int innerRadius;
	
	public Donut() {
		
	}
	public Donut(Point center, int r, int innerR) {
		super(center,r); //poziv konstruktora osnovne klase, prosledjujem mu parametre
						// mora biti prva naredba u konstruktoru izvedene klase
		this.innerRadius = innerR;  //inicijalizacija obelezja deklarisanih u klasi Donut
	}
	public Donut(Point center, int r, int innerR, boolean selected) {
		this(center,r,innerR);
		setSelected(selected);	
	}
	
	// Redefinišemo metode nasleđene iz osnovne klase
	// U izvedenoj klasi implementiramo novu metodu sa istim potpisom
	
	@Override
	public double area() {
		
		return super.area() - innerRadius * innerRadius * Math.PI;
		// Koriscenjem rezervisane reci super pozivamo metodu osnovne klase
		// Da smo napisali samo area() došslo bi do rekurzije
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Donut) {
			Donut pomocni = (Donut)obj;
			if (getCenter().equals(pomocni.getCenter()) && getRadius() == pomocni.getRadius()
					&& innerRadius == pomocni.innerRadius)
				return true;
		}
		return false;
		
	}
	@Override
	public boolean contains(int x, int y) {
		
		return super.contains(x, y) && getCenter().distance(x, y) >= innerRadius;
	//	return getCenter().distance(x,y) <= radius && getCenter().distance(x, y) >= innerRadius;
	}
	@Override
	public boolean contains(Point p) {
		
		return this.contains(p.getX(), p.getY());
	}
	@Override
	public String toString() {
		// Center: (xCenter, yCenter), radius = <radius>, innerRadius = <innerRadius>
		return super.toString() + ", innerRadius = "+ innerRadius;
	}
	public int getInnerRadius() {
		return innerRadius;
	}
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	
}
