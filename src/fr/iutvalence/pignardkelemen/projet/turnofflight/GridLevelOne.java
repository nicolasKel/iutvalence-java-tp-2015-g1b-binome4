package fr.iutvalence.pignardkelemen.projet.turnofflight;

public class GridLevelOne extends Grid
{

	/* TODO JAVADOC. */
	public GridLevelOne(int numberOfLines, int numberOfColumns)
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
