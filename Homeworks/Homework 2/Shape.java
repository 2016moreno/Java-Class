
public class Shape {

	public Vertex [] va;
	
	public double distance(Vertex a, Vertex b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2)+ Math.pow(a.y - b.y, 2));
	}
	
	public double area(Vertex a, Vertex b, Vertex c) {
		
		return ((((a.x *(b.x - c.x)) + (b.x *(a.x - c.x)) + (c.x *(a.x - b.x))) / 2) * -1);
	}
	
}