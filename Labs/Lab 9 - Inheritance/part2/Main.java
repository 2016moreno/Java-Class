package part2;
//David Moreno lab 9 3/20/19

public class Main {
	
	public static void main(String[] args) {
		
		SportsCar s = new SportsCar();
		s.brand = "BMW";
		s.model = "M3";
		s.price = 2000;
		s.year = 1992;
		s.spoiler = false;
		s.display();
		
		Minivan v = new Minivan();
		v.brand = "Honda";
		v.model = "Odyssey";
		v.price = 200000;
		v.year = 2016;
		v.spoiler = false;
		v.display();
	}

}
