package Maven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataexcelGeneric {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readexcel("ram");
	}

	public static Object[][] readexcel(String sheetname) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/Data/yash.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] s = new Object[row-1][cell];
		
		for (int i=1; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				s[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return s;
	}
}
