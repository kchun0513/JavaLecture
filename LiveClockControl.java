import java.awt.*;
import javax.swing.*;

public class LiveClockControl extends JPanel{
	private Font font = new Font("OCR A Extended", Font.BOLD, 13);
	private TimeController tc;
	private ClockController cc;
	private handWriter hw;
	private ClockWriter2 cw;
	private int x = 100;
	private int y = 100;
	private int dia = 200;
	private int size;
	
	public LiveClockControl(TimeController t_c, ClockController c_c, 
			handWriter h_w, ClockWriter2 c_w, int s) {
		tc = t_c;
		cc = c_c;
		hw = h_w;
		cw = c_w;
		size = s;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("LiveClock");
		f.setSize(size+16, size+39);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		
		tc = new TimeController();
		int year = tc.GetYear();
		int month = tc.GetMonth();
		int day = tc.GetDay();
		int hour = tc.GetHour();
		int min = tc.GetMin();
		int sec = tc.GetSec();
		cc = new ClockController(hour, min, sec);
		hw = new handWriter(cc.HourhandAngle(), cc.MinhandAngle(), cc.SechandAngle(),
				x, y, dia, Color.black, Color.red, Color.blue);
		cw = new ClockWriter2(dia, x, y, Color.cyan, Color.white, Color.gray, Color.black);
		
		cw.paintComponent(g,size);
		hw.paintComponent(g);
		
		g.setColor(Color.red);
		g.setFont(font);
		g.drawString(year + "." + month + "." + day + "", 10, 20);
		
		g.setColor(Color.red);
		g.setFont(font);
		g.drawString(hour + ":" + min + ":" + sec, 10, 35);
		
			
	}
	
}
