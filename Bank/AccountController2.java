public class AccountController2 {

	private BankReader reader; // input-view
	private BankWriter primary_writer; // output-view
	private BankWriter secondary_writer;
	private BankAccount primary_account; // model
	private BankAccount secondary_account;
	private BankAccount account; // remembers active account
	private BankAccount from_account;
	private BankAccount to_account;
	private BankWriter writer; //remembers active writer
	
	
	/* Account Controller ��ü �ʱ�
	 * @param r - input-view ��ü
	 * @param w - output-view ��ü
	 * @param a - model ��ä */
	 public AccountController2(BankReader r, BankWriter w1, BankAccount a1,
			 BankWriter w2, BankAccount a2) {
		 reader = r;
		 primary_writer = w1;
		 secondary_writer = w2;
		 primary_account = a1;
		 secondary_account = a2;
		 // �⺻�� �ְ���
		 account = primary_account;
		 writer = primary_writer;
		 
	 }
	 
	 /* resetAccount - ���� ����
	  * @param new_account - ������ ����
	  * @param new_writer - ������ ��±� */
	 private void resetAccount(BankAccount new_account, BankWriter new_writer) {
		 writer.showTransaction("��Ȱ��");
		 account = new_account;
		 writer = new_writer;
		 writer.showTransaction("Ȱ��");
	 }
	 
	 /* send - Ȱ�� ���¿��� ��Ȱ�� ���·� ������ */
	 private boolean send(int amount) {
		 boolean result = false;
		 if (account == primary_account) {
			 from_account = account;
			 to_account = secondary_account;
		 }
		 if (account == secondary_account) {
			 from_account = account;
			 to_account = primary_account;
		 }
		 if(from_account.withdraw(amount)) {
			 to_account.deposit(amount);
			 result = true;
		 }
		 return result;
	 }
	 
	 /* receive - ��Ȱ�� ���¿��� Ȱ�� ���·� ������ */
	 private boolean receive(int amount) {
		 boolean result = false;
		 if (account == primary_account) {
			 from_account = secondary_account;
			 to_account = account;
		 }
		 if (account == secondary_account) {
			 from_account = primary_account;
			 to_account = account;
		 }
		 if(from_account.withdraw(amount)) {
			 to_account.deposit(amount);
			 result = true;
		 }
		 return result;
	 }
	
	 public void processTransactions() {
			char command = reader.readCommand("����#1 P, ����#2 S, �Ա� D�ݾ�, ��� W�ݾ�, send >�ݾ�, receive <�ݾ� ���� Q;");
			if (command == 'Q') {
				writer.showTransaction("���񽺸� ��Ĩ�ϴ�.");
				return;
			}
			else if (command == 'D') {
				int amount = reader.readAmount();
				if (account.deposit(amount)) writer.showTransaction(amount, "�Ա�");
				else writer.showTransaction("�Ա� ����");
			}
			else if (command == 'W') {
				int amount = reader.readAmount();
				if (account.withdraw(amount)) writer.showTransaction(amount, "���");
				else writer.showTransaction("��� ����");
			}
			else if (command == 'P') resetAccount(primary_account, primary_writer);
			else if (command == 'S') resetAccount(secondary_account, secondary_writer);
			else if (command == '>') {
				int amount = reader.readAmount();
				if (send(amount)) writer.showTransaction(amount, "send");
				else writer.showTransaction("send ����");
			}
			else if (command == '<') {
				int amount = reader.readAmount();
				if (receive(amount)) writer.showTransaction(amount, "receive");
				else writer.showTransaction("receive ����");
			}
			else writer.showTransaction("��û ����");
			this.processTransactions();
	 }
	 
}
