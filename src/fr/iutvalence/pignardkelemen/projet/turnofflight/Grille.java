package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Grille {
    /* TODO JAVADOC. */
    private final int   nbLignes;
    /* TODO JAVADOC. */
    private final int   nbColonnes;
    /* TODO JAVADOC. */
    private final Lampe grille[][];

    /* TODO JAVADOC. */
    public Grille(int nbLig, int nbCol) {
        this.nbLignes = nbLig;
        this.nbColonnes = nbCol;
        grille = new Lampe[nbLig][nbCol];
        for (int ligne = 0; ligne < nbLig; ligne++) {
            for (int colonne = 0; colonne < nbCol; colonne++) {
                grille[ligne][colonne] = new Lampe(Etat.ETEINT);
            }
        }
    }
}
