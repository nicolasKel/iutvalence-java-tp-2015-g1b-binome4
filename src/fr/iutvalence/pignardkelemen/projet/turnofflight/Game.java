package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Game {
    /* TODO JAVADOC. */
    private final Grid   grid;
    /* TODO JAVADOC. */
    private final Player player;

    /* TODO Use the second constructor to define this one. */
    
    /* TODO JAVADOC. */
    public Game(int numberOfLines, int numberOfColumns) {
        this.grid = new Grid(numberOfLines, numberOfColumns);
        this.player = new Player();
    }

    /* TODO JAVADOC. */
    public Game(String nickName, int numberOfLines, int numberOfColumns) {
        this.grid = new Grid(numberOfLines, numberOfColumns);
        this.player = new Player(nickName);
    }

    /* TODO JAVADOC. */
    public void start() {
        System.out.println(this.grid);
    }
}
