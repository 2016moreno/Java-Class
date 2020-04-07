//David Moreno 1/30/2019 - Lab 4-5

import java.util.Scanner;
public class lab4_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char done =' ';
		while(true){
			
			System.out.println("Start Game");
			System.out.println("1. Rock");
			System.out.println("2. Paper");
			System.out.println("3. Scissors");
			System.out.println("What do you want to throw? ");
			
			char user = s.next().charAt(0);
			
			int com = ((int)((Math.random()*10)%3+1));
			
			if (com == 1) {
				System.out.print("Computer: Rock vs ");
				}
			else if (com == 2) {
				System.out.print("computer: Paper vs ");
				}
			else {
				System.out.print("computer: Scissors vs ");
				}
			
			if (user == '1') {
				System.out.println("You: Rock");
				}
			else if (user == '2') {
				System.out.println("You: Paper");
			}
			else {
				System.out.println("You: Scissors");
			}
			
			if ( (user =='1' && com==3) || (user =='2' && com==1) || (user =='3' && com==2)) {
				System.out.println("User won!");
			}
			else if ( (user =='1' && com==1) || (user =='2' && com==2) || (user =='3' && com==3)) {
				System.out.println("Tie!");
			}
			else {
				System.out.println("Computer won!");
			}
			
			System.out.println("Play again? ");
			done = s.next().charAt(0);
			if(done == 'N')
				break;
		}
	}

}
