package com.whayes.services.whDepartmentservice.controller;

import com.whayes.services.whDepartmentservice.entity.Department;
import com.whayes.services.whDepartmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
       // log.info("Inside saveDepartment method of Department Contoler");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{ID}")
    public Department findDepartmentByID(@PathVariable("ID") Long departmentID){
        return departmentService.findDepartmentByID(departmentID);
    }

}
