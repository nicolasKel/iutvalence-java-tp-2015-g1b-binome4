package fr.iutvalence.pignardkelemen.projet.turnofflight;

/**
 * TODO JAVADOC.
 *
 * @author kelemenn
 * @version TODO
 */
public class Lamp
{
	/* TODO JAVADOC. */
	public static final State DEFAULT_STATE = State.OFF;
	/* TODO JAVADOC. */
	private State state;
	private final Position pos;

	/* TODO JAVADOC. */
	public Lamp()
	{
		this.state = DEFAULT_STATE;
		this.pos = new Position (0,0);
	}

	/* TODO JAVADOC. */
	public Lamp(State state, Position position)
	{
		this.state = state;
		this.pos = position;
	}

	/* TODO JAVADOC. */
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
