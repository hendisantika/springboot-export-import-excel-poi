package com.hendisantika.springbootexportimportexcelpoi.controller;

import com.hendisantika.springbootexportimportexcelpoi.model.Student;
import com.hendisantika.springbootexportimportexcelpoi.repository.StudentRepository;
import com.hendisantika.springbootexportimportexcelpoi.utils.ExcelGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.ByteArrayInputStream;
import java.util.List;

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

    @GetMapping("/export")
    public ResponseEntity<InputStreamResource> excelStudentReport() throws Exception {
        List<Student> studentList = studentRepository.findAll();

        ByteArrayInputStream in = excel.exportExcel(studentList);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=students.xlsx");

        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));

    }

}
