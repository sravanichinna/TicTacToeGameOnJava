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
//UC3
	public static void ShowBoard(char[] Board)
	{
		for(int i=1;i<Board.length;i++)
		{
			System.out.println("|_"+Board[i]+"_|");

			if(i%3==0)
				System.out.println(System.lineSeparator());
		}
	}
//UC4
	public static int userChoice(char[] Board,Scanner userInput)
	{
		Integer[] validCells = {1,2,3,4,5,6,7,8,9};
		while(true)
		{
			System.out.println("what is your next move? (1-9):");
			int index = userInput.nextInt();
			if(Arrays.asList(validCells).contains(index) && isSpaceFree(Board,index))
				return index;
		}
	}
	public static void main(String[] args)
	{
		String Player=null;
		String Computer=null;
		char[] board=gameBoard();
		String[] input=inputBoard(Player,Computer);
		ShowBoard(board);
		int userChoice=userChoice(board,userInput);
	}
	

}

