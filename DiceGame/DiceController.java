import javax.swing.*;

public class DiceController {
	
	static String p1;
	static String p2;
	static int d1;
	static int d2;
	static int d3;
	static int d4;

	public static void Control(String player1, String player2, int dice1, int dice2, int dice3, int dice4) {
		
		int score1 = dice1+dice2;
		int score2 = dice3+dice4;
		p1 = player1;
		p2 = player2;
		d1 = dice1;
		d2 = dice2;
		d3 = dice3;
		d4 = dice4;

		
		if (dice1 == dice2 || dice3 == dice4) {
			if (dice1 == dice2 && dice3 == dice4) {
				if (score1 > score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player1 + "�� �¸�!");
				else if (score1 < score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player2 + "�� �¸�!");
				else JOptionPane.showMessageDialog(null, score1+":"+score2+" "+"���º�!");
			}
			else if (dice1 == dice2) JOptionPane.showMessageDialog(null, player1+"�� �ֻ����� ���� "+dice1+"���� �����ϴ�.\n"+player1 + "�� �¸�!");
			else JOptionPane.showMessageDialog(null, player2+"�� �ֻ����� ���� "+dice3+"���� �����ϴ�.\n"+player2 + "�� �¸�!");
		}
		
		else if (score1 > score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player1 + "�� �¸�!");
		else if (score1 < score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player2 + "�� �¸�!");
		else if (score1 == score2) {
			if (Math.abs(dice1-dice2)<Math.abs(dice3-dice4)) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player1 + "�� �¸�!\n"
					+"���� ���� "+Math.abs(dice1-dice2)+":"+Math.abs(dice3-dice4));
			else if (Math.abs(dice1-dice2)>Math.abs(dice3-dice4)) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player2 + "�� �¸�!\n"
					+"���� ���� "+Math.abs(dice1-dice2)+":"+Math.abs(dice3-dice4));
			else JOptionPane.showMessageDialog(null, score1+":"+score2+" "+"���� ����, ���� ��! ���º�!");
			
		}	
		
		JOptionPane.showMessageDialog(null, "�ذ��� ��Ģ\n -�ֻ��� �ΰ��� ���� ���� ������ �̱��. �� �� ���� ���̸� ū ���� �̱��.\n"
				+ "-�ٸ� �� ������ �� �ֻ����� ���� ũ�� �̱��.\n"+"-���� ������ ��쿡�� �� ���� ���̰� ������ �̱��.\n"+"-�� ���� ���̵� �����̸� ����.");
	}


}
