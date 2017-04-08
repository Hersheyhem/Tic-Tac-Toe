package tictactoe;

public class Board {

	String[][] grid = new String[3][3];


	public boolean isHorizontal() {
		if (Places.valueOf("X").equals(grid[0][0]) && Places.valueOf("X").equals(grid[0][1])
				&& Places.valueOf("X").equals(grid[0][2])
				|| Places.valueOf("Y").equals(grid[0][0]) && Places.valueOf("Y").equals(grid[0][1])
						&& Places.valueOf("Y").equals(grid[0][2]))
			return true;

		else if (Places.valueOf("X").equals(grid[1][0]) && Places.valueOf("X").equals(grid[1][1])
				&& Places.valueOf("X").equals(grid[1][2])
				|| Places.valueOf("Y").equals(grid[1][0]) && Places.valueOf("Y").equals(grid[1][1])
						&& Places.valueOf("Y").equals(grid[1][2]))
			return true;
		else if (Places.valueOf("X").equals(grid[2][0]) && Places.valueOf("X").equals(grid[2][1])
				&& Places.valueOf("X").equals(grid[2][2])
				|| Places.valueOf("Y").equals(grid[2][0]) && Places.valueOf("Y").equals(grid[2][1])
						&& Places.valueOf("Y").equals(grid[2][2]))
			return true;
		return false;

	}

	public boolean isVertical() {
		if (Places.valueOf("X").equals(grid[0][0]) && Places.valueOf("X").equals(grid[1][0])
				&& Places.valueOf("X").equals(grid[2][0])
				|| Places.valueOf("Y").equals(grid[0][0]) && Places.valueOf("Y").equals(grid[1][0])
						&& Places.valueOf("Y").equals(grid[2][0]))
			return true;

		else if (Places.valueOf("X").equals(grid[0][1]) && Places.valueOf("X").equals(grid[1][1])
				&& Places.valueOf("X").equals(grid[2][1])
				|| Places.valueOf("Y").equals(grid[0][1]) && Places.valueOf("Y").equals(grid[1][1])
						&& Places.valueOf("Y").equals(grid[2][1]))
			return true;
		else if (Places.valueOf("X").equals(grid[0][2]) && Places.valueOf("X").equals(grid[1][2])
				&& Places.valueOf("X").equals(grid[2][2])
				|| Places.valueOf("Y").equals(grid[0][2]) && Places.valueOf("Y").equals(grid[1][2])
						&& Places.valueOf("Y").equals(grid[2][2]))
			return true;
		return false;

	}

	public boolean isDiagonally() {
		if (Places.valueOf("X").equals(grid[0][0]) && Places.valueOf("X").equals(grid[1][1])
				&& Places.valueOf("X").equals(grid[2][2])
				|| Places.valueOf("Y").equals(grid[0][0]) && Places.valueOf("Y").equals(grid[1][1])
						&& Places.valueOf("Y").equals(grid[2][2]))
			return true;

		else if (Places.valueOf("X").equals(grid[0][2]) && Places.valueOf("X").equals(grid[1][1])
				&& Places.valueOf("X").equals(grid[2][0])
				|| Places.valueOf("Y").equals(grid[0][2]) && Places.valueOf("Y").equals(grid[1][1])
						&& Places.valueOf("Y").equals(grid[2][0]))
			return true;
		return false;

	}

}
