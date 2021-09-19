package com.hendisantika.springbootexportimportexcelpoi.service;

import com.hendisantika.springbootexportimportexcelpoi.model.User;
import com.hendisantika.springbootexportimportexcelpoi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-export-import-excel-poi
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 20/09/21
 * Time: 06.53
 */
@Service
@Transactional
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    public List<User> listAll() {
        return userRepository.findAll(Sort.by("email").ascending());
    }
}
