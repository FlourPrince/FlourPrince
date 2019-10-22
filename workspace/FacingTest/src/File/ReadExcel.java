package File;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import jxl.read.biff.BiffException;

public class ReadExcel {
	 public static void main(String[] args) {
			File file = new File("C:\\Users\\pansw\\Desktop\\TRAN_CD - 副本.xlsx");
			 List<String> lst=readExcel(file);
			// System.out.println(lst.toString());
	}

	public static List<String> readExcel(File file){
		// 读取Excel文件
		List<String> fileList = new ArrayList();
		// 创建输入流，读取Excel
		// jxl提供的Workbook类
		Workbook wb;
		try {
			wb = WriteExcel.getWorkbok(file);
			// 只有一个sheet,直接处理
			// 创建一个Sheet对象

			Sheet sheet = wb.getSheetAt(0);
			// 得到所有的行数 第一行从0开始算
			int rows = sheet.getLastRowNum();
			//System.out.println(rows);
			// 所有的数据
			
			// 越过第一行 它是列名称
			for(
			int j = 1;j<=rows;j++)
			{
				// 得到每一行的单元格的数据
				Row r = sheet.getRow(j);
				       r.getCell(0);
			//	System.out.println(r.getCell(0).toString());
				fileList.add(r.getCell(0).toString());
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return fileList;
	}
	
}


