package week5.assignment;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parameterizationCL {

	public static String[][] readExcel() throws IOException {

		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead1.xlsx");
			
		XSSFSheet sheet = wb.getSheetAt(0); //sheet index number
			
		int rowCount = sheet.getLastRowNum();
		
		int cellCount = sheet.getRow(1).getLastCellNum();
		
//step1 -create String[][] and assign the value
		
		String[][] value=new String[rowCount][cellCount];
		//5,4
		
		for (int i = 1; i <=rowCount; i++) {
			
			for (int j = 0; j < cellCount; j++) {
				
				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				
				//step2 assign value from excel sheet to DataProvider
				value[i-1][j]=data;
				//excel sheet its start from index 1
				//dataProvider index will start from 0
				//System.out.println(data);
			}
		}
		
		wb.close();
		
		//step 3 return the value given
		return value;
	}

}