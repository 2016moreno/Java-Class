
public class Main {
	public static void main(String[] args) {
		
		Shape [] s = new Shape [10];
		s[0] = new Triangle(new Vertex(1.0, 2.0), new Vertex(4.0, 4.0), new Vertex(5.0, 0.0));
		System.out.println(s[0].toString());
	}

}
