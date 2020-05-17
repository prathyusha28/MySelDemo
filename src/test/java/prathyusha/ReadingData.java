package prathyusha;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Hashtable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingData {

	public Object[][] myData(String workbook,String testSheet) throws Exception {
		File src = new File(workbook);
		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet mySheet = wb.getSheet(testSheet);
		System.out.println(mySheet.getRow(1).getCell(1).getStringCellValue());

		int rowCount = mySheet.getLastRowNum();
		rowCount = rowCount++;
		Object[][] data = new Object[rowCount][2];
		for (int i = 0; i < rowCount; i++) {

			for (int j=0; i< mySheet.getRow(i).getLastCellNum(); j++){
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				data[i][j] = value;
			}
		}
			return data;
	}
		//"C:\\Users\\Sunku\\Desktop\\My learning\\TestData.xlsx"
	//with hashTable
	public static Object[][] getTestData(String testFile,String sheetName) throws Exception {
		//File src = new File(workbook);
		FileInputStream myFile = new FileInputStream(testFile);

		XSSFWorkbook wb = new XSSFWorkbook(myFile);
		XSSFSheet sheet = wb.getSheet(sheetName);
		//System.out.println(mySheet.getRow(1).getCell(1).getStringCellValue());

		int rowCount = sheet.getLastRowNum();
		rowCount = rowCount++;
		Object[][] data = new Object[sheet.getLastRowNum()][1];
		int dataRow=0;
		
		Hashtable<String,String> table = null;
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			
			table = new Hashtable<String, String>();

			for (int j=0; i< sheet.getRow(0).getLastCellNum(); j++){
				String myKey = sheet.getRow(0).getCell(j).toString();
				System.out.println(myKey);
				//data[i][j] = value;
				
				String myValue = sheet.getRow(i).getCell(j).toString();
				System.out.println(myValue);
				table.put(myKey, myValue);
			}
			
			data[dataRow][0] = table;
			dataRow++;
		}
			return data;
	}
	
	
}

