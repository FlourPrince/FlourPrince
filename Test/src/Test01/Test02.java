package Test01;

import java.io.IOException;
import java.util.Scanner;

/**
 * <p>
 * �ļ�����˵����
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019��3��18��-����9:30:49</li>
 *         <li>�޸ļ�¼</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>��ǣ��޶�����</li>
 *         <li>pansw������ע��ģ��</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class Test02 {
	public static void TestScan () {
		 Scanner scan =new Scanner(System.in);
		   String s=scan.nextLine();
		   scan.close();
		   System.out.println(s);
	}
	public static void TestEquals () {
		 String a ="a";
		 String b ="a";
		 String c=new String("a");
		 String d=new String("a");
		System.out.println(b==a);
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		boolean f =a.equals(null);
		 System.out.println(f);
	 
}
	public static void TestInteger() {
		Integer a=1;
		Integer b=1;
		System.out.println(a==b);
		Integer c=200;
		Integer d=200;
		System.out.println(c==d);
	}
	public static void TestInt() {
		int a=20;
		int b=30;
		 a=(a/2)*3;
		 b=(b/3)*2;
		 System.out.println(a);
		 System.out.println(b);
	}
 public static void Test8() {
	 double a= Math.pow(2, 3);
	System.out.print(a);
}
 public static void TestLength() {
	 String s ="123456789";
	 System.out.println(s.length());
}
 public static void TestFloat() {
	 float f=(float)3.4;//���Ȳ�׼ȷ,Ӧ����ǿ������ת��
}
 public static  void  TestStringBuffer() {
	String s ="1";
	//String �ַ����Ȳ��ɱ䣬StringBuffer �ַ������ȿɱ䣬�����ַ������ݵĲ�����
	//ʹ��StringBuffer ,����������ҪString,������StringBuffer��.toString������
	StringBuffer sb=new StringBuffer(s);
	   StringBuilder sbb=new StringBuilder(s);//StringBuilder��JDK1.5��ΪStringBuffer����ĵĵ��߳�ʹ�õĵȼ��࣬���ڲ�ִ��ͬ�����ٶȿ죬��ȫ
}
	public static void main(String[] args) {
		TestLength();
}
	
}