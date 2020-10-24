import java.util.*;

public class test {

	public static void main(String[] args) {
		double add, sub, mul, div;
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		
		System.out.println("add : " + add
				+ " sub : " + sub
				+ " mul : " + mul
				+ " div : " + div);
		


	}

}
