class question1 {

	public static void main(String[] args) {
		int p = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		double i;
		double r = Double.parseDouble(args[2]);
		int total;
		System.out.println("자유은행 대출 상환금 계산 서비스에 오심을 환영합니다.\n");
		System.out.println("손님의 대출원금은 "+p+"백만원 입니다.");
		System.out.println("연이자율 "+r+"%로 "+y+"년 동안");
		r = (r/12)/100;
		p = p*1000000;
		i = Math.pow(1+r,12*y);
		total = (int)((i*p*r)/(i-1));
		System.out.println("매월 원리금 균등으로 "+total+"원씩 상환하셔야 합니다.");
		System.out.println("총 상환금액은 "+total*12*y+"원 입니다.\n");
		System.out.println("저희 자유은행은 항상 여러분과 함께 합니다.");
		System.out.println("또 들려주세요.");

	}

}
