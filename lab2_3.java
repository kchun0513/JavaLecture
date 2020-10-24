class lab2_3 {

	public static void main(String[] args) {
		int k = Integer.parseInt(args[0]);
	    int n = Math.abs(k);
	    int a,b,c,d,e;
	    a = n%10;
	    b = (n/10)%10;
	    c = (n/100)%10;
	    d = (n/1000)%10;
	    e = (n/10000)%10;
		System.out.println("정수 = "+k);
		System.out.println("숫자의 합 = "+(a+b+c+d+e));
		System.out.print("9로 나누어지나? ");
		if ((a+b+c+d+e)%9==0) System.out.println("true");
		else System.out.println("false");
	}

}
