
public class Main {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println("kolo,promien= " + c1.getRadius() + " pole= "  + c1.getArea()+ " color= "+ c1.getColor());
		Circle c2 = new Circle(2.0);
		System.out.println("kolo,promien= " + c2.getRadius() + " pole= "  + c2.getArea()+ " color= "+ c2.getColor());
	}

}
