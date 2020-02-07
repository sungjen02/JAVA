package day0207;

/**
 * switch~case를 사용한 학점 구하기
 * @author sist
 */
public class TestSwitchCase2 {

	public static final int GRADE_A_PLUS=10;	
	public static final int GRADE_A=9;	
	public static final int GRADE_B=8;	
	public static final int GRADE_C=7;	
	public static final int GRADE_D=6;	
	
	public static void main(String[] args) {
		int score = 90;
		char grade = 'F';
		
		switch(score/10) {
		case GRADE_A_PLUS :
		case GRADE_A : grade='A'; break;
		case GRADE_B : grade='B'; break;
		case GRADE_C : grade='C'; break;
		case GRADE_D : grade='D'; break;
		default : grade='F'; break;
		}//end switch
		
		System.out.println(score + "점의 학점은 " + grade);
		
		System.out.println("----------------------------------------");
		
		grade=64;
		score=90;
		switch(score/10) {
		case GRADE_D : grade++;
		case GRADE_C : grade++;
		case GRADE_B : grade++;
		case GRADE_A : 
		case GRADE_A_PLUS : grade++; break;
		default : grade+=6;
		}//end switch
		System.out.println("점수" + score + "의 학점은" + grade);
	}//main

}//class