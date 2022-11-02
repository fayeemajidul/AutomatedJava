import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class DataDrivenExample {
    @Test
    @Parameters({"columnHeader" , "firstName"})
    public ArrayList<String> grabData(String columnHeader, String firstName) throws IOException {
        File excelFile = new File("/Users/fayeemmooktadeer/Desktop/DataDrivenTest.xlsx");
        FileInputStream file = new FileInputStream(excelFile);
        XSSFWorkbook excelWorkBook = new XSSFWorkbook(file);
        DataFormatter formatter = new DataFormatter();
        ArrayList<String> rowVALUES = new ArrayList<>();

        //Now that we have initialed our WorkBook, we need to grab the sheets present.

        int numberOfSheets = excelWorkBook.getNumberOfSheets();
        for(int i = 0; i < numberOfSheets; i++){
            if(excelWorkBook.getSheetName(i).equalsIgnoreCase("Roster")){
                //We have gone into our Sheet.
                XSSFSheet excelSheet = excelWorkBook.getSheetAt(i);

                //Now we must go through our rows.
                Iterator <Row> rowsInExcelSheet = excelSheet.iterator();
                Row firstRow = rowsInExcelSheet.next(); //Grabbed First Row.

                Iterator <Cell> cellInExcelRow = firstRow.iterator(); //Each Individual Element;

                int columnNumber = 0;
                int rowCounter = 0;

                while(cellInExcelRow.hasNext()){
                    Cell presentCell = cellInExcelRow.next();
                    String cellContents = presentCell.getStringCellValue();
                    if(cellContents.equalsIgnoreCase(columnHeader)){
                        columnNumber = rowCounter;
                    }
                    rowCounter++;
                }

                //Now That We have our Column Number, we need to access each individual cell element.

                while(rowsInExcelSheet.hasNext()){
                    Row presentRow = rowsInExcelSheet.next();
                    String valueInPresentRow = presentRow.getCell(columnNumber).getStringCellValue();
                    if(valueInPresentRow.equalsIgnoreCase(firstName)){
                        //Grab all Cell Contents:
                        Iterator <Cell> cellContents = presentRow.cellIterator();
                        while(cellContents.hasNext()){
                            Cell presentCell = cellContents.next();
                                String formattedElement = formatter.formatCellValue(presentCell);
                                rowVALUES.add(formattedElement); //Saving Cell Value into CellContents.
                        }
                    }
                }
            }
        }
        System.out.println(rowVALUES);
        return rowVALUES;
    }
}
