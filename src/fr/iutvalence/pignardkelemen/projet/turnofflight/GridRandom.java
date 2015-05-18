package fr.iutvalence.pignardkelemen.projet.turnofflight;

/* TODO JAVADOC. */
public class GridRandom extends Grid
{
	/** Ratio of ON lights. */
	private static final double ON_RATIO = 0.5;

	/**
	 * Construtor with two parameters.
	 *
	 * @param numberOfLines
	 *            The number of lines of the created grid.
	 * @param numberOfColumns
	 *            The number of columns of the created grid.
	 */
	public GridRandom(int numberOfLines, int numberOfColumns)
	{
		super(numberOfLines, numberOfColumns);
	}

	/* TODO JAVADOC. */
	@Override
	protected void init()
	{
		for (int line = 0; line < this.numberOfLines; line++)
		{
			for (int column = 0; column < this.numberOfColumns; column++)
			{
				Position position = new Position(line, column);
				State initial = (Math.random() > ON_RATIO) ? State.ON : State.OFF;
				grid[line][column] = new Lamp(initial, position);
			}
		}
	}
}
