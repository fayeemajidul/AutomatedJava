import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class DataTestDrive {

    @Test
    @Parameters({"columnHeader", "rowName"})
    public static void dataDrive(String columnHeader, String rowName) throws IOException {
        //Reads Data in File, FileInputStream.
        File pathOfExcel = new File("/Users/fayeemmooktadeer/Desktop/DataDrivenTest.xlsx");
        FileInputStream file = new FileInputStream(pathOfExcel);

        //Object of XSSF Class:
        XSSFWorkbook excelSheet = new XSSFWorkbook(file);

        //Navigate to Sheet.
        int numOfSheets = excelSheet.getNumberOfSheets();
        for(int i = 0; i < numOfSheets; i++){
            if(excelSheet.getSheetName(i).equalsIgnoreCase("Roster")){
                XSSFSheet indexSheet = excelSheet.getSheetAt(i);

                Iterator <Row> rows = indexSheet.iterator();
                Row firstRow = rows.next();

                Iterator <Cell> indivCell = firstRow.cellIterator();
                int whileCounter = 0;
                int columnNum = 0;
                int rowCounter = 0;
                while(indivCell.hasNext()){
                    Cell presentCell = indivCell.next();
                    String cellData = presentCell.getStringCellValue();

                    if(cellData.equalsIgnoreCase(columnHeader)){
                        columnNum = whileCounter;
                        //System.out.println("Cell Data: "  + cellData);
                    }
                    whileCounter++;
                }

                while(rows.hasNext()){
                    Row presentRow = rows.next();
                    String rowContents = presentRow.getCell(columnNum).getStringCellValue();
                    System.out.println(rowContents);
                    if(rowContents.equalsIgnoreCase(rowName)){
                        //Grab all Cell Contents:
                        Iterator <Cell> cellContents = presentRow.cellIterator();
                        while(cellContents.hasNext()){
                            System.out.println(cellContents.next()); //Saving Cell Value into CellContents.
                        }

                    }
                }
            }
        } //Limits Scope to Sheet.
    }
}
