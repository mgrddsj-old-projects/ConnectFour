
public class JesseMethod 
{

	public static void main(String[] args) 
	{
		
		
		
		
		//Just some testing by Jesse Xu.
		int[][] board = new int[7][6];
		board[5][5] = 1;
		board[4][4] = 2;
		printTheBoard(board);
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
    }
    
    public static void check(int[][] board)
    {
    	boolean wins = false;
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
    	for (int row=0;row<=3;row++)
    	{
    		for (int column=0;column<=4;column++)
    		{
    			for (int i=0;i<=4;i++)
    			{
    				
    			}
    		}
    	}
    	
    	//Check top right to bottom left
    }
}
