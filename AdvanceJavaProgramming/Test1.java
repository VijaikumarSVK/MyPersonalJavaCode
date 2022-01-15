package AdvanceJavaProgramming;

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
import javax.swing.JFrame;

class DrawPanel extends JPanel {
	private SecureRandom randomNumbers = new SecureRandom();
	private MyLine[] lines;

	public DrawPanel() {
		setBackground(Color.WHITE);

		lines = new MyLine[5 + randomNumbers.nextInt(5)];

		for (int count = 0; count < lines.length; count++) {
			int x1 = randomNumbers.nextInt(300);
			int y1 = randomNumbers.nextInt(300);
			int x2 = randomNumbers.nextInt(300);
			int y2 = randomNumbers.nextInt(300);

			Color color = new Color(randomNumbers.nextInt(256), randomNumbers.nextInt(256), randomNumbers.nextInt(256));

			lines[count] = new MyLine(x1, y1, x2, y2, color);
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (MyLine line : lines)
			line.draw(g);
	}
}

class MyLine {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Color color;

	public MyLine(int x1, int y1, int x2, int y2, Color color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}
}

public class Test1 {
	public static void main(String[] args) {
		DrawPanel panel = new DrawPanel();
		JFrame app = new JFrame();

		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.setSize(300, 300);
		app.setVisible(true);
	}
}