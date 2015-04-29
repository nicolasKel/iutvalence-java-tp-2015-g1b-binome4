package fr.iutvalence.pignardkelemen.projet.turnofflight;

import java.util.Scanner;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Game
{
	/* TODO JAVADOC. */
	private final Grid grid;
	/* TODO JAVADOC. */
	private final Player player;

	private boolean win;

	/* TODO Use the second constructor to define this one. */

	/* TODO JAVADOC. */
	public Game(int numberOfLines, int numberOfColumns)
	{
		this.grid = new Grid(numberOfLines, numberOfColumns);
		this.player = new Player();
		this.win = false;
	}

	/* TODO JAVADOC. */
	public Game(String nickName, int numberOfLines, int numberOfColumns)
	{
		this.grid = new Grid(numberOfLines, numberOfColumns);
		this.player = new Player(nickName);
		this.win = false;
	}

	/* TODO JAVADOC. */
	public void start()
	{
		System.out.println(this.grid);
	}

	public void gameLoop()
	{
		Scanner sc = new Scanner(System.in);

		while (win != true)
		{
			System.out.println("Enter the line of the lamp you want :");
			int line = sc.nextInt();
			System.out.println("Enter the column of the lamp you want :");
			int column = sc.nextInt();
			this.grid.swap(new Position(line, column));
			System.out.println(this.grid);
			if (this.grid.isAllShutdown()) {
				// TODO
				win = true;
			}

		}

	}
}
