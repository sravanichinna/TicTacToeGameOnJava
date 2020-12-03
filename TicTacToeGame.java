public class TicTacToeGame{
	public static char[] gameBoard() {
		System.out.println("Welcome to TicTacToe game");
		char[] board =new char[10];
		for(int i=1;i<10;i++)
		{
			board[i]='-';
			System.out.println("-");
			
		
		}
		return board;
	}
	public static void main(String[] args)
	{
		char[] board=gameBoard();
	}
}
