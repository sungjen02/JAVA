package day0207;

public class Work {
	// 기본 요금은 자주 변경되지 않는 값이므로 Constant로 선언
	public static final int BUS = 1250;
	public static final int SUBWAY = 1300;
	public static final int TAXI = 3800;

	public static void main(String[] args) {
		//대중교통인지 아닌지 판단
		if(args[0].equals("버스")||args[0].equals("지하철")||args[0].equals("택시")) {
			//버스, 지하철(구간요금계산대상)인지 아닌지 판단
			if(args[0].equals("버스")||args[0].equals("지하철")) {//구간요금계산 대상(버스, 지하철)
				
				int distance=Integer.parseInt(args[1]);//이용거리
				int typeFare=Work.BUS; //버스요금을 기본 요금
				int tempFare=0;//초과요금
				
				if(args[0].equals("지하철")) {//지하철인 경우 기본요금 변경
					typeFare=Work.SUBWAY;
				}//end if
				if(distance > 10) {//10km를 초과한 경우의 초과 요금 계산
					//매 5km마다 100원의 초과요금이 설정
					tempFare=(((distance-10)/5)+1)*100;
				}
					
					System.out.println("이용하신 교통수단 [" + args[0] + "] 이동거리" + distance + "km 기본 요금" +
					typeFare + "원, 초과운임" + tempFare + "원, 총 결제요금" + (typeFare + tempFare) + "원");
				}//end if
	
		
			else {//단순 출력 대상(택시)
				System.out.println(args[0] +"는 기본요금" + TAXI + "원이고 구간 요금 대상이 아닙니다.");
			}//end else
	}else	{
		System.out.println("대중교통이 아닌 부분ㅇㅈ? ㅇㅇㅈ");
	}
}

}
