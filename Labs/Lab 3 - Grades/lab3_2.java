// David Moreno Lab 3-2 1/28/19
import java.util.Scanner;

public class lab3_2 {

	public static void main(String[] args) {
		// A = 4.0, B = 3.0, C = 2.0, D = 1.0
		
		System.out.println("Please input your grades: ");
		Scanner in = new Scanner(System.in);
		char g1 = in.next().charAt(0);
		char g2 = in.next().charAt(0);
		char g3 = in.next().charAt(0);
		double total = 0;
		
		if(g1 == 'A') {
			total += 4.0;
		}	
		else if(g1 == 'B') {
			total += 3.0;
		}
		else if(g1 == 'C') {
			total += 2.0;
		}
		else if(g1 == 'D') {
			total += 1.0;
		}
		else if(g1 == 'F') {
			total += 0.0;
		}
		
		if(g2 == 'A') {
			total += 4.0;
		}	
		else if(g2 == 'B') {
			total += 3.0;
		}
		else if(g2 == 'C') {
			total += 2.0;
		}
		else if(g2 == 'D') {
			total += 1.0;
		}
		else if(g2 == 'F') {
			total += 0.0;
		}
		
		if(g3 == 'A') {
			total += 4.0;
		}	
		else if(g3 == 'B') {
			total += 3.0;
		}
		else if(g3 == 'C') {
			total += 2.0;
		}
		else if(g3 == 'D') {
			total += 1.0;
		}
		else if(g3 == 'F') {
			total += 0.0;
		}
		
		total = total / 3;
		
		System.out.println("Your GPA is: " +total);
	}
}