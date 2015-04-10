package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Grille {
	/* TODO JAVADOC. */
	private final int nbLignes;
	/* TODO JAVADOC. */
	private final int nbColonnes;
	/* TODO JAVADOC. */
	/* TODO final??  */
	private Lampe grille[][];

	/* TODO JAVADOC. */
	public Grille(int nbLig, int nbCol) {
		int ligne, colonne;
		this.nbLignes = nbLig;
		this.nbColonnes = nbCol;
		for (ligne=0; ligne < nbLig; ligne++)
		{
			for (colonne=0; colonne < nbCol; colonne++)
			{
				grille[ligne][colonne] = new Lampe(Etat.ETEINT);
			}
		}
	}
}
