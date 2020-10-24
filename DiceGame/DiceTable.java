import javax.swing.*;
import java.awt.*;

public class DiceTable extends JPanel {

	private int Width = 800;
	private int Height = 800;
	private Font font1 = new Font("Consolas", Font.PLAIN, 20);
	static String p1;
	static String p2;
	static int d1;
	static int d2;
	static int d3;
	static int d4;
	
	
	public DiceTable() {
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("DiceGame");
		f.setSize(Width+16,Height+39);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void resultreader(String player1, String player2, int dice1, int dice2, int dice3, int dice4) {
		p1 = player1;
		p2 = player2;
		d1 = dice1;
		d2 = dice2;
		d3 = dice3;
		d4 = dice4;
		
	}
	
	public static String inputPlayers() {
		String player = JOptionPane.showInputDialog("플레이어의 이름을 입력하세요.");
		return player;
	}
	
	
	public void paintComponent(Graphics g) {
		drawTable(g);
		drawDice(g, 100, 100, 200, d1, Color.white, Color.black);
		drawDice(g, 100, 500, 200, d2, Color.white, Color.black);
		drawDice(g, 500, 100, 200, d3, Color.black, Color.white);
		drawDice(g, 500, 500, 200, d4, Color.black, Color.white);
		this.repaint();
	}
	
	public void drawTable(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(0, 0, Width+16, Height+39);
		g.setColor(Color.white);
		g.setFont(font1);
		g.drawString("player1: "+p1, 100, 50);
		g.setColor(Color.black);
		g.setFont(font1);
		g.drawString("player2: "+p2, 500, 50);
	}
	
	public void drawDice(Graphics g, int x, int y, int size, int num, Color c1, Color c2) {
		g.setColor(c1);
		g.fillRect(x,y,size,size);
		if (num == 1) {
			g.setColor(c2);
			g.fillOval(x+size/3, y+size/3, size/5, size/5);
		}
		else if (num == 2) {
			g.setColor(c2);
			g.fillOval(x+size/4, y+size/3, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3, size/5, size/5);
		}
		else if (num == 3) {
			g.setColor(c2);
			g.fillOval(x+size/4-10, y+size/3, size/5, size/5);
			g.fillOval(x+size/2-10, y+size/3, size/5, size/5);
			g.fillOval(x+size*3/4-10, y+size/3, size/5, size/5);
		}
		else if (num == 4) {
			g.setColor(c2);
			g.fillOval(x+size/4, y+size/3-40, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3-40, size/5, size/5);
			g.fillOval(x+size/4, y+size/3+40, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3+40, size/5, size/5);
		}
		else if (num == 5) {
			g.setColor(c2);
			g.fillOval(x+size/4, y+size/3-40, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3-40, size/5, size/5);
			g.fillOval(x+size/3+10, y+size/3, size/5, size/5);
			g.fillOval(x+size/4, y+size/3+40, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3+40, size/5, size/5);
		}
		else if (num == 6) {
			g.setColor(c2);
			g.fillOval(x+size/4, y+size/3-50, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3-50, size/5, size/5);
			g.fillOval(x+size/4, y+size/3, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3, size/5, size/5);
			g.fillOval(x+size/4, y+size/3+50, size/5, size/5);
			g.fillOval(x+size/4+60, y+size/3+50, size/5, size/5);
		}
		
	}
	

}
