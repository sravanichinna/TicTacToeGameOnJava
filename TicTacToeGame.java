import java.util.Scanner;

public class TicTacToeGame {
	public static String Player;
	public static String Computer;
	
	public static char[] gameBoard() {
		char[] board =new char[10];
		for(int i=1;i<10;i++)
		{
			board[i]=' ';
			System.out.println("");
		}
		return board;
	}
	
//UC2
	public static String inputBoard()
	{
		String Player;
		String Computer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose Between O or X");
		Computer=scanner.next();
		if(Computer=="X")
		{
			Player="O";
		}
		else
		{
			Player="X";
		}
		return Computer;
	}
	public static void main(String[] args)
	{
		char[] board=gameBoard();
		String input=inputBoard();
	}

}

