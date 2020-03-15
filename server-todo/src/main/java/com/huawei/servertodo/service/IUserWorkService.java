package com.huawei.servertodo.service;

import com.huawei.servertodo.model.UserWork;

public interface IUserWorkService {
    UserWork saveUserWork(UserWork userWork);

    UserWork findById(Long id);

    void Update(UserWork userWork);
}
