package geometry;

public class Test {

	public static void main(String[] args) {
		
		//Vezbe 2
		Point p = new Point(); //konstruktor putem kog kreiramo objekat klase Point
		
		p.setX(5);
		p.setY(3);
		p.setSelected(false);
		
		System.out.println("X coordinate of point p is: " + p.getX()+ '\n' +
				"Y coordinate of point p is: " + p.getY() + '\n' + "Point p is selected: "+ p.isSelected());
		
		double result = p.distance(10, 20); // racuna udaljenost tacke p cije su vrednosti setovane iznad, u odnosu na tačku sa 
		//koordinatama (10,20) koje su prosleđene metodi
		
		System.out.println("Distance beetwen points is: " + result); //Math.round(result)

		
		//Vezbe 3
		Point p1 = new Point();
		p1.setX(15);
		p1.setY(27);
		p1.setSelected(true);
		
		Line l1 = new Line();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		// 1. Inicijalizovati x koordinatu tačke p na vrednost y koordinate tačke p1
		p.setX(p1.getY());
		System.out.println("X of point p: " + p.getX());
		
		//2. Postaviti za početnu tačku linije l1 tačku p, a za krajnju tačku linije l1 tačku p1. 
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println("X of l1 startPoint: " + l1.getStartPoint().getX() + ", Y of l1 startPoint: " 
					+ l1.getStartPoint().getY());		
		System.out.println("X of l1 endPoint: " + l1.getEndPoint().getX() + ", Y of l1 endPoint: " 
					+ l1.getEndPoint().getY());
		
		//3. Postaviti y koordinatu krajnje tačke l1 na 23.
		
		
		l1.getEndPoint().setY(23);
		System.out.println("Y of l1 endPoint: "+ l1.getEndPoint().getY());
		System.out.println("Y of p1: " + p1.getY());
		
		//4. Inicijalizovati x koordinatu početne tačke linije l1 na vrednost
		// y koordinate krajnje tačke linije l1.
		
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		System.out.println("X od l1 startPoint: " + l1.getStartPoint().getX());
		
		
		//5. Postaviti x koordinatu krajnje tačke l1 na vrednost dužine linije l1
		// umanjene za vrednost zbira x i y koordinate početne tačke linije l1.
		
		l1.getEndPoint().setX((int)(l1.length() - (l1.getStartPoint().getX() + l1.getStartPoint().getY())));
		System.out.println("X of l1 endPoint: " + l1.getEndPoint().getX());
		
		//6. Postaviti x koordinatu tačke gore levo pravougaonika r1 na vrednost 10,
		// i y koordinatu na vrednost 15.
		r1.setUpperLeft(p1);
		r1.getUpperLeft().setX(10);
		r1.getUpperLeft().setY(15);
		System.out.println("X of r1 upperLeft: " + r1.getUpperLeft().getX());
		System.out.println("Y of r1 upperLeft: " + r1.getUpperLeft().getY());
		
		//7. Postaviti centar kruga c1 na koordinate tačke gore levo od r1.
		
		
		c1.setCenter(r1.getUpperLeft());
		System.out.println("X of c1 center: " + c1.getCenter().getX());	
		System.out.println("Y of c1 center: " + c1.getCenter().getY());	
		
		//8. Postaviti x koordinatu centra kruga c1 na vrednost razlike površine pravougaonika i 
		// y koordinate početne tačke linije l1.
		r1.setHeight(20);
		r1.setWidth(30);
		c1.getCenter().setX(r1.area()-l1.getStartPoint().getY());
		System.out.println("X of c1 center: " + c1.getCenter().getX());
	
		//9. Postaviti y koordinatu krajnje tačke linije l1 na vrednost razlike koordinata
		// centra kruga c1 umanjene za vrednost zbira x koordinate upperLeft tačke pravougaonika r1 
		// i površine kruga c1
		
		l1.getEndPoint().setY((int)(c1.getCenter().getX() - c1.getCenter().getY() - 
				(r1.getUpperLeft().getX() + c1.area())));
		System.out.println("Y of l1 endPoint: " + l1.getEndPoint().getY());

	}

}
