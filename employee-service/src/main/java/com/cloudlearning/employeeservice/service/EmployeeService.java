package com.cloudlearning.employeeservice.service;

import com.cloudlearning.employeeservice.dto.APIResponseDto;
import com.cloudlearning.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);
    APIResponseDto getEmployeeById(Long employeeId);
}
