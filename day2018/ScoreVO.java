package day2018;

public class ScoreVO {
	//Field - 학번, 학생명, 국어, 영어, 수학, 총점, 평균
	String stuno, name;
	int kor,eng,math;
	double tot, avg;
	
	//Method - setter, getter 
	public void setStuno(String stuno) {this.stuno = stuno;}
	public void setName(String name) {this.name = name;}
	public void setKor(int kor) {this.kor = kor;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	
	public String getStuno() {return stuno;}
	public String getName() {return name;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public double getTot() {return kor+eng+math;}
	public double getAvg() {return getTot()/3;}
	
	}
//class