package TestInitialize;
/**
 * 
 * 类初始化 和实例初始化
 *       		1.类初始化
 *              2.实例初始化
 *              3.方法重写
 */
public class Father {
	private int i=test();
	private static int j=method();
		static {
		System.out.println("1");
	}
	Father(){
		System.out.println("2"); 
	 }
	{
		System.out.println("3");
	}
	
	public int test(){
		System.out.println("4");
		return 1;
	}
	public static int method(){
		System.out.println("5");
         return 1;
	}
}
