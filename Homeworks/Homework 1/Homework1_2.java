//David Moreno Homework 1-2
import java.io.*;
import java.util.Scanner; 

//If N and M are given, a program should be created to find the seat number (x, y) to be assigned to the audience
//whose waiting sequence is K. If there is no seat for K, the program returns 0.

public class Homework1_2 {
        public static void main (String[] args) {
        	//Declared for use of row/column
        	int n; 
        	int m;
        	//Scans inputs from the user
        	Scanner scan= new Scanner(System.in);
            int userTest = scan.nextInt();
            //Makes sure to run programs a set amount of times
            for(int i = 1; i <= userTest; i++) {
            	//initialize this block to zero
                int numrows = 0; 
                int numcol = 0;
                int x = 0, y = 0;
                //takes user input for N, M, and K
                int N = scan.nextInt(); //X cord
                int M = scan.nextInt(); //Y cord
                int K = scan.nextInt();
                //this sets m for rows
                m = N; 
                //this sets n for columns
                n = M;
                //there will always be at least 1 test
                int count = 1;  
                //makes sure we don't go past the already set rows and columns
                while (numrows < m && numcol < n) 
                { 
                	//From here, we start off with the first column of our map
                if (numcol < n) { 
                      //this makes an column from bottom left to top left
                    for (i = m - 1; i >= numrows; --i) { 
                        if(count == K){
                              x = i;
                              y = numcol;
                            }
                            count++;
                        } 
                        numcol++;  //these 2 jump to the next row   
                    } 
                    //makes the row from the top left to top right
                    for (i = numcol; i < n; ++i) { 
                        if(count == K){
                              x = numrows;
                              y = i;
                            }
                        count++;
                    } 
                    numrows++; 
                    //now we do top right to bottom right
                    for (i = numrows; i < m; ++i) {                
                        if(count == K){
                              x = i;
                              y = n - 1;
                            }
                        count++;
                    } 
                    n--; 
                    //now we do bottom right to bottom left
                    if (numrows < m){ 
                        for (i = n - 1; i >= numcol; --i) {                             
                            if(count == K){
                              x = m - 1;
                              y = i;
                            }
                            count++;
                        } 
                        m--; 
                    }      
                } 
                
      //If seat is not found, print zero
      if(x == 0 && y == 0)
    	  System.out.println((x) +" "+ (y));
      else 
          //prints the coords
    	  System.out.println((N - x) +" "+ (y+1));
            }
            scan.close();
        }
}