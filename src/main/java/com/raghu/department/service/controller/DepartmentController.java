package com.raghu.department.service.controller;

import com.raghu.department.service.entity.Department;
import com.raghu.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of DepartmentController..");
       return departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department getDepartmentById(@PathVariable Long  departmentId){
        log.info("Inside getDepartmentById method of DepartmentController..");
        return departmentService.getDepartmentById(departmentId);
    }

}
