package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * 
 * @author kelemenn
 *
 */

public class Lampe
{
	public final static boolean ALLUMEE = true;
	public final static boolean ETEINTE = false;
	public final static boolean ETAT_DEFAUT = false;
	
	private boolean etat;
	
	public Lampe()
	{
		this.etat = ETAT_DEFAUT;
	}
	
	public Lampe(boolean etatEntre) // TODO : Faire une enumeration pour les etats
	{
		this.etat = etatEntre;
	}
	
}
