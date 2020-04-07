// David Moreno Lab 2-1 1/23/19

import java.util.Scanner;

public class Age {
	
	public static void main(String[] args) {
		System.out.println("How old are you? ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		System.out.println("Processing......");
		System.out.println("You are "+var1+" years old");
	}

}
