import java.util.Scanner;
//David Moreno Lab 3-5 1/28/19

public class lab3_5 {
	
	public static void main(String args[]) {
		
		java.util.Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int n4 = s.nextInt();
		
		if ((n1 == n2 && n3 == n4) || (n1 == n4 && n2 == n3))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
