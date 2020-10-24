import java.text.*;

public class MathOperations {
	
	double inverse(int i) {
		//i의 역수를 리턴
		return 1.0/i;
	}
	
	void printInverse(int i) {
		DecimalFormat formatter = new DecimalFormat("0.000");
		//i의 역수를 표준 실행창에 프린트 (소수점 이하는 세째자리까지 표시)
		double n = 1.0 / i;
		String s = formatter.format(n);
		System.out.println(s);

	}
	
	void printInverse(int i, DecimalFormat f) {
		//i의 역수를 pattern 문자열이 제시한 포맷으로 표준 실행창에 프린트 (포맷은 소수점 둘째자리까지 표시하는 경우 "0.00")
		double n = 1.0 / i;
		String s = f.format(n);
		System.out.println(s);

	}
	
	void printInverse(int i, String pattern) {
		//i의 역수를 DecimalFormat 객체가 제시한 포맷으로 표준 실행창에 프린트
		DecimalFormat formatter = new DecimalFormat(pattern);
		double n = 1.0 / i;
		String s = formatter.format(n);
		System.out.println(s);

	}
}