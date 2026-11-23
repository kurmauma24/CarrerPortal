package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    public static String getCellData(String sheetName, int rowNum, int colNum) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Excel\\testdata.xlsx");

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            // Get the sheet
            XSSFSheet sheet = workbook.getSheet(sheetName);

            DataFormatter formatter = new DataFormatter();

            String data = formatter.formatCellValue(
                    sheet.getRow(rowNum).getCell(colNum)
            ).trim();

            workbook.close();
            fis.close();

            return data;

        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}