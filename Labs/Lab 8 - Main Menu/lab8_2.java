package Class_Examples;
//David Moreno lab 8 3/20/19

import java.util.Scanner;
public class lab8_2 {

	public static void main(String[] args) {

		Menu m = new Menu();
		Scanner s = new Scanner(System.in);
		char user;
		while(true) {
			m.displayMain();
			user = s.next().charAt(0);
			if (user == '1') {
				uloop: while(true) {
					m.displayUtility();
					user = s.next().charAt(0);
					if(user == '4') 
						break uloop;
					else
							System.out.println("I'm sorry under construction!");
				}
			}
			else if (user == '2') {
				while(true) {
					m.displayGame();
					user = s.next().charAt(0);
					if(user == '3') 
						break;
					else
							System.out.println("I'm sorry under construction!");
				}
			}
			
			else if (user == '3') {
				while(true) {
					m.displayMultimedia();
					user = s.next().charAt(0);
					if(user == '4') 
						break;
					else
							System.out.println("I'm sorry under construction!");
				}
			}
			if (user == '4') {
				break;
			}
		}
		System.out.println("Thank you bye!");
	}

}

class Menu{
	
	public void displayMain() {
		System.out.println("Main Menu");
		System.out.println("1. Utility");
		System.out.println("2. Game");
		System.out.println("3. Multimedia");
		System.out.println("4. Exit");
		System.out.println("Please Input:");


	}
	public void displayUtility() {
		System.out.println("Utility Menu");
		System.out.println("1. Calculator");
		System.out.println("2. Email");
		System.out.println("3. Note");
		System.out.println("4. Main Menu");
		System.out.println("Please Input:");
	}
	
	public void displayGame() {
		System.out.println("Game Menu");
		System.out.println("1. Poker");
		System.out.println("2. Blackjack");
		System.out.println("3. Main Menu");
		System.out.println("Please Input:");
		
	}
	
	public void displayMultimedia() {
		System.out.println("Multimedia");
		System.out.println("1. Music Player");
		System.out.println("2. Camera");
		System.out.println("3. Download Youtube");
		System.out.println("4. Main Menu");
		System.out.println("Please Input:");


	}
}
