package com.javatutorialspot;


import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class HelloWorld 
{
   public static void main(String[] args)
  {
	try {
	
		 XWPFDocument document = new XWPFDocument();
	     FileOutputStream out = new FileOutputStream(new File("F:\\movies\\Gnw pics\\create_table.docx"));
	     
	     XWPFTable table = document.createTable();

	     XWPFTableRow tableRowOne = table.getRow(0);
	     tableRowOne.getCell(0).setText("col one, row one");
	     tableRowOne.addNewTableCell().setText("col two, row one");
	     tableRowOne.addNewTableCell().setText("col three, row one");

	     XWPFTableRow tableRowTwo = table.createRow();
	     tableRowTwo.getCell(0).setText("col one, row two");
	     tableRowTwo.getCell(1).setText("col two, row two");
	     tableRowTwo.getCell(2).setText("col three, row two");

	     XWPFTableRow tableRowThree = table.createRow();
	     tableRowThree.getCell(0).setText("col one, row three");
	     tableRowThree.getCell(1).setText("col two, row three");
	     tableRowThree.getCell(2).setText("col three, row three");
	     document.write(out);
	     out.close();
	     System.out.println("create_table.docx written successully");
		}catch(Exception e) 
	{
		System.out.println("Issues found"+e);
	}
	     
 }
}
