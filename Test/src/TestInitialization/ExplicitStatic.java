package TestInitialization;
/**
 * <p>
 * �ļ�����˵����
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019��4��28��-����11:42:36</li>
 *         <li>�޸ļ�¼</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>��ǣ��޶�����</li>
 *         <li>pansw��static��̬�飬ֻ��</li>
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
