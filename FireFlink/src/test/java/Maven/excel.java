package Maven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excel {
	@Test
	public static Object[][] test(String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream("./src/test/resources/Data/yash.xlsx");
		Workbook wd = WorkbookFactory.create(fs);
		Sheet sheet = wd.getSheet(sheetname);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] s=new Object[row-1][cell];
		for (int i=1; i < row; i++) 
		{
			for (int j = 0; j < cell; j++) {
				s[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return s;

	}
}
