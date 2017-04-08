package tictactoe;

import java.util.Scanner;

public class Player {

	private String playerName;
	private Places places;
	private int row;
	private int column;
	private Board board;

	public Player(Board board) {
		this.board = board;
	}

	public String getName() {
		return playerName;
	}

	public void setName(String playerName) {
		this.playerName = playerName;
	}

	public Places getPlace() {
		return places;
	}

	public void setPlace(Places places) {
		this.places = places;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setRowAndColumn(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public static void startGame(Player player, Player player2) {
		Scanner input = new Scanner(System.in);
		System.out.println("choose X or Y");
		player.setPlace(Places.X);
		int row = input.nextInt();
		int column = input.nextInt();

		player.setRowAndColumn(row, column);
		player.setPlace(Places.Y);
		int row2 = input.nextInt();
		int column2 = input.nextInt();
		player2.setRowAndColumn(row2, column2);
	}
}

