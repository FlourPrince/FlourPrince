package TestInitialization;
/**
 * <p>
 * 文件功能说明：
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019年4月28日-下午11:30:43</li>
 *         <li>修改记录</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>标记：修订内容</li>
 *         <li>pansw：在一个类里，初始化的顺序是由变量在类内的定义顺序决定的,即使变量定义大量遍布于方法定义的中间，
                                       那些变量仍会在调用任何方法之前得到初始化——甚至在构建器调用之前</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class Tag {
		Tag(int marker) {
		System.out.println("Tag(" + marker + ")");
		}
		public static void main(String[] args) {
		Card t = new Card();
		t.f(); // Shows that construction is done
		}
}
