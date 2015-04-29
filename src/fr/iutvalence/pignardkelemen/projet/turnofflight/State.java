package fr.iutvalence.pignardkelemen.projet.turnofflight;

/* TODO JAVADOC. */
public enum State
{
	/* TODO JAVADOC. */
	ON("X"),
	/* TODO JAVADOC. */
	OFF("O");

	/* TODO JAVADOC. */
	private final String field;

	/* TODO JAVADOC. */
	State(final String field)
	{
		this.field = field;
	}

	/* TODO JAVADOC. */
	public String toString()
	{
		return field;
	}
}
