package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import javax.swing.JButton;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException; 
import javax.imageio.ImageIO

import fr.iutvalence.pignardkelemen.projet.turnofflight.controler.PositionInterface;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;

public class Button extends JButton implements MouseListener
{
	private Position pos;
	private Image image;

	public Button(Position pos)
	{
		super();
		this.pos = pos;
		if( true )
		{
			try
			{
				img = ImageIO.read(new File("ampoule.png"));
			{
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}else
		{
			try
			{
				img = ImageIO.read(new File("black.png"));
			{
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		this.addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent event)
	{
		Grid.swap(pos);
	}
}

