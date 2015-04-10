package fr.iutvalence.pignardkelemen.projet.turnofflight;

/* TODO JAVADOC. */
public enum State
{
	/* TODO JAVADOC. */
	ON("X"),
	/* TODO JAVADOC. */
	OFF("O");
	
	private final String field;
	
	State (final String field)
	{
		this.field = field;
	}
	
	public String toString()
	{
		return field;
	}
}
