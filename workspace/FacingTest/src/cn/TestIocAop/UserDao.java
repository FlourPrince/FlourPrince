package cn.TestIocAop;
/**
 * <p>
 * �ļ�����˵����
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019��10��22��-����2:02:12</li>
 *         <li>�޸ļ�¼</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>��ǣ��޶�����</li>
 *         <li>pansw������ע��ģ��</li>
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
