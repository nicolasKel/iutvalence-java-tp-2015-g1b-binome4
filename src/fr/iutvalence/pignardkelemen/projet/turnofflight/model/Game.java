package fr.iutvalence.pignardkelemen.projet.turnofflight.model;

import java.util.Scanner;

/**
 * Game class
 *
 * @author kelemenn
 * @version 1.22
 */
public class Game
{
    /** Default player's nickname. */
    private static final String DEFAULT_PLAYER_NICKNAME = "player";
	/** Grid of lamps. */
	private final Grid grid;
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
		player = new Player(DEFAULT_PLAYER_NICKNAME);
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
	
	/** Method to get the entry of a user and swap at the answered position. */
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

	/** This method loop while the player don't win. */
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
	
	public Grid getGrid()
	{
		return this.grid;
	}
}
