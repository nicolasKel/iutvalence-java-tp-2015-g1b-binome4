package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.iutvalence.pignardkelemen.projet.turnofflight.controler.PositionInterface;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;

public class MainWindow extends JFrame
{
	public final static int WIDTH = 800;
	public final static int HEIGHT = 600;
	public final static String TITLE = "Turn off light";

	public MainWindow(int i, int j)
	{
		super(TITLE);
		this.setSize(WIDTH, HEIGHT);
		JPanel pannel = new JPanel();
		pannel.setLayout(new GridLayout(4, 4));
		for (int line = 0; line < i; line++)
		{
			for (int column = 0; column < j; column++)
			{
				Button button = new Button(new Position(line, column));
				pannel.add(button);
			}
		}
		this.setContentPane(pannel);
	}

	public void display()
	{
		this.setVisible(true);
	}

	public void closeWindow()
	{
		System.exit(0);
	}
}
