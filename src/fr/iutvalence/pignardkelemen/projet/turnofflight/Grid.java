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
		grid = new Lamp[numberOfLines][numberOfColumns];
		/*
		 * TODO Extract this init in a private method and later a dedicated class. The initial state generator.
		 */
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

	public Lamp getLamp(Position position)
	{
		return this.grid[position.getLine()][position.getColumn()];
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
}
