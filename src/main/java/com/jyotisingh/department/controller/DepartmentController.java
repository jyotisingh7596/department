package com.jyotisingh.department.controller;

import com.jyotisingh.department.entity.Department;
import com.jyotisingh.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("POST /departments/ , RequestBody Payload: {}", department);
        log.info("Insider save department method of Department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findByDepartmentId(@PathVariable("id") Long departmentId) {
        log.info("GET /department/id, PathVariable id: {}", departmentId);
        log.info("Inside findByDepartmentId method of DepartmentController");
        return departmentService.findByDepartmentId(departmentId);
    }
}
