package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
// TODO Abstract class.
public abstract class Grid
{
	/** Number of line of the grid. */
	protected final int numberOfLines;
	/** Number of column of the grid. */
	protected final int numberOfColumns;
	/** The grid. */
	protected final Lamp grid[][];
	protected int numberOfLightsOn;

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
		init();

	}

	/** Method which draw the grid on the window. Redefinition of the method toString from the Object class */
	public String toString()
	{
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

	/**
	 * Abstract method for the implementation of the grid.
	 * You HAVE TO init numberOfLightsOn and you HAVE TO have a full grid 
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
		
		if (this.grid[line][column].swap() == State.ON)
		{
			this.numberOfLightsOn++;
		}

		if (line != 0)
		{
			if (this.grid[line - 1][column].swap() == State.ON)
			{
				this.numberOfLightsOn++;
			}
		}
		if (column < this.numberOfColumns - 1)
		{
			if (this.grid[line][column + 1].swap() == State.ON)
			{
				this.numberOfLightsOn++;
			}
		}
		if (column != 0)
		{
			if (this.grid[line][column - 1].swap() == State.ON)
			{
				this.numberOfLightsOn++;
			}
		}
		if (line < this.numberOfLines - 1)
		{
			if (this.grid[line + 1][column].swap() == State.ON)
			{
				this.numberOfLightsOn++;
			}
		}
	}

	public boolean isAllShutdown()
	{
		return numberOfLightsOn == 0;
	}

	public int getNumberOfLines()
	{
		return this.numberOfLines;
	}

	public int getNumberOfColumns()
	{
		return this.numberOfColumns;
	}
}
