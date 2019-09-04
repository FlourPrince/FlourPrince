package TestInitialization;
/**
 * <p>
 * 文件功能说明：
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019年4月28日-下午11:39:54</li>
 *         <li>修改记录</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>标记：修订内容</li>
 *         <li>pansw：创建注释模板</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class Table {
	static Bowl b1 = new Bowl(1);
	Table() {
	System.out.println("Table()");
	b2.f(1);
	}
	void f2(int marker) {
	System.out.println("f2(" + marker + ")");
	}
	static Bowl b2 = new Bowl(2);
}
