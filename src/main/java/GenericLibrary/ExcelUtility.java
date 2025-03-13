package GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility implements IAutoConstant{
	
	public String getDataFromExcel(String path, String sheetName, int rowNum, int cellNum ) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet=book.getSheet(sheetName);
		Row row=sheet.getRow(rowNum);
		Cell cell=row.getCell(cellNum);
		//return cell.getStringCellValue();
		return cell.toString();
	}
	
	public Object[][] getMultipleDataFromExcel(String path, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(file);
		Sheet sheet=book.getSheet(sheetName);
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfCells=sheet.getRow(0).getPhysicalNumberOfCells();
		Object obj[][]=new Object[noOfRows-1][noOfCells];
		for(int i=1;i<noOfRows;i++)
		{
			for(int j=0;j<noOfCells;j++)
			{
				obj[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return obj;
		
	}

}
