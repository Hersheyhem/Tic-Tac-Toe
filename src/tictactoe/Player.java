package tictactoe;



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

	public void setX(int row, int column) {
		board.grid[row][column] = "X";
	}

	public void setY(int row, int column) {
		board.grid[row][column] = "Y";
	}

	public static void startGame(Player player, Player player2) {
		Scanner input = new Scanner(System.in);
		System.out.println("choose X or Y");
		player.setPlace(Places.X);
		int row = input.nextInt();
		int column = input.nextInt();
		player.setX(row, column);
                System.out.println("choose X or Y");
		player2.setPlace(Places.Y);
		int row2 = input.nextInt();
		int column2 = input.nextInt();
		player2.setY(row2, column2);
	}
}


