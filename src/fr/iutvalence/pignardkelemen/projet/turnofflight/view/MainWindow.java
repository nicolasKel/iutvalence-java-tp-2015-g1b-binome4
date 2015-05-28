package fr.iutvalence.pignardkelemen.projet.turnofflight.view;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Grid;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Position;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.Lamp;
import fr.iutvalence.pignardkelemen.projet.turnofflight.model.State;

public class MainWindow extends JFrame
{
	public final static int WIDTH = 800;
	public final static int HEIGHT = 600;
	public final static String TITLE = "Turn off light";
	public final static String WIN = "Congratulation you WIN !!!";

	private JPanel panel;
	private JPanel panelWin;
	private JPanel panelTitle;
	public static final JLabel LABEL_TITLE = new JLabel(TITLE);
	private Button gridButton[][];
	private Grid grid;

	public MainWindow(Grid grid)
	{
		super(TITLE);
		this.setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.panel = new JPanel();
		this.grid = grid;
		this.panelTitle = new JPanel();
		this.panelWin = new JPanel();
		this.gridButton = new Button[grid.getNumberOfLines()][grid.getNumberOfColumns()];

	}

	public void loop()
	{
		panel.setBackground(Color.white);
		panel.setLayout(new GridLayout(grid.getNumberOfLines(), grid.getNumberOfColumns(), 3, 3));
		ButtonColor color = null;

		for (int line = 0; line < grid.getNumberOfLines(); line++)
		{
			for (int column = 0; column < grid.getNumberOfColumns(); column++)
			{
				if (grid.getLamp(new Position(line, column)).getState() == State.ON)
				{
					color = ButtonColor.YELLOW;
				} else
				{
					color = ButtonColor.BLACK;
				}
				Button button = new Button(new Position(line, column), this, color);
				this.gridButton[line][column] = button;
				panel.add(button);

			}
		}
		this.setContentPane(panel);

		while (!grid.isAllShutdown())
		{
			System.out.println(this.grid.getNumberOfLightsOn());
			this.display();
		}
		win();
	}

	public void win()
	{
		JOptionPane.showMessageDialog(null, WIN, "Win!", JOptionPane.INFORMATION_MESSAGE);
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
		grid.swap(pos);
		gridButton[pos.getLine()][pos.getColumn()].changeColor();

		if (pos.getLine() != 0)
		{
			gridButton[pos.getLine() - 1][pos.getColumn()].changeColor();
		}
		if (pos.getColumn() < (grid.getNumberOfColumns() - 1))
		{
			gridButton[pos.getLine()][pos.getColumn() + 1].changeColor();
		}
		if (pos.getColumn() != 0)
		{
			gridButton[pos.getLine()][pos.getColumn() - 1].changeColor();
		}
		if (pos.getLine() < (this.grid.getNumberOfLines() - 1))
		{
			gridButton[pos.getLine() + 1][pos.getColumn()].changeColor();
		}

	}
}
