import javax.swing.*;
import java.awt.*;

public class MyWriter extends JPanel{

	private int width;
	private int height;
	private String sentence;
	private int x_position, y_position;
	
	/* 가로 w 픽셀, 세로 h 픽셀 크기의 창을 생성
	 * @param w - 창의 너비
	 * @param h - 창의 높이 */
	
	public MyWriter(int w, int h) {
		width = w;
		height = h;
		x_position = width / 5;
		y_position = height / 2;
		sentence = "Hello";
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle("MyWriter");
		f.setSize(width + 16,height + 39);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	/* paintComponent - 화가 메소드
	 * @param g - 그래픽스 펜 */
	 
	public void paintComponent(Graphics g) {
		makeBorder(g);
		g.setColor(Color.red);
		g.drawString(sentence, x_position, y_position);
	}
	
	/* makeBorder - 창 프레임에 테두리 두르기
	 * @param pen - 그래픽스 펜 */

	public void makeBorder(Graphics pen) {
		pen.setColor(Color.black);
		pen.fillRect(0,0,width,height);
		pen.setColor(Color.white);
		int size = 15;
		pen.fillRect(size, size, width - 2*size, height - 2*size);
		
	}
	
	/* writeSentence - s를 출력
	 * @param s - 출력할 문자열 */
	public void writeSentence(String s) {
		sentence = s;
		this.repaint();
	}
	
	/* positionSentence - 위치를 (x,y)로 설정하고 그 위치에 출력
	 * @param x - x 좌표
	 * @param y - y 좌표 */
	public void positionSentence(int x,int y) {
		x_position = x;
		y_position = y ;
		this.writeSentence(sentence);
	}

}
