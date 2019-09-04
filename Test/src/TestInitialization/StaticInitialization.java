package TestInitialization;

/**
 * <p>
 * 文件功能说明：
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019年4月28日-下午11:42:36</li>
 *         <li>修改记录</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>标记：修订内容</li>
 *         <li>pansw：首先静态static对象，接着非static对象、可多此创建，接着构造器，然后方法</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class StaticInitialization {

	public static void main(String[] args) {
		System.out.println(
		"Creating new Cupboard() in main");
		new Cupboard();
		System.out.println(
		"Creating new Cupboard() in main");
		new Cupboard();
		t2.f2(1);
		t3.f3(1);
		}
		static Table t2 = new Table();
		static Cupboard t3 = new Cupboard();
		}
