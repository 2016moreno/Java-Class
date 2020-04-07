import java.util.Scanner;

// David Moreno
public class arth {

	public static void main(String[] args) {
		
		System.out.println("Please input the first interger value? ");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		
		System.out.println("Please input the second interger value? ");
		Scanner inn = new Scanner(System.in);
		int var2 = inn.nextInt();
		
		int add = var1 + var2;
		int sub = var1 - var2;
		int div = var1 / var2;
		int mod = var1 % var2;
		
		
		System.out.println("Processing......");
		System.out.println("Addition: " +add );
		System.out.println("Subtration: " +sub );
		System.out.println("Division: " +div );
		System.out.println("Modulus: " +mod );
	}

}
