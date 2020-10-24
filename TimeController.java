import java.time.*;

public class TimeController {
	
	private int y,m,d,h,min,s;
	private LocalTime now = LocalTime.now();
	private LocalDate nowDate = LocalDate.now();
	
	public TimeController() {
		y = nowDate.getYear();
		m = nowDate.getMonthValue();
		d = nowDate.getDayOfMonth();
		h = now.getHour();
		min = now.getMinute();
		s = now.getSecond();
	}
	
	public int GetYear() {return y;}
	public int GetMonth() {return m;}
	public int GetDay() {return d;}
	public int GetHour() {return h;}
	public int GetMin() {return min;}
	public int GetSec() {return s;}
}
