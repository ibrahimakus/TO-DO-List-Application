package com.huawei.servertodo.service;

import com.huawei.servertodo.model.User;
import java.util.List;

public interface IUserService {

    User saveUser(User user);

    User findById(Long id);

    User findByUsername(String username);

    List<User> findAllUsers();
}
