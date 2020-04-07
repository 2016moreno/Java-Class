package Class_Examples;
//David Moreno lab 8 3/20/19
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab8_3 {

	public static void main(String[] args) throws IOException {
		
		String id, pass;
		char c;
		Scanner s = new Scanner(System.in);
		FileWriter fw1 = new FileWriter("ID.txt", true);
		PrintWriter pw1 = new PrintWriter(fw1);
		FileWriter fw2 = new FileWriter("PASS.txt", true);
		PrintWriter pw2 = new PrintWriter(fw2);
		
		while(true) {
		System.out.println("Please input your ID and password ");
		System.out.print("ID: ");
		id = s.next();
		System.out.print("PASS: ");
		pass = s.next();
		pw1.println(id);
		pw2.println(pass);
		
		System.out.println("More? Y/N");
		c = s.next().charAt(0);
		if (c == 'N')
			break;
		}
		pw1.close();
		pw2.close();
		
		File f1 = new File("ID.txt");
		File f2 = new File("PASS.txt");
		Scanner s2 = new Scanner(f1);
		Scanner s3 = new Scanner(f2);
		
		while(s2.hasNext()) {
			
			System.out.println("ID:  "+s2.next()+"  Pass: "+s3.next());
		}



		
	}

}
