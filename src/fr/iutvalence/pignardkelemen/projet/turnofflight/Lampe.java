package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Lampe {
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

    /* TODO JAVADOC. */
    public Etat changerEtat() {
        this.etat = (this.etat == Etat.ALLUME) ? Etat.ETEINT : Etat.ALLUME;
        return this.etat;
    }

    /* TODO JAVADOC. */
    public Etat getEtat() {
        return this.etat;
    }
}
