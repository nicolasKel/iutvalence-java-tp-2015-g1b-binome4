package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Player
{
	/* TODO The default name should not be here. */
	/** Default player's nickname. */
	private static final String DEFAULT_NICKNAME = "player";
	/** Player's nickname. */
	private final String nickname;

	/** Default construtor. */
	public Player()
	{
		this.nickname = DEFAULT_NICKNAME;
	}

	/** Construtor with nickname parametre. */
	public Player(String nickname)
	{
		this.nickname = nickname;
	}
	
}
