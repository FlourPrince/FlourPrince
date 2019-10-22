package File;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GetFileNameList {
	/*
	 * 获取该文件夹下所有文件的相关信息 (包括子目录)
	 */

	public static void main(String[] args) {
		String dir_name = "D:\\\\kelanWork\\\\20190901Master\\\\dps\\\\pcbs-dep\\\\dp\\\\dp-service\\\\src\\\\main\\\\java\\\\com\\\\csii\\\\pcbs\\\\dp\\\\comp\\\\accounting";

		List<String> lst = getFileNameList(dir_name);

		System.out.println(lst.size());
		System.out.println(lst.toString());

	}
	public static List<String> getFileNameList(String dir_name) {
		List<String> fileList = new ArrayList();
		Vector<String> ver = new Vector<String>();
		ver.add(dir_name);
		while (ver.size() > 0) {
			File[] files = new File(ver.get(0).toString()).listFiles(); // 获取该文件夹下所有的文件(夹)名
			ver.remove(0);
			int len = files.length;
			for (int i = 0; i < len; i++) {
				String tmp = files[i].getAbsolutePath();

				if (files[i].isDirectory()) // 如果是目录，则加入队列。以便进行后续处理
				{
					ver.add(tmp);
				}
				else {
					// System.out.println(files[i].getName());
					fileList.add(files[i].getPath());
				}
			}
		}
		return fileList;
	}
}
