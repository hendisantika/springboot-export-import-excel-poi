package com.hendisantika.springbootexportimportexcelpoi.controller;

import com.hendisantika.springbootexportimportexcelpoi.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/09/21
 * Time: 06.58
 */
@Controller
public class UserController {

    @Autowired
    private UserServices userServices;
}
