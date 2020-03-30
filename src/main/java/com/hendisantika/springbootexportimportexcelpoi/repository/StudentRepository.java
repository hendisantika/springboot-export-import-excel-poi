package com.hendisantika.springbootexportimportexcelpoi.repository;

import com.hendisantika.springbootexportimportexcelpoi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 30/03/20
 * Time: 08.14
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
