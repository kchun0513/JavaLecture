import java.awt.*;
import javax.swing.*;

public class BankWriter extends JPanel{
	
	private int WIDTH = 300;
	private int HEIGHT = 200;
	private BankAccount bank;
	private String last_transaction = "";

	/*BankWriter - ��±� �ʱ�ȭ
	 * @param title - â�� ����
	 * @param b - BankAccount ��ü */
	public BankWriter(String title, BankAccount b) {
		bank = b;
		JFrame f = new JFrame();
		f.getContentPane().add(this);
		f.setTitle(title);
		f.setSize(WIDTH, HEIGHT);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, WIDTH+19, HEIGHT+36);
		g.setColor(Color.black);
		int text_margin = 50;
		int text_baseline = 50;
		g.drawString("�ܾ� = "+bank.getBalance()+"��",text_margin,text_baseline+20);
	}
	
	/* showTransaction - �ŷ� ��� ǥ��
	 * @param message - �ŷ� �޽���
	 * @param amount - �ŷ� �ݾ� */
	public void showTransaction(int amount, String message) {
		last_transaction = amount + "�� " + message;
		this.repaint();
	}
	
	/* showTransaction - �ŷ� ��� ǥ��
	 * @param message - �ŷ� �޽��� */
	public void showTransaction(String message) {
		last_transaction = message;
		this.repaint();
	}
 
}
