package com.hendisantika.springbootexportimportexcelpoi.controller;

import com.hendisantika.springbootexportimportexcelpoi.utils.ExcelGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/03/20
 * Time: 08.18
 */
@Controller
public class ImportController {
    @Autowired
    private ExcelGenerator excel;

    @GetMapping("/import")
    public String createGetImport() {

        return "import";
    }
}
