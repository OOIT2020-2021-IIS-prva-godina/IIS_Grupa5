package geometry;

import java.util.Arrays;

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
		
		
		//Vezba 4
		Point p2 = new Point(50,100);
		
		System.out.println("Point p2: X: " + p2.getX() + " , Y: " + p2.getY() + 
				" , selected: "  + p2.isSelected());
		
		Line l2 = new Line(p2,new Point(400,500));
		Circle c2 = new Circle(new Point(300,300), 60);
		Rectangle r2 = new Rectangle(p1, 50, 80);
		Rectangle r3 = new Rectangle(p1, 40, 90, true);
		
		// Ispis pre redefinisanja metode toString():    <naziv_paketa>.<naziv_klase>@<HexOfHash> 
		
		System.out.println("Point: " + p2);
		System.out.println("Point: " + p2.toString());  // (x,y)
		System.out.println("Line: " + l2); // (x1,y2) --> (x2,y2)
		System.out.println("Circle: " + c2);
		System.out.println("Rectangle: " + r2);
		
		int a = 5;
		int b = 5;
		System.out.println(a == b);
	
		String s1 = new String("Hello World!");
		String s2 = new String("Hello World!");
		
		String s3 = "abc";
		String s4 = "abc";
		
		System.out.println(s1 == s2);	//poredjenje po referenci
										//false
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s2));  //poredjenje po vrednosti
											//true

		System.out.println(p2 instanceof Point); //true 
												// p2 je instanca klase Point
		
		System.out.println(p2 instanceof Object); //true
		
		
		System.out.println("Point p2: " + p2);
		System.out.println("Point p1: " + p1);
		System.out.println(p2.equals(p1));   //false
		System.out.println(p2.equals(c2)); 
		
		System.out.println("Rectangle r2: " + r2);
		System.out.println("Rectangle r3: " + r3);
		System.out.println(r2.equals(r3));
		r3.setWidth(50);
		r3.setHeight(80);
		System.out.println("Rectangle r3: " + r3);
		System.out.println(r2.equals(r3)); 
		
		System.out.println("\nVezbe 5\n");
		Point p3 = new Point(30,30);
		Rectangle r4 = new Rectangle(new Point(20,20),40,20);
		System.out.println(r4.contains(p3));
		System.out.println(r4.contains(10,10));
		
		Donut d1  = new Donut(p3,50,20);
		System.out.println(d1);
		System.out.println(d1.contains(p3));
		System.out.println(d1.contains(30,50));
		
		//Vezbe 7
		System.out.println("\n Vezbe 7\n");
		System.out.println(p1);
		p1.moveTo(5, 3);
		System.out.println(p1);
		p1.moveBy(5, 3);
		System.out.println(p1);
		
		
		System.out.println(l1);
		l1.moveTo(5, 3);
		System.out.println(l1);
		l1.moveBy(5, 3);
		System.out.println(l1);
		
		System.out.println(r1);
		r1.moveTo(5, 3);
		System.out.println(r1);
		r1.moveBy(5, 3);
		System.out.println(r1);
		
		System.out.println(c1);
		c1.moveTo(5, 3);
		System.out.println(c1);
		c1.moveBy(5, 3);
		System.out.println(c1);
		
		System.out.println(d1);
		d1.moveTo(5, 3);
		System.out.println(d1);
		d1.moveBy(5, 3);
		System.out.println(d1);
		
		Shape d3 = new Donut(p1,10,2);
		Shape p9 = new Point();
		Shape l9 = l1;
		Shape c9 = c1;
		
		System.out.println("\nIspis oblika: ");
		Shape[] shapes = {d3,p9,l9,c9};
		for(int i =0; i<shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		System.out.println("\nmoveBy(): ");
		for(int i =0; i<shapes.length; i++) {
			shapes[i].moveBy(1, 2);
			System.out.println(shapes[i]);
		}
		System.out.println("\nIspis oblika nakon poziva metode moveBy(): ");
		for(int i =0; i<shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		
		int[] ints = {5,4,3,2,1};
		System.out.println("\nNEsortiran niz: ");
		for(int i = 0; i<ints.length; i++) {
			System.out.println(ints[i]);
		}
		Arrays.sort(ints);
		System.out.println("\nSortiran niz: ");
		for(int i = 0; i<ints.length; i++) {
			System.out.println(ints[i]);
		}
		
		Point p10 = new Point(10, 10);
		Point p20 = new Point(20, 20);
		Point p30 = new Point(30, 30);
		Point p40 = new Point(40, 40);
		Point p50 = new Point(50, 50);

		Point[] points = {p30, p10, p20, p50, p40};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}

		Arrays.sort(points); //sortira elemente niza na osnovu implementirane metode compareTo()

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}
		
		Line l10 = new Line(new Point(10, 10), new Point(100, 100));
		Line l20 = new Line(new Point(10, 10), new Point(200, 200));
		Line l30 = new Line(new Point(10, 10), new Point(300, 300));
		Line[] lines = {l30, l10, l20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}

		Arrays.sort(lines);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < lines.length; i++) {
			System.out.println(lines[i]);
		}

		Rectangle r10 = new Rectangle(p1, 10, 10);
		Rectangle r20 = new Rectangle(p2, 20, 20);
		Rectangle r30 = new Rectangle(p3, 30, 30);
		Rectangle[] rectangles = {r30, r10, r20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println(rectangles[i]);
		}

		Arrays.sort(rectangles);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println(rectangles[i]);
		}

		Circle c10 = new Circle(p1, 10);
		Circle c20 = new Circle(p1, 20);
		Circle c30 = new Circle(p1, 30);
		Circle[] circles = {c30, c10, c20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < circles.length; i++) {
			System.out.println(circles[i]);
		}

		Arrays.sort(circles);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < circles.length; i++) {
			System.out.println(circles[i]);
		}

		Donut d10 = new Donut(p10, 100, 10);
		Donut d20 = new Donut(p10, 100, 20);
		Donut d30 = new Donut(p10, 100, 30);
		Donut[] donuts = {d30, d10, d20};
		System.out.println("\nNesortiran niz: ");
		for (int i = 0; i < donuts.length; i++) {
			System.out.println(donuts[i]);
		}

		Arrays.sort(donuts);

		System.out.println("Sortiran niz: ");
		for (int i = 0; i < donuts.length; i++) {
			System.out.println(donuts[i]);
		}
		
		//Vezbe 8
		System.out.println("Circle c1: " + c1);
		try {
			c1.setRadius(-10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Circle c1: " + c1);
	


		
	}

}
