import java.text.*;

public class MathOperations {
	
	double inverse(int i) {
		//i�� ������ ����
		return 1.0/i;
	}
	
	void printInverse(int i) {
		DecimalFormat formatter = new DecimalFormat("0.000");
		//i�� ������ ǥ�� ����â�� ����Ʈ (�Ҽ��� ���ϴ� ��°�ڸ����� ǥ��)
		double n = 1.0 / i;
		String s = formatter.format(n);
		System.out.println(s);

	}
	
	void printInverse(int i, DecimalFormat f) {
		//i�� ������ pattern ���ڿ��� ������ �������� ǥ�� ����â�� ����Ʈ (������ �Ҽ��� ��°�ڸ����� ǥ���ϴ� ��� "0.00")
		double n = 1.0 / i;
		String s = f.format(n);
		System.out.println(s);

	}
	
	void printInverse(int i, String pattern) {
		//i�� ������ DecimalFormat ��ü�� ������ �������� ǥ�� ����â�� ����Ʈ
		DecimalFormat formatter = new DecimalFormat(pattern);
		double n = 1.0 / i;
		String s = formatter.format(n);
		System.out.println(s);

	}
}