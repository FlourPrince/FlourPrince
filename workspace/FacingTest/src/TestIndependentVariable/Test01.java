package TestIndependentVariable;
/**
 * @Author pansw
 *         <p>
 *         <li>2019年9月19日-下午8:08:46</li>
 *         <li>功能说明：使用list的循环</li>
 *         </p>自增变量 操作
 * @param args
 */
public class Test01 {
	/* 1.赋值=，最后计算
	 * 2.=右边的从左到右加载值依次压入操作数栈
	 * 3.实际先算哪个，看运算符优先级
	 * 4.自增、自减操作都是直接修改变量的值，不经过操作数栈
	 * 5.最后的赋值之前，临时结果也是存储在操作数栈中 
	 * 
	 * ++i  直接改变变量值
	 * i++  先添加到操作数栈
	 *  */
	public static void main(String[] args) {
             int i=1;
             i=i++;
             System.out.println("i="+i);
		/*
		 * 先把1扔到操作数栈，接着++,局部变量=2，最后给i赋值操作数栈
		 * 局部变量 
		 * 2
		 * 操作数栈
		 * 1
		 */
             int j=i++;
             System.out.println("i="+i);
             System.out.println("j="+j);
		/*
		 * 先把1扔到操作数栈，接着++,局部变量=2，给j赋值操作数栈=1 i赋值局部变量=2
		 * * 局部变量 
		 * 2
		 * 操作数栈
		 * 1
		 */
             int k= ++i*i ++ +i;
		/*
		 * 先把2扔到操作数栈，++i,先得到局部变量=3，接着扔到操作栈,i++得到局部变量=4，
		 *局部变量 
		 * 4
		 * 
		 *  操作数栈 
		 *  2
		 *  3
		 *  3
		 */
             System.out.println("i="+i);
             System.out.println("j="+j);
             System.out.println("k="+k);
             int a =1;
               a++;
               a=a++;
               System.out.println("a="+a);
             int  b=1;
                ++b;
                b=++b;
                System.out.println("b="+b);
                int c=1;
                int d=1;
                System.out.println(c==d++);
             
            int m=2;
            int n=(++m)+(m++)+(m++);
            System.out.println(n);
	}
}
