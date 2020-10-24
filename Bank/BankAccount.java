import javax.swing.*;

public class BankAccount {
	
	private int balance;
	
	/* BankAccount - ���� ����
	 * @param initial_amount - �ʱ� �Աݾ� (0 �̻� ����) */
	
	public BankAccount(int initial_amount) {
		if (initial_amount >= 0) balance = initial_amount;
		else balance = 0;
	}
	
	/* deposit - �Ա�
	 * @param amount - �Աݾ� (0 �̻� ����)
	 * @return �Ա� �����ϸ� true, �����ϸ� false */
	
	public boolean deposit(int amount) {
		if (amount >= 0) {
			balance = balance + amount;
			return true;
		}
		else {
			JOptionPane.showMessageDialog(null, "�Աݾ׿� ������ �־ �Ա��� ��ҵǾ����ϴ�.");
			return false;
		}
	}
	
	/* withdraw - ���
	 * @param amount - ��ݾ� (0 �̻� ����)
	 * @return ��� �����ϸ� true, �����ϸ� false */
	 
	public boolean withdraw(int amount) {
		boolean result = false;
		if (amount < 0) JOptionPane.showMessageDialog(null,"��ݾ׿� ������ �־ �Ա��� ��ҵǾ����ϴ�.");
		else if (amount > balance) JOptionPane.showMessageDialog(null,"��ݾ��� �ܰ�׺��� ���Ƽ� �Ա��� ��ҵǾ����ϴ�.");
		else {
			balance = balance - amount;
			result = true;
		}
		return result;
	}
	
	/* getBalance - �ܾ� Ȯ��
	 * @return �ܾ� */
	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		BankAccount tester = new BankAccount(100);
		System.out.println("�ܾ� = " + tester.getBalance());
		int five = 50000;
		int three = 30000;
		if (tester.deposit(five))
			System.out.println(five + "�� �Ա� ���� : �ܾ� = " + tester.getBalance());
		else
			System.out.println(five + "�� �Ա� ���� : �ܾ� = " + tester.getBalance());
		if (tester.withdraw(three))
			System.out.println(three + "�� ��� ���� : �ܾ� = " + tester.getBalance());
		else
			System.out.println(three + "�� ��� ���� : �ܾ� = " + tester.getBalance());
		if (tester.deposit(five))
			System.out.println(five + "�� �Ա� ���� : �ܾ� = " + tester.getBalance());
		else
			System.out.println(five + "�� �Ա� ���� : �ܾ� = " + tester.getBalance());

	}

}
