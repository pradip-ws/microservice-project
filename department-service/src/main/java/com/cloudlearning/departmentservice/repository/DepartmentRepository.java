package com.cloudlearning.departmentservice.repository;

import com.cloudlearning.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentCode(String code);
}
