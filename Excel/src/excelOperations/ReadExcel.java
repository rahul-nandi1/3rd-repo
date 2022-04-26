package excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 String exelFilePath = ".\\files\\Book1.xlsx";
	        
	        FileInputStream inputstream = new FileInputStream(exelFilePath);
	        
	        XSSFWorkbook workbook = new XSSFWorkbook(inputstream);
	        
	       // XSSFSheet sheet = wb.getSheet("sheet 1");
	        XSSFSheet sheet = workbook.getSheetAt(0);
	        
	       int rows = sheet.getLastRowNum(); //returns last row number which is equal to number of rows
	       int cols = sheet.getRow(1).getLastCellNum(); // getLastCellNum = number of cols of that perticular row
	       
	       for(int r=0;r<=rows;r++)
	       {
	    	  XSSFRow row = sheet.getRow(r);
	    	  
	    	  for(int c=0;c<=cols;c++)
	    	  {
	    		XSSFCell cell = row.getCell(c);
	    		
	    		switch(cell.getCellType())
	    		{
	    		case STRING: 
	    			System.out.print(cell.getStringCellValue());
	    			break;
	    			
	    		case NUMERIC: 
	    			System.out.print(cell.getNumericCellValue());
	    			break;
	    			
	    		case BOOLEAN: 
	    			System.out.print(cell.getBooleanCellValue());
	    			break;	
	    		}
	    		System.out.println("    ");
	    	  }
	    	  System.out.println();
	       }


	}

}
