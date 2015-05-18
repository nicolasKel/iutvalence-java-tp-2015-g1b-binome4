package fr.iutvalence.pignardkelemen.projet.turnofflight;

import java.util.Scanner;

/**
 * Game class
 *
 * @author kelemenn
 * @version 1.0
 */
public class Game
{
	/** Grid of lamps. */
	private final Grid grid;
	/** Default name of players. */
	private final Player player;
	private Scanner entryUser;

	/**
	 * Construtor with two parameters.
	 *
	 * @param numberOfLines
	 *            The number of lines of the created grid.
	 * @param numberOfColumns
	 *            The number of columns of the created grid.
	 */
	public Game(int numberOfLines, int numberOfColumns)
	{
		grid = new GridLevelOne(numberOfLines, numberOfColumns);
		player = new Player();
		entryUser = new Scanner(System.in);
	}

	/**
	 * Construtor with three parameters.
	 * 
	 * @param nickName
	 *            The name of the player.
	 * @param numberOfLines
	 *            The number of lines of the created grid.
	 * @param numberOfColumns
	 *            The number of columns of the created grid.
	 */
	public Game(String nickName, int numberOfLines, int numberOfColumns)
	{
		grid = new GridLevelOne(numberOfLines, numberOfColumns);
		player = new Player(nickName);
		entryUser = new Scanner(System.in);
	}
	
	/* TODO JAVADOC */
	private void entry()
	{
		boolean saisieOK = false;
		int line = 0;
		while (!saisieOK)
		{
			try
			{
				System.out.println("Enter the line of the lamp you want:");
				line = entryUser.nextInt();
				if ((line < 0) || (line >= grid.getNumberOfLines()))
				{
					throw new InvalidEntryException();
				}
				saisieOK = true;
			} catch (InvalidEntryException ignore)
			{
				System.err.println("\n*** Please enter a valid line ***");
			}
		}
		
		saisieOK = false;
		int column = 0;
		while (!saisieOK)
		{
			try
			{
				System.out.println("Enter the column of the lamp you want:");
				column = entryUser.nextInt();
				if ((column < 0) || (column >= grid.getNumberOfColumns()))
				{
					throw new InvalidEntryException();
				}
				saisieOK = true;
			} catch (InvalidEntryException ignore)
			{
				System.err.println("\n*** Please enter a valid column ***");
			}
		}
		grid.swap(new Position(line, column));
	}

	/* TODO JAVADOC. */
	public void start()
	{
		
		System.out.println(grid);
		while (!grid.isAllShutdown())
		{
			entry();
			System.out.println(grid);
		}

		System.out.println("Congratulation, You have switched off all the lights!");

		entryUser.close();
	}
}
