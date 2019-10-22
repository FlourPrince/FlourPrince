package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WriteExcel {
	private static final String EXCEL_XLS = "xls";
	private static final String EXCEL_XLSX = "xlsx";

	public static void main(String[] args) {
		GetFileNameList GetFileNameList=new GetFileNameList();
		String path = "D:\\kelanWork\\20190901Master\\dps\\pcbs-dep\\dp\\dp-service\\src\\main\\java\\com\\csii\\pcbs\\dp\\comp"; 
		List<String> lst= GetFileNameList.getFileNameList(path);
		System.out.println(lst.size());
		//System.out.println(lst.toString());
		//list.add("ExtDpMbT73264DaoIoService.java");
		writeExcel(lst, 3, "C:\\Users\\pansw\\Desktop\\dpService.xlsx");
				
	}

	public static void writeExcel(List dataList, int cloumnCount, String finalXlsxPath) {
		OutputStream out = null;
		try {
			// ��ȡ������
			int columnNumCount = cloumnCount;
			// ��ȡExcel�ĵ�
			File finalXlsxFile = new File(finalXlsxPath);
			Workbook workBook = getWorkbok(finalXlsxFile);
			// sheet ��Ӧһ������ҳ
			Sheet sheet = workBook.getSheetAt(0);
			/**
			 * ɾ��ԭ�����ݣ�����������
			 */
			int rowNumber = sheet.getLastRowNum(); // ��һ�д�0��ʼ��
			System.out.println("ԭʼ�������������������У�" + rowNumber);
			for (int i = 1; i <= rowNumber; i++) {
				Row row = sheet.getRow(i);
				sheet.removeRow(row);
			}
			// �����ļ��������������ӱ����������У���������sheet�������κβ�����������Ч
			out = new FileOutputStream(finalXlsxPath);
			workBook.write(out);
			/**
			 * ��Excel��д������
			 */
			//д���б���
			Row Row = sheet.createRow(0);
			Cell Cell = Row.createCell(0);
			Cell.setCellValue("�����ṩAPI");
			//д��������
			for (int j = 0; j < dataList.size(); j++) {
				// ����һ�У��ӵڶ��п�ʼ������������
				Row row = sheet.createRow(j + 1);
				// �õ�Ҫ�����ÿһ����¼
				//Map dataMap = dataList.get(j);
				String name = dataList.get(j).toString();
				System.out.println(name);
				for (int k = 0; k <= columnNumCount; k++) {
					// ��һ����ѭ��
					Cell first = row.createCell(0);
					first.setCellValue(name);

				}
			}
			// �����ļ��������׼��������ӱ����������У���������sheet�������κβ�����������Ч
			out = new FileOutputStream(finalXlsxPath);
			workBook.write(out);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (out != null) {
					out.flush();
					out.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("���ݵ����ɹ�");
	}

	/**
	 * �ж�Excel�İ汾,��ȡWorkbook
	 * 
	 * @param in
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	public static Workbook getWorkbok(File file) throws IOException {
		Workbook wb = null;
		FileInputStream in = new FileInputStream(file);
		if (file.getName().endsWith(EXCEL_XLS)) { // Excel&nbsp;2003
			wb = new HSSFWorkbook(in);
		}
		else if (file.getName().endsWith(EXCEL_XLSX)) { // Excel 2007/2010
			wb = new XSSFWorkbook(in);
		}
		return wb;
	}

}
