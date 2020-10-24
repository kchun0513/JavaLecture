import java.awt.*;
import javax.swing.*;

public class EggWriter extends JPanel {
	
	private int Size = 100;
	private int X=3;
	private int Y=2;
	private int Width = 300;
	private int Height = 200;
	private int O_Width = Width;
	private int O_Height = Height;
	private int x = 0;
	private int y = 0;

	public EggWriter() {
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("Egg");
		f.setSize(Width+16,Height+39);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.pink);
		g.fillRect(0, 0, Width, Height);
		g.setColor(Color.yellow);
		g.fillOval(x, y, O_Width, O_Height);
		x += X*5;
		y += Y*5;
		O_Width -= X*10;
		O_Height -= Y*10;
	}
	
	public static void main(String[] args) {
		new EggWriter();
	}

}
