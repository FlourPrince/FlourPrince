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
 *         <li>pansw�����Ⱦ�̬static���󣬽��ŷ�static���󡢿ɶ�˴��������Ź�������Ȼ�󷽷�</li>
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
