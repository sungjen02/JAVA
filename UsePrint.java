//1.�ҽ��ڵ� �ۼ�
class UsePrint{
            // Java Application : �ܵ����� ���డ���� ���α׷�.
            // main method�� �����ϸ� Ŭ������ �ܵ����� ���� ����������.
            public static void main (String[] args){
                      //print(); //��� �� �ٺ������� �ʴ´�.
                      //println(); //��� �� �� ������
                      System.out.println("�ȳ� �ڹ�.");
                      System.out.println("o(^^O)(O^^)o");

                      //������
                      System.out.println(2020); //���� ���
                      System.out.println(2.3); //�Ǽ� ���
                      System.out.println('j'); //���� ��� '���� ���ڸ� �Է°���
                      System.out.println(true); // �Ҹ� ��� true|false
                      System.out.println("������ ������ �Դϴ�."); //���ڿ����

                      //������� : ������ ������ �ִ� ���� ����Ѵ�.
                      int i=32;
                      System.out.println(i);
 
                      //��ü��� : ��ü�� �ּ�(��ü�� ������ �޸𸮹���)�� ��µȴ�.
                      UsePrint up=new UsePrint();
                      System.out.println( up );

                      //����� ��� : ����� ����� ��� �ȴ�.
                      System.out.println( 2+3 );

                      //���ڿ��� ���� ����(+)�Ͽ� ���
                      //���ڿ��� + �����ڸ� ����ϸ� ������ �ƴ� ������ �ǹ�.
                      System.out.println("2+3="+(2+3));

                      System.out.println();
                      System.out.println("-----------------------------");
            }//main method


}//class

//2.���� : Ȯ���ڴ� java�� ���� : Ŭ������.java

//3.������ : javac�ɼ� source code �� : javac Hello.java => Hello.class����

//4.����(bytecode�� ����) : java �ɼ� bytecode��
// => java Hello