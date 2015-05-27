package fr.iutvalence.pignardkelemen.projet.turnofflight.controler;

import java.util.Scanner;

import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Game;
import fr.iutvalence.pignardkelemen.projet.turnofflight.view.MainWindow;

/**
 * Class which contains the main method.
 *
 * @author kelemenn
 * @version 1.22
 */
public class Application
{
	/** The main method. This method is firstly run. */
	public static void main(String[] args)
	{
		guiLauncher();
	}

	public static void consoleLauncher()
	{
		Game game;
		Scanner entry = new Scanner(System.in);
		String answer;
		System.out.println("Do you want to enter your name? Y/N");
		answer = entry.next();
		if (answer.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter your name : ");
			answer = entry.next();
			game = new Game(answer, 4, 4);
		} else
		{
			game = new Game(4, 4);
		}

		game.start();
	}

	public static void guiLauncher()
	{
		Game game;
		game = new Game("Nicolas", 4, 4);
		MainWindow window = new MainWindow(4, 4, game.getGrid());
		window.display();
	}
}
