package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.read.biff.BiffException;
/*
 * 读取该文件下内容
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
		
		// 绝对路径或相对路径都可以，写入文件时演示相对路径,读取以上路径的input.txt文件
		// 防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
		// 不关闭文件会导致资源的泄露，读写文件都同理
		// Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
		int i = 0;
		int j=0;
		try (FileReader reader = new FileReader(pathname); BufferedReader br = new BufferedReader(reader)) // 建立一个对象，它把文件内容转成计算机能读懂的语言
		{
			String line;
			while ((line = br.readLine()) != null) {
				// 一次读入一行数据
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
				System.out.println("该文件下存在匹配ExtDepCdPwdErrorDetlDaoIoService内容,共计"+i +"处,文件名为"+pathname);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
