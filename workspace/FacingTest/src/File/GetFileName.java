package File;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
 * 获取该文件夹下所有文件的相关信息
 */
public class GetFileName {

	public static void main(String[] args) {
		String path = "D:\\kelanWork\\20190901Master\\dps\\pcbs-dep\\dp\\dp-api\\src\\main\\java\\com\\csii\\pcbs\\dp\\external\\service"; 
		List<String> lst= getFile(path);
	
		
		//  System.out.println(lst.size());
		 
		 
	}
	public static List<String>  getFile(String path){
		File file = new File(path);
		List<String> fileList = new ArrayList();
		if(file.isDirectory()){ 
		File []files = file.listFiles();
		for(File fileIndex:files){
		//如果这个文件是目录，则进行递归搜索
		if(fileIndex.isDirectory()){
			System.out.println("000000");
			//getFile(fileIndex.getPath());
		}
		else {
		//如果文件是普通文件，则将文件句柄放入集合中
		//fileList.add(fileIndex.getName());// 获取文件名
		//System.out.println(fileIndex.getPath());//获取文件路径包括方法名
		//	System.out.println("11111111");
			fileList.add(fileIndex.getName());
			  System.out.println(fileIndex.getName());

			
		}
	}
		}
		//System.out.println(fileList.toString());
		return fileList;
		
	}
	
	
}
