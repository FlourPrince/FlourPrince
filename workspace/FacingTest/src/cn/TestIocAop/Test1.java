package cn.TestIocAop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * 文件功能说明：
 *       			
 * </p>
 * 
 * @Author pansw
 *         <p>
 *         <li>2019年10月22日-下午2:05:55</li>
 *         <li>修改记录</li>
 *         <li>-----------------------------------------------------------</li>
 *         <li>标记：修订内容</li>
 *         <li>pansw：创建注释模板</li>
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
