package fr.iutvalence.pignardkelemen.projet.turnofflight;

// TODO Create a dedicated package

/* TODO JAVADOC. */
public class GridHalfOn extends Grid
{

	/* TODO JAVADOC. */
	public GridHalfOn(int numberOfLines, int numberOfColumns)
	{
		super(numberOfLines, numberOfColumns);
	}

	@Override
	protected void init()
	{
		for (int line = 0; line < this.numberOfLines; line++)
		{
			for (int column = 0; column < this.numberOfColumns; column++)
			{
				Position position = new Position(line, column);
				State initial;
				if ((line % 2) == (column % 2))
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
