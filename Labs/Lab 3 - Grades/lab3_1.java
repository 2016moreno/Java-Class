// David Moreno Lab 3-1 1/28/19
import java.util.Scanner;

public class lab3_1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter an integer number: ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		
		if (var1 % 2 == 0) {
			System.out.println(var1+" is even");
		}
		else {
			System.out.println(var1+" is odd");
		}
	}

}