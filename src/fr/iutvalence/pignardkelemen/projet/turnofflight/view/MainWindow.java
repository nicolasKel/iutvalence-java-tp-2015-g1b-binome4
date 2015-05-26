package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import java.awt.GridLayout;
import fr.iutvalence.pignardkelemen.projet.turnofflight.controler.PositionInterface;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.iutvalence.pignardkelemen.projet.turnofflight.controler.PositionInterface;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;

public class MainWindow extends JFrame
{
	public final static int WIDTH = 800;
	public final static int HEIGHT = 600;
	public final static String TITLE = "Turn off light";
	public final static String WIN = "Congratulation you WIN !!!";

	public Bouton bouton = new Bouton();
	public JPanel pannel = new JPanel();
	public JPanel pannelWin = new JPanel();
	public JLabel title = new JLabel(TITLE);
	public JLabel win = new JLabel(WIN);

	public MainWindow(int i, int j)
	{
		super(TITLE);
		this.setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font typeface = new Font("Arial", Font.BOLD, 8);
		title.setFont(typeface);
		title.setForeground(Color.blue);
		pannel.add(title);

		pannel.setBackground(Color.white);
		pannel.setLayout(new GridLayout(4, 4, 3, 3));
		for (int line = 0; line < i; line++)
		{
			for (int column = 0; column < j; column++)
			{
				Button button = new Button(new Position(line, column));
				pannel.add(button);
			}
		}
		if (Grid.numberOfLightsOn == 0)
		{
			pannelWin.setBackground(Color.black);
			win.setFont(typeface);
			win.setForeground(Color.white);
			pannelWin.add(win);
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
