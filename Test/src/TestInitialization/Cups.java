package TestInitialization;
public class Cups {
	static Cup c1;
	static Cup c2;
	static {
	c1 = new Cup(1);
	c2 = new Cup(2);
	}
	//static¾²Ì¬¿é
	Cups() {
	System.out.println("Cups()");
	}
}
