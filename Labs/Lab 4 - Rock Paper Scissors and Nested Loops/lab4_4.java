//David Moreno 1/30/2019 - Lab 4-4

public class lab4_4 {

	public static void main(String[] args) {
		
			
			for(int i = 0; i < 6; i++) 
			{
				 for (int j = 0; j < 5 - i ;  j++) 
				 {
					 System.out.print(" ");
				 }
				 
				 for (int k = 1; k <= 2*i-1 ;  k++) 
				 {
					 System.out.print("*");
				 }
				 
				 System.out.println();
			}
			   

		}

}
