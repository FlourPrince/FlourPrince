package TestInitialize;
/**
 * <p>
 * �ļ�����˵�������ʼ�� ��ʵ����ʼ��
 *       ���ʼ��  			
 *     1.һ����Ҫ����ʵ����Ҫ�ȼ��ز���ʼ������
 *       main�������ڵ�����Ҫ�ȼ��غͳ�ʼ��
 *     2.һ������Ҫ��ʼ�� ��Ҫ�ȳ�ʼ������
 *     3.һ�����ʼ������ִ��<clinit>����      
 *        <clinit>����    �ɾ�̬�������ʾ��ֵ����;�̬�������� 
 *                �������ʾ��ֵ����;�̬����������ϵ���˳��ִ��
 *         <clinit>���� ִֻ��һ�� 
 *        ʵ����ʼ��    
 *        1.ʵ����ʼ������ִ��<init>()����
 *          <init>()�������������ɶ�����м������������м���<init>()����
 *          <init>()�����ɷǾ�̬ʵ��������ʾ��ֵ����ͷǾ�̬����顢��Ӧ�������������
 *                  �Ǿ�̬ʵ��������ʾ��ֵ����ͷǾ�̬����������ϵ���˳��ִ�У���Ӧ�������Ĵ������ִ��
 *                  ÿ�δ���ʵ�����󣬵��ö�Ӧ��������ִ�еľ��Ƕ�Ӧ��<init>()����     
 *         <init>()���� ��������super()��super(ʵ)
 *         
 *   ������д      
 *   1.��Щ���������Ա���д
 *      final����
 *      ��̬����    
 *      private�����಻�ɼ�����   
 *    2.����Ķ�̬��
 *    ���������д�˸���ķ�����ͨ�����������õ�һ����������д���Ĵ���
 *    �Ǿ�̬����Ĭ�ϵĵ��ö�����this
 *    this�����ڹ���������˵<init> �����о������ڴ����Ķ���   
 *             
 *         
 */
public class Son extends Father {
	private int i = test();
	private static int j = method();
	static {
		System.out.println("6");
	}

	Son() {
		System.out.println("7");
	}

	{
		System.out.println("8");
	}

	public int test() {

		System.out.println("9");
		return 1;
	}

	public static int method() {
		System.out.println("10");
		return 1;
	}
	
	public static void main(String[] args) {
		Son s1=new Son();
		System.out.println();
		Son s2=new Son();
	}

}
