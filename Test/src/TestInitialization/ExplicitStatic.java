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
 *         <li>pansw：static静态块，只有</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class ExplicitStatic {
	public static void main(String[] args) {

		System.out.println("Inside main()");
		Cups.c1.f(99); // (1)
		}
		//static Cups x = new Cups(); // (2)
		//static Cups y = new Cups(); // (2)
}
