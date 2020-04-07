//David Moreno 1/30/2019 - Lab 4-3
public class lab4_3 {
	
public static void main(String[] args) {
	
	int counter = 5;
		
		for(int i = 0; i < 5; i++) 
		{
			 for (int y = 0; y <= i ; y++) 
			 {
				 System.out.print(" ");
			 }
			 
		     for(int j = 1 + i; j <= counter; j++)
		     	 {
		        
		            System.out.print("*");
		            
		     	 }
		     counter--;
		     System.out.println();
		}
		   

	}

}
