package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import java.awt.Font;
import java.awt.GridLayout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Grid;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;

public class MainWindow extends JFrame
{
	public final static int WIDTH = 800;
	public final static int HEIGHT = 600;
	public final static String TITLE = "Turn off light";
	public final static String WIN = "Congratulation you WIN !!!";

	private JPanel pannel;
	private JPanel pannelWin;
	private JPanel pannelTitle;
	public static final JLabel LABEL_TITLE = new JLabel(TITLE);
	public static final JLabel LABEL_WIN = new JLabel(WIN);

	public MainWindow(int i, int j, Grid grid)
	{
		super(TITLE);
		this.setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pannel = new JPanel();
		pannelTitle = new JPanel();
		pannelWin = new JPanel();
		
		Font typeface = new Font("Arial", Font.BOLD, 8);
		LABEL_TITLE.setFont(typeface);
		LABEL_TITLE.setForeground(Color.blue);
		pannelTitle.add(LABEL_TITLE);

		pannel.setBackground(Color.white);
		pannel.setLayout(new GridLayout(i, j, 3, 3));
		for (int line = 0; line < i; line++)
		{
			for (int column = 0; column < j; column++)
			{
				Button button = new Button(new Position(line, column), this, ButtonColor.YELLOW);
				pannel.add(button);
			}
		}
		if (grid.getNumberOfLightsOn() == 0)
		{
			pannelWin.setBackground(Color.black);
			LABEL_WIN.setFont(typeface);
			LABEL_WIN.setForeground(Color.white);
			pannelWin.add(LABEL_WIN);
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

	public void swap(Position pos)
	{
		// TODO Auto-generated method stub
		
	}
}
