package com.hendisantika.springbootexportimportexcelpoi.utils;

import com.hendisantika.springbootexportimportexcelpoi.model.User;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/09/21
 * Time: 06.54
 */
public class UserExcelExporter {
    private final XSSFWorkbook workbook;
    private final List<User> listUsers;
    private XSSFSheet sheet;

    public UserExcelExporter(List<User> listUsers) {
        this.listUsers = listUsers;
        workbook = new XSSFWorkbook();
    }

}
