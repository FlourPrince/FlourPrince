package Object;
public class Test01 {
	//定义银行柜员属性
   String name;
   int   number;
   int   cash;

  public void setName (String name1) {
	  name=name1;
  }
  public void setNumber (int number1) {
	  number=number1;
  }
  public void setCash (int cash1) {
	  cash=cash1;
  }
  public String  getName () {
	  
	  return name;
  }
  public int getNumber() {
	  return number;
  }
  public int getCash() {
	  return cash;
  }
	public static void main(String[] args) {
 /*         Test01 test01=new Test01();
          test01.setCash(0);
          test01.setName("中国");
          test01.setNumber(1);
         System.out.println(test01.getCash());
         System.out.println(test01.getName());
         System.out.println(test01.getNumber());
         String a;
         a="cccc";
         System.out.println(a);
         System.out.println(Math.pow(2, 15));//2的15次方
*/        int i=-1;
        i>>>=10;
        System.out.println(i);
	}
}
