import java.util.Scanner;

// David Moreno Lab 3-3 1/28/19
public class lab3_3 {
	public static void main(String args[]) {
		
		int first;
		int second;
		int third;
		
		System.out.println("Please input 3 numbers: ");
		Scanner in = new Scanner(System.in);
		int g1 = in.nextInt();
		int g2 = in.nextInt();
		int g3 = in.nextInt();
		
		if(g1 > g2 && g1 > g3)
			System.out.println("MAX: "+g1);
		else if (g2 > g3 && g2 > g1)
			System.out.println("MAX: "+g2);
		else
			System.out.println("MAX: "+g3);
		
		if(g1 < g2 && g1 < g3)
			System.out.println("MIN: "+g1);
		else if (g2 < g3 && g2 < g1)
			System.out.println("MIN: "+g2);
		else
			System.out.println("MIN: "+g3);

	}

}
