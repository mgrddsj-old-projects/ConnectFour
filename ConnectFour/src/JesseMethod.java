
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
}
