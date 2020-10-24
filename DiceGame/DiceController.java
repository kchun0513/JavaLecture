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
				if (score1 > score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player1 + "의 승리!");
				else if (score1 < score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player2 + "의 승리!");
				else JOptionPane.showMessageDialog(null, score1+":"+score2+" "+"무승부!");
			}
			else if (dice1 == dice2) JOptionPane.showMessageDialog(null, player1+"의 주사위의 눈이 "+dice1+"으로 같습니다.\n"+player1 + "의 승리!");
			else JOptionPane.showMessageDialog(null, player2+"의 주사위의 눈이 "+dice3+"으로 같습니다.\n"+player2 + "의 승리!");
		}
		
		else if (score1 > score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player1 + "의 승리!");
		else if (score1 < score2) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player2 + "의 승리!");
		else if (score1 == score2) {
			if (Math.abs(dice1-dice2)<Math.abs(dice3-dice4)) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player1 + "의 승리!\n"
					+"눈의 차이 "+Math.abs(dice1-dice2)+":"+Math.abs(dice3-dice4));
			else if (Math.abs(dice1-dice2)>Math.abs(dice3-dice4)) JOptionPane.showMessageDialog(null, score1+":"+score2+" "+player2 + "의 승리!\n"
					+"눈의 차이 "+Math.abs(dice1-dice2)+":"+Math.abs(dice3-dice4));
			else JOptionPane.showMessageDialog(null, score1+":"+score2+" "+"같은 점수, 같은 눈! 무승부!");
			
		}	
		
		JOptionPane.showMessageDialog(null, "※게임 규칙\n -주사위 두개가 같은 수가 나오면 이긴다. 둘 다 같은 수이면 큰 수가 이긴다.\n"
				+ "-다른 수 끼리는 두 주사위의 합이 크면 이긴다.\n"+"-합이 동률인 경우에는 두 수의 차이가 작으면 이긴다.\n"+"-두 수의 차이도 동률이면 비긴다.");
	}


}
