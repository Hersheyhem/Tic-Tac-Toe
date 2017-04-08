package tictactoe;

import java.util.Scanner;

public class Player {

	private String playerName;

	private static Board board;

	public Player(Board board) {
		this.board = board;
	}

	public String getName() {
		return playerName;
	}

	public void setName(String playerName) {
		this.playerName = playerName;
	}

	public void setX(int row, int column) {
		board.grid[row][column] = "X";
	}

	public void setY(int row, int column) {
		board.grid[row][column] = "Y";
	}

	public static void startGame(Player player, Player player2) {

		while (!board.getHorizontally() && !board.getDiagonally() && !board.getVertically()) {
			Scanner input = new Scanner(System.in);
			

			int row = input.nextInt();
			int column = input.nextInt();
			player.setX(row, column);
			board.checkIfTrue();
			

			int row2 = input.nextInt();
			int column2 = input.nextInt();
			player2.setY(row2, column2);
			board.checkIfTrue();
		
			board.getArray();
		}
	}

}
