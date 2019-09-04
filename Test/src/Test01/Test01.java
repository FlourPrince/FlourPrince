package Test01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {
		Test();
	}
	  public static void Test() throws IOException {
   	  
		   try {
			   FileInputStream fis=new FileInputStream("C:\\Users\\pansw\\Desktop\\设计事务余额的方法.txt");
			   InputStreamReader isr = new InputStreamReader(fis);
			      BufferedReader br = new BufferedReader(isr);
			      String lineTxt = null;
			      while ((lineTxt = br.readLine()) != null) {
			    	 // System.out.println(lineTxt);
			    	  System.out.println("update tsp_service_control a set a.confirm_service='DpAffrTwcSubmit' , a.service_transaction_mode='Required'  where a.inner_service_code="+"'"+lineTxt+"';");
			     //   String [] result = lineTxt.split(",");
			      //  System.out.println(result.length);
			      /*  for(int a = 0;a<result.length;a++){
			           String retult=result[a];
			          String  str =retult.substring(0, 4);
			        }*/
		}
			        br.close();
		   }
		catch (Exception e) {
			e.printStackTrace();
		}
		  
   }
}
