package SpringIoc;
/*
 * ����ע�뷽ʽ
 * 1.set����ע��
 * 2.�вι���ע��
 * 3.�ӿ�ע��
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
   //TestSpringIOC02 TestSpringIOC02=new TestSpringIOC02("111");---�в�ע��
   //TestSpringIOC02 TestSpringIOC02=new TestSpringIOC02();---
   //TestSpringIOC02.setName("111");----set����ע��
}
