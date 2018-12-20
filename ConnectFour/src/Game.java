import java.util.Random;
import java.util.Scanner;

public class Game 
{
	public static boolean wins = false;
	
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What game mode would you like? (1 for PVP, 2 for battle against computer). ");
		int gm = in.nextInt();

		if (gm == 2)
		{
			pVc();
		}
		else 
		{
			pVp();
		}
		in.close();
	}

	public static void pVp()
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int[][] board = new int[7][6]; //[column][row]
		int player = 1;
		
		while (!wins)
		{
			System.out.println("Player " + player + "'s turn: ");
			boolean bomb = false;
			if (rand.nextInt(15) == 2)
			{
				System.out.println("Lucky you! You've got a bomb. It will destroy 3x3 area around it! ");
				bomb = true;
			}
			int columnIn = in.nextInt();

			for (int row=5;row>=0;row--)
			{
				if (board[columnIn-1][row] ==0)
				{
					if (bomb)
					{
						if (row+1<6)
							board[columnIn-1][row+1] = 0;
						if (columnIn-2>0)
						{
							if (row-1>=0)
								board[columnIn-2][row-1] = 0;
							board[columnIn-2][row] = 0;
							if (row+1<6)
								board[columnIn-2][row+1] = 0;
						}
						if (columnIn<7)
						{
							if (row-1>=0)
								board[columnIn][row-1] = 0;
							board[columnIn][row] = 0;
							if (row+1<6)
								board[columnIn][row+1] = 0;
						}
					}
					else
					{
						board[columnIn-1][row] = player;
					}
					break;
				}
			}
			
			if (rand.nextInt(10) == 5)
			{
				System.out.println("You've got \"I AM YOUR FATHER\", skip next round! ");
			}
			else
			{
			if (player == 1)
				player = 2;
			else 
				player = 1;
			}
			
			printTheBoard(board);
			check(board);
		}
		in.close();
	}
	
	public static void pVc()
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int[][] board = new int[7][6]; //[column][row]
		int player = 1;
		System.out.println("Silly computer joined the game! ");
		
		while (!wins)
		{
			int columnIn;
			boolean bomb =false;
			
			if (player == 1)
			{
				System.out.println("Your turn: ");
				if (rand.nextInt(5) == 2)
				{
					System.out.println("Lucky you! You've got a bomb. It will destroy 3x3 area around it! ");
					bomb = true;
				}
				columnIn = in.nextInt();
			}
			else 
			{
				columnIn = rand.nextInt(6)+1;
				System.out.println("Computer's turn! It plays " + columnIn);
			}
			
			for (int row=5;row>=0;row--)
			{
				if (board[columnIn-1][row] ==0)
				{
					if (bomb)
					{
						if (row+1<6)
							board[columnIn-1][row+1] = 0;
						if (columnIn-2>0)
						{
							if (row-1>=0)
								board[columnIn-2][row-1] = 0;
							board[columnIn-2][row] = 0;
							if (row+1<6)
								board[columnIn-2][row+1] = 0;
						}
						if (columnIn<7)
						{
							if (row-1>=0)
								board[columnIn][row-1] = 0;
							board[columnIn][row] = 0;
							if (row+1<6)
								board[columnIn][row+1] = 0;
						}
					}
					else
					{
						board[columnIn-1][row] = player;
					}
					break;
				}
			}
			
			if (rand.nextInt(10) == 5)
			{
				if (player == 1)
				{
					System.out.print("You've");
				}
				else
				{
					System.out.print("The computer has");
				}
				System.out.println(" got \"I AM YOUR FATHER\", skip next round! ");
			}
			else
			{
			if (player == 1)
				player = 2;
			else 
				player = 1;
			}
			
			printTheBoard(board);
			check(board);
		}
		in.close();
	}
	
    public static void printTheBoard(int[][] board)
    {
		System.out.println("The board now looks like: ");
    	for (int row=0;row<6;row++)
		{
			for (int column=0;column<7;column++)
			{
				if (board[column][row] == 1)
				{
					System.out.print("Y");
				}
				else if (board[column][row] == 2)
				{
					System.out.print("R");
				}
				else 
				{
					System.out.print(" ");
				}
				if (column != 6)
					System.out.print("|");
			}
			System.out.println();
			if (row != 5)
				System.out.println("-------------");
		}
    	System.out.println("1|2|3|4|5|6|7");
    }
    
    public static void check(int[][] board)
    {
    	wins = false;
    	int who = 0;
    	
    	//Check horizontally
    	for (int row=0;row<6;row++)
    	{
    		int continuous = 0;
    		for (int column=1;column<7;column++)
    		{
    			if (board[column][row] == board[column-1][row] && board[column][row]!=0)
    			{
    				continuous++;
    				if (continuous == 3)
    				{
    					//someone wins
    					wins = true;
    					who = board[column][row];
    				}
    			}
    			else 
    			{
    				continuous = 0;
    			}
    		}
    	}
    	
    	//Check vertically
    	for (int column=0;column<7;column++)
    	{
    		int continuous = 0;
    		for (int row=1;row<6;row++)
    		{
    			if (board[column][row] == board[column][row-1] && board[column][row]!=0)
    			{
    				continuous++;
    				if (continuous == 3)
    				{
    					//someone wins
    					wins = true;
    					who = board[column][row];
    				}
    			}
    			else 
    			{
    				continuous = 0;
    			}
    		}
    	}
    	
    	//Check top left to bottom right
    	
    	for (int row=0;row<=2;row++)
    	{
    		for (int column=0;column<=3;column++)
    		{
    			int temp = board[column][row];
    			if (temp==0)
    				continue;
    			int time = 0;
    			for (int i=0;i<=3;i++)
    			{
    				if (board[i+column][i+row] != temp)
    				{
    					break;
    				}
    				else 
    				{
    					//Equals. 
    					time++;
    					if (time==4)
    					{
    						wins = true;
    						who = temp;
        					break;
    					}
    				}
    			}
    		}
    	}
    	
    	//Check top right to bottom left
    	
    	for (int row=0;row<=2;row++)
    	{
    		for (int column=3;column<=6;column++)
    		{
    			int temp = board[column][row];
    			if (temp==0)
    				continue;
    			int time = 0;
    			for (int i=0;i>=-4;i--)
    			{
    				if (board[column+i][row-i] != temp)
    				{
    					break;
    				}
    				else 
    				{
    					//Equals. 
    					time++;
    					if (time==4)
    					{
    						wins = true;
    						who = temp;
    						break;
    					}
    				}
    			}
    		}
    	}
    	
    	if (wins)
    	{
    		if (who == 1)
    			System.out.println("Yellow wins! ");
    		else 
    			System.out.println("Red wins! ");
    	}
    }
}
