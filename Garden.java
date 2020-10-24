import java.awt.*;
import javax.swing.*;

public class Garden extends JPanel{
	
	private int width;
	private int height;
	
	public Garden(int w, int h) {
		width = w;
		height = h;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("MyGarden");
		f.setSize(width + 16,height + 39);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public void paintComponent(Graphics g) {
		drawGround(g,1000,1000);
		drawFlower(g, 500, 500, 100, Color.yellow, Color.pink);
		drawFlower(g, 100, 100, 200,Color.yellow, Color.blue);
		drawFlower(g, 80, 400, 100, Color.yellow, Color.white);
		drawFlower(g, 650, 250, 300, Color.white, Color.red);
		drawFlower(g, 100, 800, 150, Color.white, Color.orange);
		drawFlower(g, 80, 600, 80, Color.white, Color.cyan);
		drawFlower(g, 650, 700, 300, Color.black, Color.yellow);
		drawFlower(g, 250, 500, 100, Color.black, Color.blue);
		drawFlower(g, 350, 650, 250, Color.red, Color.yellow);
		drawFlower(g, 450, 200, 150, Color.red, Color.black);
		drawFlower(g, 750, 50, 150, Color.MAGENTA, Color.orange);
	}
	
	public void drawGround (Graphics g, int w, int h) {
		width = w;
		height = h;
		g.setColor(Color.green);
		g.fillRect(0, 0, width, height);
	}

	public void drawFlower(Graphics g, int x, int y, int size, Color c1, Color c2) {
		drawPetal(g, x, y, size, 30, c2);
		g.setColor(c1);
		g.fillArc(x+size/3,y+size/3,size/3,size/3,0,360);
	}
	
	public void drawPetal(Graphics g, int x, int y, int size, int angle, Color color) {
		g.setColor(color);
		g.fillArc(x, y, size, size, 0*angle , angle);
		g.fillArc(x, y, size, size, 2*angle , angle);
		g.fillArc(x, y, size, size, 4*angle , angle);
		g.fillArc(x, y, size, size, 6*angle , angle);
		g.fillArc(x, y, size, size, 8*angle , angle);
		g.fillArc(x, y, size, size, 10*angle , angle);
		
	}
	
	public static void main(String[] args) {
		new Garden(1000, 1000);
	}
}
