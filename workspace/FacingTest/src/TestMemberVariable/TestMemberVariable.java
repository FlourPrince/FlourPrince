package TestMemberVariable;

/**
 * 局部变量与成员变量的区别
 * 1.声明的位置
 *   局部变量：方法体{}中，形参，代码块{}中
 *   成员变量:类中方法外
 *      类变量:有static修饰
 *      实例变量:没有static修饰
 * 2.修饰符
 *    局部变量:final
 *    成员变量 …………
 * 3.存储的位置
 *   局部变量：栈
 *   实例变量：堆
 *   类变量：方法区
 * 4.作用域
 *   局部变量：从声明处开始，到所属的}结束
 *   实例变量:在当前类中 this. 在其它类中 对象名.访问
 *   类变量:在当前类中 类名. ，在其他类中 类名. 或对象名. 访问         
 * 5.生命周期
 *   局部变量: 每一个线程，每一次调用执行的都是新的生命周期
 *   实例变量: 随着对象的创建而初始化，随着对象的被回收而消亡，每一个对象的实例对象都是独立的
 *   类变量: 随着类的初始化而初始化，随着类的卸载而消亡，该类的所有对象的类变量是共享的
 *
 */
public class TestMemberVariable {
      static int s;//成员变量 类变量
      int i;//成员变量     实例变量
      int j;//成员变量     实例变量
      {
    	int i=1;//非静态代码块中的局部变量 i
         i++;
         j++;
         s++;
      }
	public void test(int j) {//形参 局部变量 j
		j++;
		i++;
		s++;
	}
	
	public static void main(String[] args) { //形参 局部变量 args
		TestMemberVariable s1=new TestMemberVariable();//局部变量 s1
		TestMemberVariable s2=new TestMemberVariable();//局部变量 s2
		 s1.test(10);
		 s1.test(20);
		 s2.test(30);
		 System.out.println(s1.i +"," +s1.j +"," +s1.s);
		 System.out.println(s2.i +"," +s2.j +"," +s2.s);

	}
	
}
