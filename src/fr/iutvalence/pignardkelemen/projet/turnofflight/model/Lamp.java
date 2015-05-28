package fr.iutvalence.pignardkelemen.projet.turnofflight.model;

/**
 * Class which represent a Lamp.
 *
 * @author kelemenn
 * @version 1.22
 */
public class Lamp {
    /** Position of the lamp (contains line and column). */
    private final Position pos;
    /** State of a lamp (On/Off). */
    private       State    state;


	/**
	 * Constructor with two parameters.
	 * 
	 * @param state
	 *            State of the lamp.
	 * @param position
	 *            Position of the lamp you want to construct.
	 */
    public Lamp(State state, Position position) {
        this.state = state;
        this.pos = position;
    }

    /** Method which change the light state. */
    public State swap() {
        this.state = (this.state == State.ON) ? State.OFF : State.ON;
        return this.state;
    }

    /** Getter which return the state of a lamp. */
    public State getState() {
        return this.state;
    }

	/** Method which draw the state of the lamp on the window. Redefinition of the toString method from the Object class. */
    public String toString() {
        return state.toString();
    }
}
