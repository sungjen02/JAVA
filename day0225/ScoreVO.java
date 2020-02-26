package day0225;

public class ScoreVO {
	String uni, name;
	int kor,eng,math, tot;
	double avg;
	
	//Method - setter, getter 
	public void setUni(String uni) {this.uni = uni;}
	public void setName(String name) {this.name = name;}
	public void setKor(int kor) {this.kor = kor;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	public void setTot(int tot) {this.tot = math;}
	
	public String getUni() {return uni;}
	public String getName() {return name;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public int getTot() {return kor+eng+math;}
	public double getAvg() {return getTot()/3;}
	
}
