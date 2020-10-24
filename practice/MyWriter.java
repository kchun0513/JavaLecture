import javax.swing.*;
import java.awt.*;

public class MyWriter extends JPanel{

	private int width;
	private int height;
	private String sentence;
	private int x_position, y_position;
	
	/* ���� w �ȼ�, ���� h �ȼ� ũ���� â�� ����
	 * @param w - â�� �ʺ�
	 * @param h - â�� ���� */
	
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
	
	/* paintComponent - ȭ�� �޼ҵ�
	 * @param g - �׷��Ƚ� �� */
	 
	public void paintComponent(Graphics g) {
		makeBorder(g);
		g.setColor(Color.red);
		g.drawString(sentence, x_position, y_position);
	}
	
	/* makeBorder - â �����ӿ� �׵θ� �θ���
	 * @param pen - �׷��Ƚ� �� */

	public void makeBorder(Graphics pen) {
		pen.setColor(Color.black);
		pen.fillRect(0,0,width,height);
		pen.setColor(Color.white);
		int size = 15;
		pen.fillRect(size, size, width - 2*size, height - 2*size);
		
	}
	
	/* writeSentence - s�� ���
	 * @param s - ����� ���ڿ� */
	public void writeSentence(String s) {
		sentence = s;
		this.repaint();
	}
	
	/* positionSentence - ��ġ�� (x,y)�� �����ϰ� �� ��ġ�� ���
	 * @param x - x ��ǥ
	 * @param y - y ��ǥ */
	public void positionSentence(int x,int y) {
		x_position = x;
		y_position = y ;
		this.writeSentence(sentence);
	}

}
