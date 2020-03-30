package com.hendisantika.springbootexportimportexcelpoi.utils;

import com.hendisantika.springbootexportimportexcelpoi.model.Student;
import com.hendisantika.springbootexportimportexcelpoi.repository.StudentRepository;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/03/20
 * Time: 08.15
 */
@Component
public class ExcelGenerator {
    @Autowired
    private StudentRepository studentRepository;

    /* export */
    public ByteArrayInputStream exportExcel(List<Student> students) throws Exception {
        String[] columns = {"Id", "Name", "Kelas", "Jurusan"};
        try (
                Workbook workbook = new XSSFWorkbook();
                ByteArrayOutputStream out = new ByteArrayOutputStream()
        ) {
            CreationHelper creationHelper = workbook.getCreationHelper();
            Sheet sheet = workbook.createSheet("Data Students");
            Font headerFont = workbook.createFont();
            headerFont.setBold(true);
            headerFont.setColor(IndexedColors.BLUE.getIndex());
            CellStyle headerCellStyle = workbook.createCellStyle();
            headerCellStyle.setFont(headerFont);

            //Row ofor Header
            Row headerRow = sheet.createRow(0);

            //Header
            for (int i = 0; i < columns.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(columns[i]);
                cell.setCellStyle(headerCellStyle);
            }


            int rowIdx = 1;
            for (Student student : students) {
                Row row = sheet.createRow(rowIdx);

                row.createCell(0).setCellValue(student.getId());
                row.createCell(1).setCellValue(student.getName());
                row.createCell(2).setCellValue(student.getKelas());
                row.createCell(3).setCellValue(student.getJurusan());
                rowIdx++;
            }

            workbook.write(out);
            workbook.close();
            return new ByteArrayInputStream(out.toByteArray());
        } catch (Exception e) {

        }
        return null;
    }

}
