package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;

public class Button extends JButton implements MouseListener
{
	private Position pos;
	private Image imageBlack;
	private Image imageLight;

	public Button(Position pos, MainWindow window, ButtonColor color)
	{
		super();
		this.pos = pos;
		/*try
		{
			imageLight = ImageIO.read(new File("ampoule.png"));
			imageBlack = ImageIO.read(new File("black.png"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		*/
		this.addMouseListener(this);
		if (color == ButtonColor.BLACK)
			this.setBackground(Color.BLACK);
		else
			this.setBackground(Color.YELLOW);
	}

	public void mouseClicked(MouseEvent event, MainWindow window)
	{
		window.swap(pos);
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
		// TODO Auto-generated method stub
		
	}
}
