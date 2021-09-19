package com.hendisantika.springbootexportimportexcelpoi.repository;

import com.hendisantika.springbootexportimportexcelpoi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/09/21
 * Time: 06.51
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
