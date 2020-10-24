class lab2_4 {

	public static void main(String[] args) {
		int p = Integer.parseInt(args[0]);
	    int n = Integer.parseInt(args[1]);
	    double i = Double.parseDouble(args[2]);
	    double r = Math.pow(1+i/100,n);
	    int total = (int)(p*r);
	    System.out.println("투자 원금 = "+p+"원");
	    System.out.println("월 수익률 = "+i+"%");
	    System.out.println(n+"개월 후 총액 = "+total+"원");
	}

}
