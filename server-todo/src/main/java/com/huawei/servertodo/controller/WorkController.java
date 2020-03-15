package com.huawei.servertodo.controller;

import com.huawei.servertodo.model.Work;
import com.huawei.servertodo.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WorkController {
    @Autowired
    private WorkService workService;

    @PostMapping("/api/work/add")
    public ResponseEntity<?> workAdd(@RequestBody Work dto)
    {
        if(workService.findByName(dto.getName()) != null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(workService.saveWork(dto), HttpStatus.CREATED);
    }

    @DeleteMapping("/api/work/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable long id) {
        try {
                workService.DeleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }
    @GetMapping("/work/all")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(workService.findAllWork());
    }
}
