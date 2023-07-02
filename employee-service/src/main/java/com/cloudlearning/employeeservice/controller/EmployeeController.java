package com.cloudlearning.employeeservice.controller;

import com.cloudlearning.employeeservice.dto.APIResponseDto;
import com.cloudlearning.employeeservice.dto.EmployeeDto;
import com.cloudlearning.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    @GetMapping("{employeeId}")
    public ResponseEntity<APIResponseDto> getEmployee(@PathVariable("employeeId") Long empid){
        APIResponseDto apiResponseDto = employeeService.getEmployeeById(empid);
        return new ResponseEntity<>(apiResponseDto, HttpStatus.OK);
    }
}
