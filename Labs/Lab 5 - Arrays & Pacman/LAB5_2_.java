import java.util.Scanner;

public class LAB5_2_ 
{
	public static void main(String []args) throws InterruptedException{
	{
		int row = 2;
		int col = 2;
		int direction = 0;
		int total = 1;
		char box[][] = new char [5][5];
		
		for(int x = 0; x < box.length; x++)
		{
			for(int y = 0; y < box.length; y++)
			{
				box[x][y] = '*';
			}
		}
		
		box[col][row] = '@';
		while(total > 0)
		{
			
			for(int x = 0; x < 5; x++)
			{
				for(int y = 0; y < 5; y++)
				{
					System.out.print(box[x][y]);
				}
				System.out.println();
			}
			
			direction = (((int)(Math.random() * 1000)) % 4) + 1; //Random directions
			
			box[col][row] = ' ';
			
			if(direction == 1) //down
			{
				row = row + 1;
			}
			if(direction == 2) //up
			{
				row = row - 1;
			}
			if(direction == 3) //left
			{
				col = col - 1;
			}
			if(direction == 4) //right
			{
				col = col + 1;
			}
			
			//All this is to move back if it hits the boundaries
			if( row == 5)
			{
				row = 4;
			}
			if( col == 5)
			{
				col = 4;
			}
			if( row == -1)
			{
				row = 0;
			}
			if( col == -1)
			{
				col = 0;
			}
			
			box[col][row] = '@';
			
			total = 0;
			for(int x = 0; x < 5; x++)
			{
				for(int y = 0; y < 5; y++)
				{
					if(box[x][y] == '*')
					{
						
						total = total + 1;
					}
					
				}
			}
				if(total == 0)
				{
					for(int x = 0; x < 5; x++)
					{
						for(int y = 0; y < 5; y++)
						{
						System.out.print(box[x][y]);
						}
					}
				}
						
			
			System.out.print("\n\n\n\n");
			Thread.sleep(50);
			}
		
		}
	}
}