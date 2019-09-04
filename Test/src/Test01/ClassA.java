package Test01;

public class ClassA {
  int a =1;
  double b=2.0;
  public static final String NAME = "1";
  public static final int NUM = 1;

   public void TestA() {
	   System.out.println("Class A: a="+a +"\tb="+b);
	   System.out.println("TestA");
}
   public void TestA(String s) {
	System.out.println(s);
}
   public void TestA(int b) {
		System.out.println(b+1);
   }
	public static void main(String[] args) {
		ClassA classA=new ClassA();
		classA.TestA("s");
		classA.TestA(1);
		System.out.println(ClassA.NAME);
		System.out.println(classA);
	}
}
