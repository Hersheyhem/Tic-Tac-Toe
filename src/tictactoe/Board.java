package tictactoe;

import java.util.Arrays;

public class Board {

	String[][] grid = new String[3][3];
	boolean diagonally;
	boolean horizontally;
	boolean vertically;
	String xValue = "X";
	String vValue = "Y";

	public boolean isHorizontal() {
		if (xValue.equals(grid[0][0]) && xValue.equals(grid[0][1]) && xValue.equals(grid[0][2])
				|| vValue.equals(grid[0][0]) && vValue.equals(grid[0][1]) && vValue.equals(grid[0][2]))
			return true;

		else if (xValue.equals(grid[1][0]) && xValue.equals(grid[1][1]) && xValue.equals(grid[1][2])
				|| vValue.equals(grid[1][0]) && vValue.equals(grid[1][1]) && vValue.equals(grid[1][2]))
			return true;
		else if (xValue.equals(grid[2][0]) && xValue.equals(grid[2][1]) && xValue.equals(grid[2][2])
				|| vValue.equals(grid[2][0]) && vValue.equals(grid[2][1]) && vValue.equals(grid[2][2]))
			return true;
		return false;

	}

	public boolean isVertical() {
		if (xValue.equals(grid[0][0]) && xValue.equals(grid[1][0]) && xValue.equals(grid[2][0])
				|| vValue.equals(grid[0][0]) && vValue.equals(grid[1][0]) && vValue.equals(grid[2][0]))
			return true;

		else if (xValue.equals(grid[0][1]) && xValue.equals(grid[1][1]) && xValue.equals(grid[2][1])
				|| vValue.equals(grid[0][1]) && vValue.equals(grid[1][1]) && vValue.equals(grid[2][1]))
			return true;
		else if (xValue.equals(grid[0][2]) && xValue.equals(grid[1][2]) && xValue.equals(grid[2][2])
				|| vValue.equals(grid[0][2]) && vValue.equals(grid[1][2]) && vValue.equals(grid[2][2]))
			return true;
		return false;

	}

	public boolean isDiagonally() {
		if (xValue.equals(grid[0][0]) && xValue.equals(grid[1][1]) && xValue.equals(grid[2][2])
				|| vValue.equals(grid[0][0]) && vValue.equals(grid[1][1]) && vValue.equals(grid[2][2]))
			return true;

		else if (xValue.equals(grid[0][2]) && xValue.equals(grid[1][1]) && xValue.equals(grid[2][0])
				|| vValue.equals(grid[0][2]) && vValue.equals(grid[1][1]) && vValue.equals(grid[2][0]))
			return true;
		return false;

	}

	public void checkIfTrue() {
		diagonally = isDiagonally();
		horizontally = isHorizontal();
		vertically = isVertical();

	}

	public boolean getDiagonally() {
		return diagonally;
	}

	public boolean getHorizontally() {
		return horizontally;
	}

	public boolean getVertically() {
		return vertically;
	}

	public void getArray() {
		System.out.println(Arrays.deepToString(grid));
	}

}
