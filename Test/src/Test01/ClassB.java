package Test01;

public class ClassB  extends ClassA{

	float a=3.0f;
	String d="Java program.";
	public void show(){
	TestA( "s");
	System.out.println("Class B: a="+a +"\td="+d);
	}
	public static void main(String[] args) {
          ClassB classB=new ClassB();
          classB.show();
          
      	String name =ClassA.NAME;
	}
	
}
