public class AccountManager2 {

	public static void main(String[] args) {
		BankReader reader = new BankReader();
		BankAccount primary_account = new BankAccount(0);
		BankAccount secondary_account = new BankAccount(0);
		BankWriter primary_writer = new BankWriter("�������� ����#1", primary_account);
		BankWriter secondary_writer = new BankWriter("�������� ����#2", secondary_account);
		AccountController2 controller = new AccountController2(reader, primary_writer, 
				primary_account,secondary_writer, secondary_account);
		controller.processTransactions();

	}

}
