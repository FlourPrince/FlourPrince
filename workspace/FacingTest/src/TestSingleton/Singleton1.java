package TestSingleton;
/**
     饿汉式   不存在线程安全
     直接创建实例对象，不管是否需要这个对象
 * 1.构造器私有化
 * 2.自行创建，并用静态变量保存
 * 3.向外提供实例
 * 4.强调这是一个单例，用关键字final修饰
 * 
 * 
 */
public class Singleton1 {
      public static final Singleton1  INSTANCES= new Singleton1();
    	private Singleton1() {
    		//
    	}
    	
}
