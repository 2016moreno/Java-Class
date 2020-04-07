// David Moreno

public class lab5_1 {

	public static void main(String[] args) {
		
		//Declare it like this next time
		//char[] MyArray1 = new char[]{'H', 'E', 'L', 'L', 'O'};
		//char[] MyArray2 = new char[]{'H', 'E', 'L', 'L', 'U'};
		
		//declare arrays
		char[] MyArray1 = new char[5];
		char[] MyArray2 = new char[5];
		
		//initialize arrays
		MyArray1[0] = 'H';
		MyArray1[1] = 'E';
		MyArray1[2] = 'L';
		MyArray1[3] = 'L';
		MyArray1[4] = 'O';
		
		MyArray2[0] = 'H';
		MyArray2[1] = 'E';
		MyArray2[2] = 'L';
		MyArray2[3] = 'L';
		MyArray2[4] = 'O';
		
		Boolean flag = true;
		
		for(int i = 0; i < MyArray1.length; i++) {
			
			if(MyArray1[i] != MyArray2[i]) {
				
				flag = false;
				break;	
			}
		}
		
		if(flag == true)
			System.out.println("1");
		else
			System.out.println("0");
		
	}

}
