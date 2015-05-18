package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * Class which represent a position.
 *
 * @author kelemenn
 * @version 1.22
 */
public class Position
{
	/** Line the grid of lamp. */
	private int line;
	/** Column the grid of lamp. */
	private int column;

	/**
	 * Construtor with two parameters.
	 *
	 * @param line
	 *            One line the grid of lamp.
	 * @param column
	 *            One column the grid of lamp.
	 */
	public Position(int line, int column)
	{
		this.line = line;
		this.column = column;
	}

	/** Method which return one line in the grid of lamp. */
	public int getLine()
	{
		return this.line;
	}

	/** Method which return one column in the grid of lamp. */
	public int getColumn()
	{
		return this.column;
	}
}
