package TestInitialization;
/**
 * <p>
 * �ļ�����˵����
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019��4��28��-����11:39:54</li>
 *         <li>�޸ļ�¼</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>��ǣ��޶�����</li>
 *         <li>pansw������ע��ģ��</li>
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
