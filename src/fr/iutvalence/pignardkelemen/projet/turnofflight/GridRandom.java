package fr.iutvalence.pignardkelemen.projet.turnofflight;

public class GridRandom extends Grid
{

	public GridRandom(int numberOfLines, int numberOfColumns)
	{
		super(numberOfLines, numberOfColumns);
	}
	
	protected void init()
	{
		for (int line = 0; line < this.numberOfLines; line++)
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
