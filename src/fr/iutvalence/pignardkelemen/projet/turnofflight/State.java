package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * Enumeration of possible lamp's states.
 *
 * @author TODO
 * @version TODO
 */
public enum State {
    /** ON. */
    ON("X"),
    /** OFF. */
    OFF("O");

    /** Field for the method toString. */
    private final String field;

    /**
     * Constructor of enum State.
     *
     * @param field field for the method toString.
     */
    State(final String field) {
        this.field = field;
    }

    /** Redefinition of the method toString from the Object class. */
    public String toString() {
        return field;
    }
}
