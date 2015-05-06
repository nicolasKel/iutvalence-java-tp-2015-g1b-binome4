package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Lamp
{
	/** Constant for the default state of a lamp. */
	public static final State DEFAULT_STATE = State.OFF;
	/** State of a lamp (On/Off). */
	private State state;
	/** Position of the lamp (contains line and column). */
	private final Position pos;

	/** Default constructor. */
	public Lamp()
	{
		this.state = DEFAULT_STATE;
		this.pos = new Position (0,0);
	}

	/** 
	 * Constructor with two parameters.
	 * @param: state
	 * 			State of the lamp you want to construct(On/Off).
	 * @param position
	 * 			Position of the lamp you want to construct.
	 */
	public Lamp(State state, Position position)
	{
		this.state = state;
		this.pos = position;
	}

	/**  */
	public State swap()
	{
		this.state = (this.state == State.ON) ? State.OFF : State.ON;
		return this.state;
	}

	/* TODO JAVADOC. */
	public State state()
	{
		return this.state;
	}
	
	public String toString()
	{
		return state.toString();
	}
}
