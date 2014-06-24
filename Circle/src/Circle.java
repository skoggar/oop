
public class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double r){
		radius = r;
		color = "red";
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public String getColor(String color){
		this.color = color;
	}
	//public String toString() {
	//	return "Circle: radius=" + radius + " color=" + color;
	//	}
}
