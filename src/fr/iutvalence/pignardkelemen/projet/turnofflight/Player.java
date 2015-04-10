package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Player {
    /* TODO JAVADOC. */
    private final String nickname;
    /* TODO JAVADOC. */
    private       int    score;
    /* TODO JAVADOC. */
    private       int    nbOfRounds;
    /**Default player's name*/
    private static final String DEFAULT_NICKNAME = "player"; 

    public Player()
    {
    	this.nickname = DEFAULT_NICKNAME;
    }
    
    public Player(String nickname)
    {
    	this.nickname = nickname;
    }
    
    /* TODO JAVADOC. */
    /* TODO Où est le calcul ? */
    public int calculateScore() {
    	this.score = nbOfRounds;
        return this.score;
    }
}
