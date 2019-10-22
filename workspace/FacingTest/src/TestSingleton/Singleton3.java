package TestSingleton;

import java.io.IOException;
import java.util.Properties;

public class Singleton3 {
	public static final Singleton3 INSTANCE ;
	private String info ;
	static {
		try {
			Properties pro =new Properties();
			pro.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));
			
			 INSTANCE =new Singleton3(pro.getProperty("info"));
		}
		catch (IOException e) {
			throw new  RuntimeException();
		}
		
	}
	private Singleton3 (String info) {
		this.info=info;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Singleton3 [info=" + info + "]";
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo(String info) {
		this.info = info;
	}
	
}
