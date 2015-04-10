package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Player {
    /** Default player's name. */
    private static final String DEFAULT_NICKNAME = "player";
    /* TODO JAVADOC. */
    private final String nickname;
    /* TODO Init ? */
    /* TODO JAVADOC. */
    private       int    score;
    /* TODO Why here ??? */
    /* TODO JAVADOC. */
    private       int    round;

    /* TODO JAVADOC. */
    public Player() {
        this.nickname = DEFAULT_NICKNAME;
    }

    /* TODO JAVADOC. */
    public Player(String nickname) {
        this.nickname = nickname;
    }

    /* TODO JAVADOC. */
    public int calculateScore() {
        /* TODO ??? */
        this.score = round;
        return this.score;
    }
}
