package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point p = new Point(); //konstruktor putem kog kreiramo objekat klase Point
		
		p.setX(5);
		p.setY(3);
		p.setSelected(false);
		
		System.out.println("X coordinate of point p is: " + p.getX()+ '\n' +
				"Y coordinate of point p is: " + p.getY() + '\n' + "Point p is selected: "+ p.isSelected());
		
		double result = p.distance(10, 20); // racuna udaljenost tacke p cije su vrednosti setovane iznad, u odnosu na tačku sa 
		//koordinatama (10,20) koje su prosleđene metodi
		
		System.out.println("Distance beetwen points is: " + result); //Math.round(result)

	}

}
