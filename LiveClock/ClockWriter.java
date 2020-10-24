import java.awt.*;
import javax.swing.*;
import java.time.*;


public class ClockWriter extends JPanel {
	
	private int x = 100;
	private int y = 100;
	private int diameter = 200;
	private int width = 400;
	private Font font = new Font("OCR A Extended", Font.BOLD, 13);
	private Font font1 = new Font("Consolas", Font.PLAIN, 9);


	public ClockWriter() {
		int width = 400;
		// 프레임 생성
		JFrame clock_frame = new JFrame();
		// 자신(패널)을 프레임에 끼우기
		clock_frame.getContentPane().add(this);
		// 프레임 만들어 보여주기
		clock_frame.setTitle("Clock");
		clock_frame.setSize(width,width);
		clock_frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.white);
		g.fillRect(0, 0, width, width);
		
		g.setColor(Color.CYAN);
		g.fillOval(x-12, y-17, diameter+50, diameter+50);
		
		g.setColor(Color.white);
		g.fillOval(x-12, y-17, diameter+30, diameter+30);
		
		LocalTime now = LocalTime.now();
		LocalDate date = LocalDate.now();
		
		int minute = now.getMinute();
		int hour = now.getHour();
		int second = now.getSecond();
		int minutes_angle = 90 - minute * 6;
		int hours_angle = 90 - hour * 30;
		int seconds_angle = 90 - second * 6;
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		
		g.setColor(Color.black);
		g.setFont(font1);
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
		
		
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, 100, 45);
		g.setColor(Color.black);
		g.fillRect(5, 5, 90, 35);
		
		g.setColor(Color.black);
		g.fillArc(x+10,y+10,diameter-20,diameter-20,seconds_angle,3);
		
		g.setColor(Color.red);
		g.fillArc(x+5, y+5, diameter-10, diameter-10, minutes_angle, 5);
		
		g.setColor(Color.blue);
		g.fillArc(x+25,y+25,diameter-50,diameter-50,hours_angle,-8);
		
		g.setColor(Color.red);
		g.setFont(font);
		g.drawString(year + "." + month + "." + day + "", 10, 20);
		
		g.setColor(Color.red);
		g.setFont(font);
		g.drawString(hour + ":" + minute + ":" + second, 10, 35);
	
	}
	

	public static void main(String[] args) {
		new ClockWriter();
	}

}
