import java.awt.*;


public class handWriter {
	
	private int ha, ma, sa, x, y, diameter;
	private Color c1, c2, c3;
	
	public handWriter(int h, int m, int s, int x_, int y_, int dia, Color a, Color b, Color c) {
		ha = h;
		ma = m;
		sa = s;
		c1 = a;
		c2 = b;
		c3 = c;
		x = x_;
		y = y_;
		diameter = dia;
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(c1);
		g.fillArc(x+10,y+10,diameter-20,diameter-20,sa,3);
		
		g.setColor(c2);
		g.fillArc(x+5, y+5, diameter-10, diameter-10, ma, 3);
		
		g.setColor(c3);
		g.fillArc(x+25,y+25,diameter-50,diameter-50, ha,-3);
	}

	

}
