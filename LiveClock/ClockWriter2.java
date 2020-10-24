import java.awt.*;

public class ClockWriter2 {
	
	private int diameter,x1,y1;
	private Color c1, c2, c3, c4;
	private Font font = new Font("Consolas", Font.PLAIN, 9);

	public ClockWriter2(int dia, int x_1, int y_1, Color a, Color b, Color c, Color d) {
		diameter = dia;
		c1 = a;
		c2 = b;
		c3 = c;
		c4 = d;
		x1 = x_1;
		y1 = y_1;
	}
	
	public void paintComponent(Graphics g, int size) {
		g.setColor(Color.white);
		g.fillRect(0, 0, size, size);
		
		g.setColor(c3);
		g.fillRect(0, 0, 100, 45);
		g.setColor(c4);
		g.fillRect(5, 5, 90, 35);
		
		g.setColor(c1);
		g.fillOval(x1-12, y1-17, diameter+50, diameter+50);
		
		g.setColor(c2);
		g.fillOval(x1-12, y1-17, diameter+30, diameter+30);
		
		g.setColor(Color.black);
		g.setFont(font);
		g.drawString(1+"",249,113);
		g.drawString(2+"",286,150); 
		g.drawString(3+"",300,200); 
		g.drawString(4+"",286,249); 
		g.drawString(5+"",249,286); 
		g.drawString(6+"",199,300); 
		g.drawString(7+"",149,286); 
		g.drawString(8+"",113,250); 
		g.drawString(9+"",100,199); 
		g.drawString(10+"",113,149); 
		g.drawString(11+"",149,113); 
		g.drawString(12+"",200,100); 
	}

}
