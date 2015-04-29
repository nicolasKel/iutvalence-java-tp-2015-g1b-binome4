package fr.iutvalence.pignardkelemen.projet.turnofflight;

public class Position
{
	private int line;
	private int column;
	
	public Position(int line, int column)
	{
		this.line = line;
		this.column = column;
	}
	
	public int getLine()
	{
		return this.line;
	}
	
	public int getColumn()
	{
		return this.column;
	}
}
