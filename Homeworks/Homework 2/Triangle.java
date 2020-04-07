
public class Triangle extends Shape implements PerimeterMeasurable, AreaMeasurable {
	
	public Triangle(Vertex v1, Vertex v2, Vertex v3) {
		va = new Vertex[3];
		va[0] = v1;
		va[1] = v2;
		va[2] = v3;
	}
	public String toString() {
		String str = "";
		str += "Perimeter: "+getPerimeter()+"\n";
		str += "Area: "+getArea()+"\n";

		return str;
	}
	public double getPerimeter() {
		double perimeter = 0;
		
		perimeter += distance(va[0], va[1]);
		perimeter += distance(va[1], va[2]);
		perimeter += distance(va[2], va[0]);
		return perimeter;
	}
	
	public double getArea() {
		double a = 0;
		
		a += area(va[0], va[1], va[2]);
		return a;
	}
	
	

}
