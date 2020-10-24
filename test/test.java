import java.util.*;

public class test {

	public static void main(String[] args) {
		int add, sub, mul;
		double div;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("add : " + (a+b)
				+ " sub : " + (a-b)
				+ " mul : " + (a*b)
				+ " div : " + ((double)a/(double)b));
		


	}

}
