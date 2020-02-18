package day2018;

public class YSHighSchool {

	public static void main(String[] args) {
		ScoreMgmSystem sms = new ScoreMgmSystem();
		ScoreMgmStaff hong = new ScoreMgmStaff();
//		boolean flag = true;
//		while(flag) {		
//		flag = sms.scoreRegister(hong.input(),hong.scan);
//		}
		sms.scoreRegister(hong);
		sms.showScoreList();
	}

}