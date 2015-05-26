package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * Abstract class Grid to implement all the types of grids (random, half on...)
 *
 * @author kelemenn
 * @version 1.22
 */
public abstract class Grid
{
	/** Number of line of the grid. */
	protected final int numberOfLines;
	/** Number of column of the grid. */
	protected final int numberOfColumns;
	/** The grid. */
	protected final Lamp grid[][];
	/** Number of lights on in the grid. */
	protected int numberOfLightsOn;

	/**
	 * Constructor.
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
		this.numberOfLightsOn = 0;
		init();
	}

	/**
	 * Abstract method for the implementation of the grid. You HAVE TO init numberOfLightsOn and you HAVE TO have a full grid.
	 */
	protected abstract void init();

	/**
	 * Method to swap the light at the position specified in parameter and the neighbor.
	 *
	 * @param position
	 *            position of the light to swap.
	 */
	public void swap(Position position)
	{
		int line = position.getLine();
		int column = position.getColumn();

		if (grid[line][column].swap() == State.ON)
		{
			numberOfLightsOn++;
		}
		else
		{
			numberOfLightsOn--;
		}

		if (line != 0)
		{
			if (grid[line - 1][column].swap() == State.ON)
			{
				numberOfLightsOn++;
			}
			else
			{
				numberOfLightsOn--;
			}
		}
		if (column < (numberOfColumns - 1))
		{
			if (grid[line][column + 1].swap() == State.ON)
			{
				numberOfLightsOn++;
			}
			else
			{
				numberOfLightsOn--;
			}
		}
		if (column != 0)
		{
			if (grid[line][column - 1].swap() == State.ON)
			{
				numberOfLightsOn++;
			}
			else
			{
				numberOfLightsOn--;
			}
		}
		if (line < (numberOfLines - 1))
		{
			if (grid[line + 1][column].swap() == State.ON)
			{
				numberOfLightsOn++;
			}
		}
	}

	/** Method which is activated when all lights are turned off, win of the player. */
	public boolean isAllShutdown()
	{
		return numberOfLightsOn == 0;
	}

	/** Method which return the number of lines of the grid. */
	public int getNumberOfLines()
	{
		return numberOfLines;
	}

	/** Method which return the number of columns of the grid. */
	public int getNumberOfColumns()
	{
		return numberOfColumns;
	}

	/** Method which draw the grid on the window. Redefinition of the method toString from the Object class. */
	public final String toString()
	{
		String total = "";
		for (int line = -1; line < numberOfLines; line++)
		{
			if ( line == -1)
			{
				total += "_";
			}
			else
			{
				total += line;
			}
			for (int column = 0; column < numberOfColumns; column++)
			{
				if ( line == -1 )
				{
					total += "|" + column;
				}
				else
				{
					total += "|" + grid[line][column];
				}
			}
			total += "| \n";
		}
		return total;
	}
}
