import java.util.Scanner;

//Please write your method here. 

public class AbhishekMethod 
{

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	String[][]board=new String [7][6];
	System.out.println("choose a game mode:");
	System.out.println("choose 1 if you want to play player vs player");
	int a = in.nextInt();
		if(a==1)
		{
			for(int r = 0; r<board.length;r++ )
			{
				for(int c = 0; c < board[0].length; c++)
				{
					board[r][c]=" ";
					System.out.print("| " + board[r][c] + " |");

				}
				System.out.println();
			}
		}
	}

}
