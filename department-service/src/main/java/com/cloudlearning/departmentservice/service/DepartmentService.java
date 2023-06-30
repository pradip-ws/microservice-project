package com.cloudlearning.departmentservice.service;

import com.cloudlearning.departmentservice.dto.DepartmentDTO;

public interface DepartmentService {
     DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);

     DepartmentDTO getDepartmentByCode(String code);


}
