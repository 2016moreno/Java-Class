
public class lab5_2 {

	public static void main(String[] args) throws InterruptedException {
		
		int ys = 10, xs = 10; //box size
		int y = ys / 2, x = xs / 4; //starting point

		
		char [][] box = new char [ys][xs];
		
		//************************************************************
        // Filling the grid with Stars
		//************************************************************

		for (int i = 0; i < ys; i++)
			for(int j = 0; j < xs; j++)
				box [i][j] = '*';
		
		while(true) {
		box[y][x] = '@';
		
		//************************************************************
        // Move @ around
		//************************************************************

		for (int i = 0; i < ys; i++)
		{
			for(int j = 0; j < xs; j++)
				System.out.print(box [i][j]);
		System.out.println();
		}
		
		box[y][x] = ' ';
		
		//MOVEMENT
		
		int direction = ((int)(Math.random()*10))%4;
		
		if(direction == 1) //down
		{
			y = y + 1;
		}
		if(direction == 2) //up
		{
			y = y - 1;
		}
		if(direction == 3) //left
		{
			x = x - 1;
		}
		if(direction == 4) //right
		{
			x = x + 1;
		}
		
		//This is to make sure we don't hit the boundaries
		if(y == 5) {
			y = 4;
		}
		if(x == 5) {
			x = 4;
		}
		if(y == -1) {
			y = 0;
		}
		if(x == -1) {
			x = 0;
		}
				
	
		
		System.out.println("\n\n\n\n\n\n\n");
		Thread.sleep(100);
		
		}
	}}
