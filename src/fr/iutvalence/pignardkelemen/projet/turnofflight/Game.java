package fr.iutvalence.pignardkelemen.projet.turnofflight;
/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */

public class Game
{
	private final Grid grid;
	private final Player player;
	
	public Game(int numberOfLines, int numberOfColumns)
	{
		this.grid = new Grid(numberOfLines, numberOfColumns);
		this.player = new Player();
	}
	
	public Game(String nickName, int numberOfLines, int numberOfColumns)
	{
		this.grid = new Grid(numberOfLines, numberOfColumns);
		this.player = new Player(nickName);
	}
	
	
	
	public void start()
	{
		System.out.println(this.grid);
	}
}
