package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * 
 * @author kelemenn
 *
 */

public class Grille
{
	private final int nbLignes;
	private final int nbColonnes;
	private Lampe grille[][];

	public Grille(int nbLig, int nbCol)
	{
		this.nbLignes = nbLig;
		this.nbColonnes = nbCol;
	}
}
