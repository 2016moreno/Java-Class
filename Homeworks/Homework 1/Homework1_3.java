import java.util.Scanner;

//David Moreno Homework 1_3
public class Homework1_3 {
    
    public static void main(String[] args) {
    	
    	//This does not work but compiles and runs
        
        Scanner input = new Scanner(System.in);
        int TestCase = input.nextInt();
        while(TestCase > 0){
        	
            int n = input.nextInt();
            int m = input.nextInt();
            int i = input.nextInt();
            int j = input.nextInt();
            int h = input.nextInt();
            
            boolean iD = true;
            boolean jD = true;
            
            for(int l = 1;l <= h;l++){
                if(iD && i+1<=n) { i++; }
                else if(iD && i+1>n) { iD = false; i--; }
                else if(!iD && i-1>=0) { i--;}       
                else if(!iD && i-1<0) { iD = true; i++; }
                
                if(jD && j+1<=m){ j++; }
                else if(jD && j+1>m) { jD = false; j--;}               
                else if(!jD && j-1>=0){ j--; }
                else if(!jD && j-1<0){ jD = true; j++; }
                
            }
            System.out.println(i + " "+ j);
            
        }
        input.close();
    }

}


