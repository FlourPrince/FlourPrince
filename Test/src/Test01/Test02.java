package Test01;

import java.io.IOException;
import java.util.Scanner;

/**
 * <p>
 * 文件功能说明：
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019年3月18日-下午9:30:49</li>
 *         <li>修改记录</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>标记：修订内容</li>
 *         <li>pansw：创建注释模板</li>
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
	 float f=(float)3.4;//精度不准确,应该用强制类型转换
}
 public static  void  TestStringBuffer() {
	String s ="1";
	//String 字符长度不可变，StringBuffer 字符串长度可变，对于字符串内容的操作，
	//使用StringBuffer ,如果最后结果需要String,可以用StringBuffer的.toString方法。
	StringBuffer sb=new StringBuffer(s);
	   StringBuilder sbb=new StringBuilder(s);//StringBuilder是JDK1.5，为StringBuffer补充的的单线程使用的等价类，由于不执行同步，速度快，安全
}
	public static void main(String[] args) {
		TestLength();
}
	
}