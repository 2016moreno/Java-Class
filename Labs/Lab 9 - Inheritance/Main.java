//David Moreno lab 9 3/20/19

public class Main {

	public static void main(String[] args) {
		
		Sports_car s = new Sports_car();
		s.brand = "BMW";
		s.model = "M3";
		s.price = 2000;
		s.year = 1992;
		s.spoiler = false;
		s.displayAll();
		s.displaySpoiler();
		
		Mini_van v = new Mini_van();
		v.brand = "Honda";
		v.model = "Odyssey";
		v.price = 200000;
		v.year = 2016;
		v.spoiler = false;
		v.displayAll();
		v.displayASD();
	}

}
