package TestSingleton;
/**
     ����ʽ   �������̰߳�ȫ
     ֱ�Ӵ���ʵ�����󣬲����Ƿ���Ҫ�������
 * 1.������˽�л�
 * 2.���д��������þ�̬��������
 * 3.�����ṩʵ��
 * 4.ǿ������һ���������ùؼ���final����
 * 
 * 
 */
public class Singleton1 {
      public static final Singleton1  INSTANCES= new Singleton1();
    	private Singleton1() {
    		//
    	}
    	
}
