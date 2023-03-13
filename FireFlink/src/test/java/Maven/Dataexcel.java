package Maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dataexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis = new FileInputStream("./src/test/resources/Data/yash.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
//	1	String data = wb.getSheet("ram").getRow(1).getCell(1).getStringCellValue();
//		System.out.println(data);
		
//	2	int count = wb.getSheet("ram").getLastRowNum();
//		
//		for (int i = 0; i <= count; i++) 
//		{
//			String userName = wb.getSheet("ram").getRow(i).getCell(0).toString();
//			String pwd = wb.getSheet("ram").getRow(i).getCell(1).toString();
//			String slno = wb.getSheet("ram").getRow(i).getCell(2).toString();
//			
//			System.out.println(userName + "----->"+pwd+"---->"+slno);
//		}
		
		 Sheet sheet = wb.getSheet("Ram");
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
//		for (int i = 0; i <row; i++) 
//		{
//			for (int j = 0; j <cell; j++) {
//				String data = sheet.getRow(i).getCell(j).toString();
//				System.out.print(data+"    ");
//			}
//			System.out.println();
//		}
Object[][] o=new Object[row-1][cell];
for (int i = 1; i <row; i++) {
	for (int j = 0; j <cell; j++) {
		 o[i-1][j]=sheet.getRow(i).getCell(j).toString();
		System.out.print(o[i-1][j]+" ");
	}
	System.out.println();
}

}
}
