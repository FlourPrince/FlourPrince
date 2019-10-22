package SpringIoc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	
	
	@Test
  public static void main(String[] args) {
	
	  ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationIOC.xml");
	  TestSpringIoc01 TestSpringIoc01=   (SpringIoc.TestSpringIoc01) ctx.getBean("testSpringIoc01");
	  TestSpringIoc01.add();
	  
	  
}
}
