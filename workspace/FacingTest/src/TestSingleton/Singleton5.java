package TestSingleton;

/*
 * 懒汉式
 * 延迟创建实例对象
 * 1.构造器私有化
 * 2.用一个静态变量保存唯一的实例
 * 3。提供一个静态方法，获取实例对象
 * 
 * 加synchronized 线程安全
 * 
 * 
 * 
 */
public class Singleton5 {
	private static Singleton5 instance;

	private Singleton5() {

	}

	public static Singleton5 getInstance() {
		if (instance == null) {
			synchronized (Singleton5.class) {
				if (instance == null) {
					try {
						Thread.sleep(100);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new Singleton5();
				}
			}
		}
		return instance;
	}
}
