package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import javax.swing.JButton;

import fr.iutvalence.pignardkelemen.projet.turnofflight.controler.PositionInterface;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;

public class Button extends JButton
{
	Position pos;

	public Button(Position pos)
	{
		super();
		this.pos = pos;

	}
}
