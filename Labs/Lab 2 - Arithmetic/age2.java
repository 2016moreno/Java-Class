// David Moreno Lab 2-2 1/23/19
import java.util.Scanner;

public class age2 {

	public static void main(String[] args) {
		System.out.println("When were you born? ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		int var2 = 2019 - var1;
		
		System.out.println("Processing......");
		System.out.println("I think you are "+var2+" years old");

	}

}
