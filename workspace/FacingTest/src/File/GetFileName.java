package File;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
/*
 * ��ȡ���ļ����������ļ��������Ϣ
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
		//�������ļ���Ŀ¼������еݹ�����
		if(fileIndex.isDirectory()){
			System.out.println("000000");
			//getFile(fileIndex.getPath());
		}
		else {
		//����ļ�����ͨ�ļ������ļ�������뼯����
		//fileList.add(fileIndex.getName());// ��ȡ�ļ���
		//System.out.println(fileIndex.getPath());//��ȡ�ļ�·������������
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
