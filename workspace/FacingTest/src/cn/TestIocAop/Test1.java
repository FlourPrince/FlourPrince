package cn.TestIocAop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * �ļ�����˵����
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019��10��22��-����2:05:55</li>
 *         <li>�޸ļ�¼</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>��ǣ��޶�����</li>
 *         <li>pansw������ע��ģ��</li>
 *         <li>-----------------------------------------------------------</li>
 *         </p>
 */
public class Test1 {
	@Test
	public void  test() {
		System.out.println("++++++++++++++++");
		
		ApplicationContext app=new ClassPathXmlApplicationContext("bean1.xml");
		System.out.println("++++++++++++++++");
		UserService UserService =     (UserService) app.getBean("userService");
		UserService.add();
		
		
		
		
	}

}
