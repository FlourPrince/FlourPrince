package TestInitialization;

/**
 * <p>
 * �ļ�����˵����
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019��4��29��-����12:12:50</li>
 *         <li>�޸ļ�¼</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>��ǣ��޶�����</li>
 *         <li>pansw������ע��ģ��</li>
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
