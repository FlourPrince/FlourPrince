package cn.TestIocAop;
/**
 * <p>
 * 文件功能说明：
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019年10月22日-下午2:02:12</li>
 *         <li>修改记录</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>标记：修订内容</li>
 *         <li>pansw：创建注释模板</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class UserDao {
	private String name;
	private String password;
	
	public void add() {
		System.out.println(name);
		System.out.println(password);
		System.out.println("UserDao+++++++++++++");
	}

}
