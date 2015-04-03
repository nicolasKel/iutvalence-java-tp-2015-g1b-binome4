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
    public static final boolean ALLUMEE     = true;
    /* TODO JAVADOC. */
    public static final boolean ETEINTE     = false;
    /* TODO JAVADOC. */
    public static final boolean ETAT_DEFAUT = false;
    /* TODO JAVADOC. */
    /* TODO final ??? */
    private final boolean etat;

    /* TODO JAVADOC. */
    public Lampe() {
        etat = ETAT_DEFAUT;
    }

    /* TODO JAVADOC. */
    public Lampe(boolean etatEntre) {
        etat = etatEntre;
    }
}
