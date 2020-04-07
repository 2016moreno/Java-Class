//David Moreno Homework 1-1
import java.util.Scanner;

public class Homework1_1 {
     
     
	public static void main(String[] args) {
		//Greeting to input what the program needs
 		System.out.println("Hello!");
 		System.out.println("Please enter in the order of test cases, price of 1 cookie, number");
 		System.out.println("of cookies you want and the amount of money you have.");
        //This is used for user input
 		Scanner sc = new Scanner(System.in);
 		//how many test cases
         int num = sc.nextInt();
         //price of cookies
         double price []= new double[num];
         //# of cookies
         int cookies []= new int[num];
         //amount of money little johnny has
         double johnnyamount [] = new double [num];
         //for loop to re-take how many times user inputs new info
         	for(int i = 0;i < num; i++) {
            price[i]=sc.nextDouble();
            cookies[i]=sc.nextInt();
            johnnyamount[i]= sc.nextDouble();
        	}
         	//second for loop to calculate the prices johnny has/needs
         	//used a for loop here to re-do every test case 1 time
        	for(int i = 0; i < num; i++) {
        	System.out.println(price[i]* cookies[i] - johnnyamount[i]);
        	} 
    	}
 } 
