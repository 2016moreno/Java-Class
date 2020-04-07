// David Moreno Lab 2-4 1/23/19
import java.util.Scanner;

public class volume {

	public static void main(String[] args) {
		
		System.out.println("Please input the height of the cylinder? ");
		Scanner in = new Scanner(System.in);
		double var1 = in.nextDouble();
		
		System.out.println("Please input the radius of the cylinder?  ");
		Scanner inn = new Scanner(System.in);
		double var2 = inn.nextDouble();
		
		double vol = 3.14 * (var2 * var2) * var1;
		
		
		System.out.println("Processing......");
		System.out.println("The volume of the cylinder is " +vol );
	}

}
