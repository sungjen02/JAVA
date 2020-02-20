package day0220;

import java.util.*; //�ѹ��� import

public class LottoSystem {
	//Field
	String[] menuList = {"����","�ڵ�","��ȣȮ��","��÷Ȯ��","����"};
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
		System.out.println("--------- �޴� ����Ʈ ---------- ");
		for (int i = 0; i < menuList.length; i++) {
			System.out.println((i+1)+"�� : " + menuList[i]);
		}
		System.out.println("----------------------------------");
	}
	public void choiceMenu() {
		System.out.println("�޴�����>");
		switch(scan.nextInt()) {
		case 1: makePassive(); break;
		case 2: makeAuto(); break;
		case 3: myLottoConfirm(); break;
		case 4: winLottoConfirm(); break;
		case 5: exit(); break;
		default : System.out.println("�ٽ��Է����ּ��� \n"); 
		choiceMenu();
		}
	}
	
	public void makePassive() {
		boolean flag = true;
				while(flag) {			
					if(myLotto.size() < 6) {
					System.out.println("��ȣ>");
					int number = scan.nextInt();
					
							if(number > 0 && number < 46) {
								myLotto.add(number);
								
								if(myLotto.size() == 6) {
									System.out.println("== ��ȣ �Է� ���� ==");
									flag = false;
								}else {
									System.out.println("����Է��Ͻðڽ��ϱ�?(y/n)");
									if(!scan.next().equals("y")) flag = false;
								}
								}
					}else {
						System.out.println("�����������");
					}										
					//while
					}
		System.out.println("��ȣ ������ �Ϸ�Ǿ����ϴ�");
	choiceMenu();
}
	public void makeAuto() {
		int size = 6 - myLotto.size();
		for (int i = 0; i < size; i++) {
			myLotto.add(new Random().nextInt(45)+1);
		}
		System.out.println("== �ڵ���ȣ ���� �Ϸ� ==");
//		for (int no : myLotto) {
////			System.out.print(no+"\t");
////			System.out.println();
////			choiceMenu();
//		}
		myLottoConfirm();
		System.out.println();
	}
	public void myLottoConfirm() {
			System.out.println("== ��ȣȮ�� ==");
			for (int number : myLotto) {
				System.out.print(number + "\t");
			}		
			System.out.println();
		choiceMenu();
	}
	public void winLottoConfirm() {
		//������ ������ winLotto �����͸� ��� ���� Iterator
//		winLotto = new ArrayList<Integer>();
		
		ListIterator it = winLotto.listIterator();
		while(it.hasNext()) {
			it.next();
			it.remove();
			
		}
		
		System.out.println("win size=========>" + winLotto.size());
		System.out.println("��÷��ȣ ����");
		for (int i = 0; i < 6; i++) {
			winLotto.add(new Random().nextInt(45)+1);
			System.out.print(winLotto.get(i)+"\t");
		}
			
		System.out.println("\n��÷��ȣ Ȯ��");
		int winCount = 0;
		for (int no : myLotto) {
			if(winLotto.contains(no)) {
				System.out.println("��÷!" + no);
				winCount++;
			}
			System.out.println("��÷ ���� : " + winCount);
			choiceMenu();
		}
//		int count =0;
//		System.out.println("== ��÷��ȣȮ�� ==");
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
//					System.out.print("��÷�� ��ȣ : " + i + "\t");
//					count++;
//				}
//			}
//		}
//		System.out.println("��÷���� : " + count+ "��");
//		choiceMenu();
	}
	public void exit() {
		System.out.println("����");
		choiceMenu();
	}
}
