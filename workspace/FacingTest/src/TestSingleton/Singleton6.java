package TestSingleton;
public class Singleton6 {
	/*
	 * ���ڲ��౻���غͳ�ʼ��ʱ���Ŵ���INSTANCEʵ������
	 * ��̬�ڲ��಻���Զ������ⲿ��ļ��غͳ�ʼ������ʼ��
	 * ������
	 * ��Ϊ�����ڲ�����غͳ�ʼ��ʱ�������ģ��������̰߳�ȫ��
	 * ���ö��߳�
	 */
	private Singleton6() {
		
	}
	private static class Inner{
		private static final Singleton6 INSTANCE =new Singleton6() ;
	}
	
	private static Singleton6 getInstance() {
		return Inner.INSTANCE;
	}
}
