package TestIndependentVariable;
/**
 * @Author pansw
 *         <p>
 *         <li>2019��9��19��-����8:08:46</li>
 *         <li>����˵����ʹ��list��ѭ��</li>
 *         </p>�������� ����
 * @param args
 */
public class Test01 {
	/* 1.��ֵ=��������
	 * 2.=�ұߵĴ����Ҽ���ֵ����ѹ�������ջ
	 * 3.ʵ�������ĸ�������������ȼ�
	 * 4.�������Լ���������ֱ���޸ı�����ֵ��������������ջ
	 * 5.���ĸ�ֵ֮ǰ����ʱ���Ҳ�Ǵ洢�ڲ�����ջ�� 
	 * 
	 * ++i  ֱ�Ӹı����ֵ
	 * i++  ����ӵ�������ջ
	 *  */
	public static void main(String[] args) {
             int i=1;
             i=i++;
             System.out.println("i="+i);
		/*
		 * �Ȱ�1�ӵ�������ջ������++,�ֲ�����=2������i��ֵ������ջ
		 * �ֲ����� 
		 * 2
		 * ������ջ
		 * 1
		 */
             int j=i++;
             System.out.println("i="+i);
             System.out.println("j="+j);
		/*
		 * �Ȱ�1�ӵ�������ջ������++,�ֲ�����=2����j��ֵ������ջ=1 i��ֵ�ֲ�����=2
		 * * �ֲ����� 
		 * 2
		 * ������ջ
		 * 1
		 */
             int k= ++i*i ++ +i;
		/*
		 * �Ȱ�2�ӵ�������ջ��++i,�ȵõ��ֲ�����=3�������ӵ�����ջ,i++�õ��ֲ�����=4��
		 *�ֲ����� 
		 * 4
		 * 
		 *  ������ջ 
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
