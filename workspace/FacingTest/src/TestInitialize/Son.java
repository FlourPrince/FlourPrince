package TestInitialize;
/**
 * <p>
 * 文件功能说明：类初始化 和实例初始化
 *       类初始化  			
 *     1.一个类要创建实例需要先加载并初始化该类
 *       main方法所在的类需要先加载和初始化
 *     2.一个子类要初始化 需要先初始化父类
 *     3.一个类初始化就是执行<clinit>方法      
 *        <clinit>方法    由静态类变量显示赋值代码和静态代码块组成 
 *                类变量显示赋值代码和静态代码块代码从上到下顺序执行
 *         <clinit>方法 只执行一次 
 *        实例初始化    
 *        1.实例初始化就是执行<init>()方法
 *          <init>()方法可能重载由多个，有几个构造器就有几个<init>()方法
 *          <init>()方法由非静态实例变量显示赋值代码和非静态代码块、对应构造器代码组成
 *                  非静态实例变量显示赋值代码和非静态代码块代码从上到下顺序执行，对应构造器的代码最后执行
 *                  每次创建实例对象，调用对应构造器，执行的就是对应的<init>()方法     
 *         <init>()方法 的首行是super()或super(实)
 *         
 *   方法重写      
 *   1.哪些方法不可以被重写
 *      final方法
 *      静态方法    
 *      private等子类不可见方法   
 *    2.对象的多态性
 *    子类如果重写了父类的方法，通过子类对象调用的一定是子类重写过的代码
 *    非静态方法默认的调用对象是this
 *    this对象在构造器或者说<init> 方法中就是正在创建的对象   
 *             
 *         
 */
public class Son extends Father {
	private int i = test();
	private static int j = method();
	static {
		System.out.println("6");
	}

	Son() {
		System.out.println("7");
	}

	{
		System.out.println("8");
	}

	public int test() {

		System.out.println("9");
		return 1;
	}

	public static int method() {
		System.out.println("10");
		return 1;
	}
	
	public static void main(String[] args) {
		Son s1=new Son();
		System.out.println();
		Son s2=new Son();
	}

}
