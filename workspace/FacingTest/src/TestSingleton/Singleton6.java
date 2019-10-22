package TestSingleton;
public class Singleton6 {
	/*
	 * 在内部类被加载和初始化时，才创建INSTANCE实例对象
	 * 静态内部类不会自动随着外部类的加载和初始化而初始化
	 * 独立的
	 * 因为是在内部类加载和初始化时，创建的，所以是线程安全的
	 * 适用多线程
	 */
	private Singleton6() {
		
	}
	private static class Inner{
		private static final Singleton6 INSTANCE =new Singleton6() ;
	}
	
	private static Singleton6 getInstance() {
		return Inner.INSTANCE;
	}
}
