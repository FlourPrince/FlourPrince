package TestInitialization;
/**
 * <p>
 * �ļ�����˵����
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019��4��28��-����11:30:43</li>
 *         <li>�޸ļ�¼</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>��ǣ��޶�����</li>
 *         <li>pansw����һ�������ʼ����˳�����ɱ��������ڵĶ���˳�������,��ʹ������������鲼�ڷ���������м䣬
                                       ��Щ�����Ի��ڵ����κη���֮ǰ�õ���ʼ�����������ڹ���������֮ǰ</li>
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
