package fr.iutvalence.pignardkelemen.projet.turnofflight;

import java.util.Scanner;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Game {
    /** Grid of lamps. */
    private final Grid   grid;
    /** Default name of players. */
    private final Player player;

    /* TODO JAVADOC. */
    public Game(int numberOfLines, int numberOfColumns) {
        grid = new GridRandom(numberOfLines, numberOfColumns);
        player = new Player();
    }

    /* TODO JAVADOC. */
    public Game(String nickName, int numberOfLines, int numberOfColumns) {
        grid = new GridRandom(numberOfLines, numberOfColumns);
        player = new Player(nickName);
    }

    /* TODO JAVADOC. */
    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println(grid);
        while (!grid.isAllShutdown()) {

            /* TODO In a private method. */
            boolean saisieNOK = true;
            int line = 0;
            while (saisieNOK) {
                try {
                    System.out.println("Enter the line of the lamp you want:");
                    line = sc.nextInt();
                    if ((line < 0) || (line >= grid.getNumberOfLines())) { throw new InvalidEntryException(); }
                    saisieNOK = false;
                }
                catch (InvalidEntryException ignore) {
                    System.err.println("\n*** Please enter a valid line ***");
                }
            }

            /* TODO Use the same method. */
            saisieNOK = true;
            int column = 0;
            while (saisieNOK) {
                try {
                    System.out.println("Enter the column of the lamp you want:");
                    column = sc.nextInt();
                    if ((column < 0) || (column >= grid.getNumberOfColumns())) { throw new InvalidEntryException(); }
                    saisieNOK = false;
                }
                catch (InvalidEntryException ignore) {
                    System.err.println("\n*** Please enter a valid column ***");
                }
            }

            grid.swap(new Position(line, column));
            System.out.println(grid);
        }
        // TODO Win message.

        // TODO Close the scanner
    }
}
