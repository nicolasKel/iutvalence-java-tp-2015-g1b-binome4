package fr.iutvalence.pignardkelemen.projet.turnofflight;

public class GridHalfOn extends Grid
{
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

}
