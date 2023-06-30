package com.cloudlearning.departmentservice.controller;

import com.cloudlearning.departmentservice.dto.DepartmentDTO;
import com.cloudlearning.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public ResponseEntity<DepartmentDTO> saveDepartment(@RequestBody DepartmentDTO departmentDTO){
       DepartmentDTO savedDepartmentDTO = departmentService.saveDepartment(departmentDTO);
       return new ResponseEntity<>(savedDepartmentDTO, HttpStatus.CREATED);
    }

    @GetMapping("{code}")
    public ResponseEntity<DepartmentDTO> getDepartmentByCode(@PathVariable String code){
        DepartmentDTO departmentDTO = departmentService.getDepartmentByCode(code);
        return  new ResponseEntity<>(departmentDTO,HttpStatus.OK);
    }
}
