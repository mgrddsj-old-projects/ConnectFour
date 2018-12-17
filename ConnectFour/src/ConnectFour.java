
public class ConnectFour
{

	public static void main(String[] args)
	{



		//Just some testing by Jesse Xu.
		int[][] board = new int[7][6];
		printTheBoard(board);
	}

    public static void printTheBoard(int[][] board)
    {
		for (int column=0;column<7;column++)
		{
			for (int row=0;row<6;row++)
			{
				System.out.print(board[column][row]);
				if (row != 5)
				System.out.print("|");
			}
			System.out.println();
			if (column != 6)
				System.out.println("----------");
		}
    }
}
