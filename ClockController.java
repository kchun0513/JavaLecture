public class ClockController {
	
	private int hour,minute,sec;
	
	public ClockController(int h, int min, int s) {
		hour = h;
		minute = min;
		sec = s;
	}
	
	public int HourhandAngle() {
		int h_angle = 90 - (hour*30+(minute/12)*6);
		return h_angle;
	}
	
	public int MinhandAngle() {
		int min_angle = 90 - (minute*6);
		return min_angle;
	}
	
	public int SechandAngle() {
		int s_angle = 90 - (sec*6);
		return s_angle;
	}
}
