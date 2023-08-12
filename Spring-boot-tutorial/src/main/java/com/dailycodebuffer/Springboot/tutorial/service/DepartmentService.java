package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface DepartmentService {
    /*Department*/
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;


    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
