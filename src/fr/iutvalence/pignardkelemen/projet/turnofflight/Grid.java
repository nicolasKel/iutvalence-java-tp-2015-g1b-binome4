package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Grid
{
	/** Number of line of the grid. */
	private final int numberOfLines;
	/** Number of column of the grid. */
	private final int numberOfColumns;
	/** The grid. */
	private final Lamp grid[][];

	/**
	 * Construtor.
	 *
	 * @param numberOfLines
	 *            The number of lines of the created grid.
	 * @param numberOfColumns
	 *            The number of columns of the created grid.
	 */
	public Grid(int numberOfLines, int numberOfColumns)
	{
		this.numberOfLines = numberOfLines;
		this.numberOfColumns = numberOfColumns;
		this.grid = new Lamp[numberOfLines][numberOfColumns];
		initRandom(numberOfLines, numberOfColumns);

	}

	/** Method which draw the grid on the window. */
	public String toString()
	{
		/* TODO StringBuilder */
		String total = "";
		for (int line = 0; line < numberOfLines; line++)
		{
			for (int column = 0; column < this.numberOfColumns; column++)
			{
				total += "|" + grid[line][column].toString();
			}
			total += "| \n";
		}
		return total;
	}

	private void init(int numberOfLines, int numberOfColumns)
	{
		for (int line = 0; line < numberOfLines; line++)
		{
			for (int column = 0; column < this.numberOfColumns; column++)
			{
				if ((line % 2) == (column % 2))
				{
					grid[line][column] = new Lamp(State.ON, new Position(line, column));
				} else
				{
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
				}
			}
		}
	}

	private void initRandom(int numberOfLines, int numberOfColumns)
	{
		for (int line = 0; line < numberOfLines; line++)
		{
			for (int column = 0; column < this.numberOfColumns; column++)
			{
				if (Math.random() > 0.5)
				{
					grid[line][column] = new Lamp(State.ON, new Position(line, column));
				} else
				{
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
				}
			}
		}
	}

	private void initlevel()
	{
		int level = 1;

		for (int line = 0; line < 9; line++)
		{
			for (int column = 0; column < 9; column++)
			{
				switch (level)
				{
				case 1:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[4][4] = new Lamp(State.ON, new Position(line, column));
						level = level + 1;
					}
					break;
				case 2:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[3][4] = new Lamp(State.ON, new Position(line, column));
						grid[4][3] = new Lamp(State.ON, new Position(line, column));
						grid[5][4] = new Lamp(State.ON, new Position(line, column));
						grid[4][5] = new Lamp(State.ON, new Position(line, column));
						level = level + 1;
					}
					break;
				case 3:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[3][4] = new Lamp(State.ON, new Position(line, column));
						grid[4][3] = new Lamp(State.ON, new Position(line, column));
						grid[5][4] = new Lamp(State.ON, new Position(line, column));
						grid[4][5] = new Lamp(State.ON, new Position(line, column));
						grid[1][1] = new Lamp(State.ON, new Position(line, column));
						grid[1][6] = new Lamp(State.ON, new Position(line, column));
						grid[6][1] = new Lamp(State.ON, new Position(line, column));
						grid[6][6] = new Lamp(State.ON, new Position(line, column));
						level = level + 1;
					}
					break;
				case 4:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[0][0] = new Lamp(State.ON, new Position(line, column));
						grid[0][7] = new Lamp(State.ON, new Position(line, column));
						grid[7][0] = new Lamp(State.ON, new Position(line, column));
						grid[7][7] = new Lamp(State.ON, new Position(line, column));
						grid[6][6] = new Lamp(State.ON, new Position(line, column));
						grid[5][5] = new Lamp(State.ON, new Position(line, column));
						grid[4][4] = new Lamp(State.ON, new Position(line, column));
						grid[3][3] = new Lamp(State.ON, new Position(line, column));
						grid[2][2] = new Lamp(State.ON, new Position(line, column));
						grid[1][1] = new Lamp(State.ON, new Position(line, column));
						level = level + 1;
					}
					break;
				case 5:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[4][0] = new Lamp(State.ON, new Position(line, column));
						grid[4][1] = new Lamp(State.ON, new Position(line, column));
						grid[4][2] = new Lamp(State.ON, new Position(line, column));
						grid[4][3] = new Lamp(State.ON, new Position(line, column));
						grid[4][4] = new Lamp(State.ON, new Position(line, column));
						grid[4][5] = new Lamp(State.ON, new Position(line, column));
						grid[4][6] = new Lamp(State.ON, new Position(line, column));
						grid[4][7] = new Lamp(State.ON, new Position(line, column));
						level = level + 1;
					}
					break;
				case 6:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[4][0] = new Lamp(State.ON, new Position(line, column));
						grid[4][1] = new Lamp(State.ON, new Position(line, column));
						grid[4][2] = new Lamp(State.ON, new Position(line, column));
						grid[4][3] = new Lamp(State.ON, new Position(line, column));
						grid[4][4] = new Lamp(State.ON, new Position(line, column));
						grid[4][5] = new Lamp(State.ON, new Position(line, column));
						grid[4][6] = new Lamp(State.ON, new Position(line, column));
						grid[4][7] = new Lamp(State.ON, new Position(line, column));
						level = level + 1;
					}
					break;
				case 7:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[2][4] = new Lamp(State.ON, new Position(line, column));
						grid[3][3] = new Lamp(State.ON, new Position(line, column));
						grid[4][2] = new Lamp(State.ON, new Position(line, column));
						grid[5][3] = new Lamp(State.ON, new Position(line, column));
						grid[6][4] = new Lamp(State.ON, new Position(line, column));
						grid[5][5] = new Lamp(State.ON, new Position(line, column));
						grid[4][6] = new Lamp(State.ON, new Position(line, column));
						grid[3][5] = new Lamp(State.ON, new Position(line, column));
						level = level + 1;
					}
					break;
				case 8:
					grid[line][column] = new Lamp(State.ON, new Position(line, column));
					if (line == 8 && column == 8)
					{
						level = level + 1;
					}
					break;
				default:
					grid[line][column] = new Lamp(State.OFF, new Position(line, column));
					if (line == 8 && column == 8)
					{
						grid[4][4] = new Lamp(State.ON, new Position(line, column));
					}
					break;
				}
			}
		}
	}

	public void swap(Position position)
	{
		this.grid[position.getLine()][position.getColumn()].swap();
		// TODO Swap des proches
	}

	public boolean isAllShutdown()
	{
		// TODO Auto-generated method stub
		return false;
	}
}
