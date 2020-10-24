import javax.swing.*;

public class BankReader {
	
	private String input_line = "";
	
	public BankReader() {
		input_line = "";
	}
	
	public char readCommand(String message) {
		input_line = JOptionPane.showInputDialog(message);
		input_line.toUpperCase();
		return input_line.charAt(0);
	}
	
	public int readAmount() {
		int amount = 0;
		String s = input_line.substring(1);
		s = s.trim().toUpperCase();
		
		if (s.length() > 0) amount = Integer.parseInt(s);
		else JOptionPane.showMessageDialog(null, "�ݾ� �Է� ����");
		return amount;
	}


}
