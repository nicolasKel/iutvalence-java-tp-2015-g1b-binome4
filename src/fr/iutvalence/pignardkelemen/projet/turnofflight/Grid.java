package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Grid {
    /* TODO JAVADOC. */
    private final int numberOfLines;
    /* TODO JAVADOC. */
    private final int numberOfColumns;
    /* TODO JAVADOC. */
    private final Lamp grid[][];

    /* TODO JAVADOC. */
    public Grid(int numberOfLine, int numberOfColumns) {
        this.numberOfLines = numberOfLine;
        this.numberOfColumns = numberOfColumns;
        grid = new Lamp[numberOfLine][numberOfColumns];
        for (int line = 0; line < numberOfLine; line++) {
            for (int column = 0; column < this.numberOfColumns ; column++) {
                grid[line][column] = new Lamp(State.OFF);
            }
        }
    }
}
