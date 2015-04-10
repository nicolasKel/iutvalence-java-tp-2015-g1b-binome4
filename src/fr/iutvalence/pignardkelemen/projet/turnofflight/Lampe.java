package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Lampe {
    // TODO : Faire une enumeration pour les etats
    /* TODO JAVADOC. */
    public static final Etat ETAT_DEFAUT = Etat.ETEINT;
    /* TODO JAVADOC. */
    private Etat etat;

    /* TODO JAVADOC. */
    public Lampe() {
        this.etat = ETAT_DEFAUT;
    }

    /* TODO JAVADOC. */
    public Lampe(Etat etatEntre) {
        this.etat = etatEntre;
    }
    
    public Etat changerEtat()
    {
    	if (this.etat == Etat.ALLUME)
    	{
    		this.etat = Etat.ETEINT;
    	}
    	
    	else
    	{
    		this.etat = Etat.ALLUME;
    	}
    	
    	return this.etat;
    }
    
    public Etat getEtat()
    {
    	return this.etat;
    }
}
