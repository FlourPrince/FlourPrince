package SpringIoc;
/*
 * 属性注入方式
 * 1.set方法注入
 * 2.有参构造注入
 * 3.接口注入
 */
public class TestSpringIOC02 {
   /**
	 * @param name
	 */
	public TestSpringIOC02(String name) {
		super();
		this.name = name;
	}

String name;

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
   //TestSpringIOC02 TestSpringIOC02=new TestSpringIOC02("111");---有参注入
   //TestSpringIOC02 TestSpringIOC02=new TestSpringIOC02();---
   //TestSpringIOC02.setName("111");----set方法注入
}
