package Test01;


public class Test04 {

	public static void main(String[] args) {
		Test06();
	}

	public static void Test01() {
		Test02();//同为静态方法直接调用
		Test04 test = new Test04();
		test.Test03();//静态方法调用普通方法，先创建对象，对象.方法名
	}
	public static void Test02() {
		System.out.println("Test02");
	}

	public void Test03() {
		System.out.println("Test03");
		Test05();//同为普通方法直接调用 
		Test01();//普通方法调用静态方法
	}

	public void Test05() {
		System.out.println("Test05");
	}
	public static void Test06() {
		String s="中国人民万岁万岁万岁万岁啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊";
		char[] ch=s.toCharArray();
		System.out.println(ch);
	}
}
