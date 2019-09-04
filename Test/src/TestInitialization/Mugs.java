package TestInitialization;

/**
 * <p>
 * 文件功能说明：
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019年4月29日-上午12:12:50</li>
 *         <li>修改记录</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>标记：修订内容</li>
 *         <li>pansw：创建注释模板</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class Mugs {
	Mugs() {
		System.out.println("Mugs()");
		}
	public static void main(String[] args) {
		Mug c1;
		Mug c2;
		{
		c1 = new Mug(1);
		c2 = new Mug(2);
		System.out.println("c1 & c2 initialized");
		}
		System.out.println("Inside main()");
		Mugs x = new Mugs();
	}
}
