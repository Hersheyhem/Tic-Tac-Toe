package tictactoe;

public class TicTacToe {

	public static void main(String[] args) {

		Board board = new Board();
		Player player = new Player(board);
		Player player2 = new Player(board);
		Player.startGame(player, player2);

	}
}
