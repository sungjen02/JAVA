package day0220;

import java.util.*; //한번에 import

public class LottoSystem {
	//Field
	String[] menuList = {"수동","자동","번호확인","당첨확인","종료"};
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> myLotto = new ArrayList<Integer>();
	ArrayList<Integer> winLotto = new ArrayList<Integer>();
	
	//Constructor
	public LottoSystem() {
		showMenu();
		choiceMenu();
	}
	
	//Method
	public void showMenu() {
		System.out.println("--------- 메뉴 리스트 ---------- ");
		for (int i = 0; i < menuList.length; i++) {
			System.out.println((i+1)+"번 : " + menuList[i]);
		}
		System.out.println("----------------------------------");
	}
	public void choiceMenu() {
		System.out.println("메뉴선택>");
		switch(scan.nextInt()) {
		case 1: makePassive(); break;
		case 2: makeAuto(); break;
		case 3: myLottoConfirm(); break;
		case 4: winLottoConfirm(); break;
		case 5: exit(); break;
		default : System.out.println("다시입력해주세요 \n"); 
		choiceMenu();
		}
	}
	
	public void makePassive() {
		boolean flag = true;
				while(flag) {			
					if(myLotto.size() < 6) {
					System.out.println("번호>");
					int number = scan.nextInt();
					
							if(number > 0 && number < 46) {
								myLotto.add(number);
								
								if(myLotto.size() == 6) {
									System.out.println("== 번호 입력 종료 ==");
									flag = false;
								}else {
									System.out.println("계속입력하시겠습니까?(y/n)");
									if(!scan.next().equals("y")) flag = false;
								}
								}
					}else {
						System.out.println("저장공간부족");
					}										
					//while
					}
		System.out.println("번호 생성이 완료되었습니다");
	choiceMenu();
}
	public void makeAuto() {
		int size = 6 - myLotto.size();
		for (int i = 0; i < size; i++) {
			myLotto.add(new Random().nextInt(45)+1);
		}
		System.out.println("== 자동번호 생성 완료 ==");
//		for (int no : myLotto) {
////			System.out.print(no+"\t");
////			System.out.println();
////			choiceMenu();
//		}
		myLottoConfirm();
		System.out.println();
	}
	public void myLottoConfirm() {
			System.out.println("== 번호확인 ==");
			for (int number : myLotto) {
				System.out.print(number + "\t");
			}		
			System.out.println();
		choiceMenu();
	}
	public void winLottoConfirm() {
		//기존에 생성된 winLotto 데이터를 모두 삭제 Iterator
//		winLotto = new ArrayList<Integer>();
		
		ListIterator it = winLotto.listIterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
			
		}
		
		System.out.println("win size=========>" + winLotto.size());
		System.out.println("당첨번호 생성");
		for (int i = 0; i < 6; i++) {
			winLotto.add(new Random().nextInt(45)+1);
			System.out.print(winLotto.get(i)+"\t");
		}
			
		System.out.println("\n당첨번호 확인");
		int winCount = 0;
		for (int no : myLotto) {
			if(winLotto.contains(no)) {
				System.out.println("당첨!" + no);
				winCount++;
			}
			System.out.println("당첨 갯수 : " + winCount);
			choiceMenu();
		}
//		int count =0;
//		System.out.println("== 당첨번호확인 ==");
//		for (int i = 0; i < 6 ; i++) {
//			winLotto.add(new Random().nextInt(45)+1);
//		}
//		for (int number : winLotto) {
//			System.out.print(number + "\t");
//			}			
//		System.out.println();
//		for (int i : myLotto) {
//			for (int j : winLotto) {
//				if(i==j) {
//					System.out.print("당첨된 번호 : " + i + "\t");
//					count++;
//				}
//			}
//		}
//		System.out.println("당첨개수 : " + count+ "개");
//		choiceMenu();
	}
	public void exit() {
		System.out.println("종료");
		choiceMenu();
	}
}
