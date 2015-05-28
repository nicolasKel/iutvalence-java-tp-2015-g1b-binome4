package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Grid;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;

public class Button extends JButton implements MouseListener
{
	private Position pos;
	private MainWindow window;

	public Button(Position pos, MainWindow window, ButtonColor color)
	{
		super();
		this.pos = pos;
		this.window = window;
		this.addMouseListener(this);
		if (color == ButtonColor.BLACK)
			this.setBackground(Color.BLACK);
		else
			this.setBackground(Color.YELLOW);
	}

	public ButtonColor changeColor()
	{
		if (this.getBackground() == Color.YELLOW)
		{
			this.setBackground(Color.BLACK);
			return ButtonColor.YELLOW;
		} else
		{
			this.setBackground(Color.YELLOW);
			return ButtonColor.YELLOW;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		window.swap(this.pos);
	}
}
