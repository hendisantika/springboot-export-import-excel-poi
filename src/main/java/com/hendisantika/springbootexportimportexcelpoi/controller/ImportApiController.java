package com.hendisantika.springbootexportimportexcelpoi.controller;

import com.hendisantika.springbootexportimportexcelpoi.repository.StudentRepository;
import com.hendisantika.springbootexportimportexcelpoi.utils.ExcelGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/03/20
 * Time: 08.20
 */
@RestController
public class ImportApiController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ExcelGenerator excel;

}
