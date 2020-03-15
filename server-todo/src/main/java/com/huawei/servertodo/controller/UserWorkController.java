package com.huawei.servertodo.controller;

import com.huawei.servertodo.model.UserWork;
import com.huawei.servertodo.model.Work;
import com.huawei.servertodo.service.UserWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserWorkController {
    @Autowired
    private UserWorkService userWorkService;

    @PostMapping("/api/work/add")
    public ResponseEntity<?> workAdd(@RequestBody UserWork dto)
    {
        return new ResponseEntity<>(userWorkService.saveUserWork(dto), HttpStatus.CREATED);
    }

}
