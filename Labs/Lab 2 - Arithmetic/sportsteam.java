// David Moreno Lab 2-5 1/23/19
import java.util.Scanner;

public class sportsteam {

	public static void main(String[] args) {
		System.out.println("What is your name? ");
		Scanner in = new Scanner(System.in);
		String var1 = in.nextLine();
		
		System.out.println("Hi " +var1);
		
		System.out.println("What is your favorite sports team? ");
		
		Scanner inn = new Scanner(System.in);
		String var2 = in.nextLine();
		
		System.out.println("Do you think that "+var2+" will win in the league? ");
		
		Scanner innn = new Scanner(System.in);
		String var3 = in.nextLine();
		
		System.out.println("Thank you! ");
	}

}