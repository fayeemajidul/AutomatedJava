import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelRawData {
    @Test
    public void instantiateExcelFile() throws IOException {
        File excelFilePath = new File("/Users/fayeemmooktadeer/Desktop/DataDrivenTest.xlsx");
        FileInputStream file = new FileInputStream(excelFilePath);
        XSSFWorkbook excelWorkBook = new XSSFWorkbook(file);

        int numOfSheets = excelWorkBook.getNumberOfSheets();
        for(int i = 0; i < numOfSheets; i++){
            if(excelWorkBook.getSheetName(i).equalsIgnoreCase("Roster")){
                XSSFSheet rosterSheet = excelWorkBook.getSheetAt(i);

                Iterator<Row> rowsInExcelSheet = rosterSheet.iterator();
                Row firstRow = rowsInExcelSheet.next();

                Iterator <Cell> cellsInSheet = firstRow.cellIterator();

                int whileCounter = 0;
                int columnNumber = 0;

                while(cellsInSheet.hasNext()){
                    Cell presentCell = cellsInSheet.next();
                    String valueInCell = presentCell.getStringCellValue();

                    if(valueInCell.equalsIgnoreCase("Preferred")){
                        columnNumber = whileCounter;
                        System.out.println(columnNumber);
                    }
                    whileCounter++;
                }

                while(rowsInExcelSheet.hasNext()){
                    Row presentRow = rowsInExcelSheet.next();
                    String valueInPresentRow = presentRow.getCell(columnNumber).getStringCellValue();
                    if(valueInPresentRow.equalsIgnoreCase("Wilfred")){
                        //Grab all Cell Contents:
                        Iterator <Cell> cellContents = presentRow.cellIterator();

                        while(cellContents.hasNext()){
                            Cell presentCell = cellContents.next();
                            String formattedElement = valueOfContents = cellContents.next().getStringCellValue();
                            System.out.println(valueOfContents);
                        }
                    }
                }
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

            }
        }
    }
}
