package day0206;

/**
 *
 * @author sist
 */

public class work0206 {
	
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;

	public static void main(String[] args) {
		
		int km5 =Integer.parseInt(args[1]); //km수
		if(km5 % 5 == 0 , km5 * 20;) 
		
		
		if(args[0].equals("버스") || args[0].equals("지하철") || args[0].equals("택시")) {
			
			if(args[0].equals("버스"))
				System.out.println("교통수단"+ args[0] +" 편도요금" + BUS + "왕복요금" + BUS*2 + "한달기준" +
										BUS*20);
			
			if(args[0].equals("지하철"))
				System.out.println("교통수단"+ args[0] +" 편도요금" + BUS + "왕복요금" + BUS*2 + "한달기준" +
										BUS*20);
			
 			if(args[0].equals("택시"))
				System.out.println("기본요금"+ TAXI);
			
		}else {
			System.out.println("대중교통이 아닌부분 ㅇㅈ,ㅇㅇㅈ");
		}
		
	

	
	
	}

}
