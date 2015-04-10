package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Player
{
	/** Default player's nickname. */
	private static final String DEFAULT_NICKNAME = "player";
	/** Player's nickname. */
	private final String nickname;

	/* TODO JAVADOC. */
	public Player()
	{
		this.nickname = DEFAULT_NICKNAME;
	}

	/* TODO JAVADOC. */
	public Player(String nickname)
	{
		this.nickname = nickname;
	}

}
