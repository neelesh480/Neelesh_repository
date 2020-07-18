package tutorials.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  


public class ReadCellExample 
{
	public static void main(String[] args) 
	{
		ReadCellExample rc = new ReadCellExample(); 

		String vOutput = rc.ReadCellData(2, 2);
		System.out.println(vOutput);
	}

//method defined for reading a cell  
	public String ReadCellData(int vRow, int vColumn) 
	{
		String value = null;
		Workbook wb = null;
		try 
		{
			FileInputStream fis = new FileInputStream("F:\\movies\\EmployeeData.xlsx");
			wb = new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e1) 
		{
			e1.printStackTrace();
		}
		Sheet sheet = wb.getSheetAt(0); // getting the XSSFSheet object at given index
		/*
		 * Row row = sheet.getRow(vRow); // returns the logical row Cell cell =
		 * row.getCell(vColumn); // getting the cell representing the given column value
		 * = cell.getStringCellValue(); // getting cell value return value; // returns
		 * the cell value
		 */
		Iterator<Row> itr = sheet.iterator(); // iterating over excel file
		while (itr.hasNext()) {
			Row row = itr.next();
			Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each column
			while (cellIterator.hasNext()) 
			{
				Cell cell = cellIterator.next();
				switch (cell.getCellType()) 
				{
				case Cell.CELL_TYPE_STRING: // field that represents string cell type
					System.out.print(cell.getStringCellValue() + "\t\t\t");
					break;
				case Cell.CELL_TYPE_NUMERIC: // field that represents number cell type
					System.out.print(cell.getNumericCellValue() + "\t\t\t");
					break;
				default:
				}
			}

		}
	}
}