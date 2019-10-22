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
			File file = new File("C:\\Users\\pansw\\Desktop\\TRAN_CD - ����.xlsx");
			 List<String> lst=readExcel(file);
			// System.out.println(lst.toString());
	}

	public static List<String> readExcel(File file){
		// ��ȡExcel�ļ�
		List<String> fileList = new ArrayList();
		// ��������������ȡExcel
		// jxl�ṩ��Workbook��
		Workbook wb;
		try {
			wb = WriteExcel.getWorkbok(file);
			// ֻ��һ��sheet,ֱ�Ӵ���
			// ����һ��Sheet����

			Sheet sheet = wb.getSheetAt(0);
			// �õ����е����� ��һ�д�0��ʼ��
			int rows = sheet.getLastRowNum();
			//System.out.println(rows);
			// ���е�����
			
			// Խ����һ�� ����������
			for(
			int j = 1;j<=rows;j++)
			{
				// �õ�ÿһ�еĵ�Ԫ�������
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


