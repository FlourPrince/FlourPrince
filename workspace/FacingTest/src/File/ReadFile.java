package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.read.biff.BiffException;
/*
 * ��ȡ���ļ�������
 */
public class ReadFile {

	public static void main(String[] args) {
		String path = "D:\\kelanWork\\20190901Master\\dps\\pcbs-dep\\dp\\dp-service\\src\\main\\java";
		List<String> lst = new GetFileNameList().getFileNameList(path);
	//	List<String> lst1 = ReadExcel.readExcel();
		// List<String> lst1 =new ArrayList<String>();
		// lst1.add("BdpAcctProtectDao");
		// lst1.add("BdpCalAmtLayerIntDao");
		//System.out.println(lst.toString());
		for (String pathname : lst) {
	//		readFile(pathname, lst1);
		}
	}

	public static void readFile(String pathname,List<String> lst1) {
		
		// ����·�������·�������ԣ�д���ļ�ʱ��ʾ���·��,��ȡ����·����input.txt�ļ�
		// ��ֹ�ļ��������ȡʧ�ܣ���catch��׽���󲢴�ӡ��Ҳ����throw;
		// ���ر��ļ��ᵼ����Դ��й¶����д�ļ���ͬ��
		// Java7��try-with-resources�������Źر��ļ����쳣ʱ�Զ��ر��ļ�����ϸ���https://stackoverflow.com/a/12665271
		int i = 0;
		int j=0;
		try (FileReader reader = new FileReader(pathname); BufferedReader br = new BufferedReader(reader)) // ����һ�����������ļ�����ת�ɼ�����ܶ���������
		{
			String line;
			while ((line = br.readLine()) != null) {
				// һ�ζ���һ������
				j++;
				// System.out.println(line);
				for(String name:lst1) {
					if (line.contains(name)) {
						i++;
						System.out.println(name);
						return  ;
					}
				}
				
			}
			if(i!=0) {
				System.out.println("���ļ��´���ƥ��ExtDepCdPwdErrorDetlDaoIoService����,����"+i +"��,�ļ���Ϊ"+pathname);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
