package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Application
{
	/* TODO JAVADOC. */
	public static void main(String[] args)
	{
		Game game = new Game("Nicolas", 8, 8);
		game.start();
		game.gameLoop();
	}
}
