import java.awt.Color;

public class LiveClock {
	
	public static void main(String[] args) {
		int x = 100;
		int y = 100;
		int dia = 200;
		TimeController tc = new TimeController();
		ClockController cc = new ClockController(tc.GetHour(),tc.GetMin(),tc.GetSec());
		handWriter hw = new handWriter(cc.HourhandAngle(), cc.MinhandAngle(), cc.SechandAngle(),
				x, y, dia, Color.black, Color.red, Color.blue);
		ClockWriter2 cw = new ClockWriter2(dia, x, y, Color.cyan, Color.white, Color.gray, Color.black);;
		LiveClockControl lcc;
		lcc = new LiveClockControl(tc,cc,hw,cw,400);
		while(true) lcc.repaint();
	}

}
