import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Please write your method here. 

public class AbhishekMethod 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int[][]board=new int [6][7];
		boolean flag = true; 
		System.out.println("choose a game mode:");
		System.out.println("choose 1 if you want to play player vs player");
		int a = in.nextInt();
			if(a==1)
			{
				PrintBoard(board);
			while(flag=true)
			{
				PlayerOne(board, flag);//gets input from player one and puts it into array 
	      if(CheckHorizontal1(board, flag))
	      {
	        flag=false;
	      }
	      if(CheckVertical1(board,flag))
	      {
	    	  flag=false;
	      }
				PlayerTwo(board,flag);
				 if(CheckHorizontal2(board, flag))
			      {
			        flag=false;
			      }
				 if(CheckVertical2(board,flag))
				 {
					 flag=false;
				 }
				
			}
		}
	}
		public static void PlayerOne(int[][] board, boolean flag)
		{
			Scanner in = new Scanner(System.in);
			int times = 0;
			int up = 0;
			System.out.println("Player one's turn");
			System.out.println("Please input a column");
			int col = in.nextInt();
			
				for(int c = board.length - 1; c >= 0; c--)
				{
					if(board[c][col] == 0) {
						board[c][col]=1;
						break;
					}

				}
			PrintBoard(board);
	    
		
		}
		public static void PrintBoard(int[][] board)
		{
	    System.out.println("  0  1  2  3  4  5  6");
	    System.out.println();
			for(int r = 0; r<board.length;r++ )
			{
				for(int c = 0; c < board[0].length; c++)
				{
					System.out.print( "| " + board[r][c]);
				}
				System.out.println(" |" + "   " + r);
				System.out.println("-----------------------");
			}
		}
		public static void PlayerTwo(int[][] board, boolean flag)
		{
			Scanner in = new Scanner(System.in);
			int times = 0;
			System.out.println("Player two's turn");
			System.out.println("Please input a column");
			int col = in.nextInt();
			for(int c = board.length - 1; c >= 0; c--)
			{
				if(board[c][col] == 0) {
					board[c][col]=2;
					break;
				}

			}
		PrintBoard(board);
    
		
		}
		public static boolean CheckHorizontal1(int[][] board, boolean flag)
		{
			int times = 0;
			while(flag==true)
	    {
				for(int r = 0; r<board.length;r++ )//puts down input in row and col.
				{
					for(int c = 0; c < 4; c++)
					{
						
						if(board[r][c]==1&&
						board[r][c+1]==1&&
						board[r][c+2]==1&&
						board[r][c+3]==1)
						{
							flag = false; 
						}
				  }
	      }
				break;
				
				
			}
			return flag;
	  }
		public static boolean CheckVertical1(int[][] board, boolean flag)
		{
			while(flag ==true)
			{
				for(int c = 0; c<board[0].length; c++)
				{
					for(int r = 0; r< 3; r++)
					{
						if(board[r][c]==1&&
								board[r+1][c]==1&&
								board[r+2][c]==1&&
								board[r+3][c]==1)
								{
									flag = false; 
								}
					}
					
				}
				break;
			}
			return flag;
		}
		public static boolean CheckHorizontal2(int[][] board, boolean flag)
		{
			int times = 0;
			while(flag==true)
	    {
				for(int r = 0; r<board.length;r++ )//puts down input in row and col.
				{
					for(int c = 0; c < 4; c++)
					{
						
						if(board[r][c]==2&&
						board[r][c+1]==2&&
						board[r][c+2]==2&&
						board[r][c+3]==2)
						{
							flag = false; 
						}
				  }
	      }
				break;
				
				
			}
			return flag;
		}
		public static boolean CheckVertical2(int[][] board, boolean flag)
		{
			while(flag == true)
			{
				for(int c = 0; c<board[0].length; c++)
				{
					for(int r = 0; r< 3; r++)
					{
						if(board[r][c]==2&&
								board[r+1][c]==2&&
								board[r+2][c]==2&&
								board[r+3][c]==2)
								{
									flag = false; 
								}
					}
					
				}
				break;
			}
			return flag;
		}
	}
