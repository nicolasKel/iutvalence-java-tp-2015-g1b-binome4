package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * Class GridLevelOne inherited from Grid class.
 *
 * @author kelemenn
 * @version 1.22
 */
public class GridLevelOne extends Grid
{

	/**
	 * Construtor with two parameters.
	 *
	 * @param numberOfLines
	 *            The number of lines of the created grid.
	 * @param numberOfColumns
	 *            The number of columns of the created grid.
	 */
	public GridLevelOne(int numberOfLines, int numberOfColumns)
	{
		super(numberOfLines, numberOfColumns);
	}

	/**
	 * Redefinition of the abstract method from Grid. Initialisation of the Level One grid.
	 */
	@Override
	protected void init()
	{
		for (int line = 0; line < this.numberOfLines; line++)
		{
			for (int column = 0; column < this.numberOfColumns; column++)
			{
				Position position = new Position(line, column);
				State initial;
				if ((line / 2) == (column / 2))
				{
					initial = State.ON;
					numberOfLightsOn++;
				} 
				else
				{
					initial = State.OFF;
				}
				grid[line][column] = new Lamp(initial, position);
			}
		}
	}
}
