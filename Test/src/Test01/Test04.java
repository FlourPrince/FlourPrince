package Test01;


public class Test04 {

	public static void main(String[] args) {
		Test06();
	}

	public static void Test01() {
		Test02();//ͬΪ��̬����ֱ�ӵ���
		Test04 test = new Test04();
		test.Test03();//��̬����������ͨ�������ȴ������󣬶���.������
	}
	public static void Test02() {
		System.out.println("Test02");
	}

	public void Test03() {
		System.out.println("Test03");
		Test05();//ͬΪ��ͨ����ֱ�ӵ��� 
		Test01();//��ͨ�������þ�̬����
	}

	public void Test05() {
		System.out.println("Test05");
	}
	public static void Test06() {
		String s="�й��������������������갡������������������������������������������������������������������";
		char[] ch=s.toCharArray();
		System.out.println(ch);
	}
}
