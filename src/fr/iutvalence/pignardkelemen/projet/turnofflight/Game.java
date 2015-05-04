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

		while (!win)
		{
			int line = 0;
			int column = 0;
			boolean saisieOk = false;

			while (!saisieOk)
			{
				try
				{
					System.out.println("Enter the line of the lamp you want :");
					line = sc.nextInt();
					if (line < 0 || line >= this.grid.getNumberOfLines())
						throw new InvalidEntryException();
					saisieOk = true;
				} catch (InvalidEntryException e)
				{
					System.err.println("\n*** Please enter a valid line ***");
				}
			}

			saisieOk = false;

			while (!saisieOk)
			{
				try
				{
					System.out.println("Enter the column of the lamp you want :");
					column = sc.nextInt();
					if (column < 0 || column >= this.grid.getNumberOfColumns())
						throw new InvalidEntryException();
					saisieOk = true;
				} catch (InvalidEntryException e)
				{
					System.err.println("\n*** Please enter a valid column ***");
				}
			}

			this.grid.swap(new Position(line, column));
			System.out.println(this.grid);
			if (this.grid.isAllShutdown())
			{
				// TODO
				win = true;
			}

		}

	}
}
