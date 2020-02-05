class  work0205{
	public static void main(String[] args) {
		
		char initial1 = 'L';
		char initial2 = 'S';
		char initial3 = 'J';
			System.out.println("내이름의 이니셜은" +  initial1 + initial2  + initial3 + "입니다");

		System.out.println(args[1]);

		int age = Integer.parseInt(args[1]);
		System.out.println(2020-age+1+"살");

		int i = Integer.parseInt(args[2]);
		int number = i%2;
		System.out.println("입력수" + i + (number==1? "홀수" : "짝수"));
	}
}
