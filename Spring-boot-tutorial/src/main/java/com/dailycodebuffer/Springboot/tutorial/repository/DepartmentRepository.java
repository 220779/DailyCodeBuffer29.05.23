package com.dailycodebuffer.Springboot.tutorial.repository;


import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface DepartmentRepository extends JpaRepository<Department, Long>{



 Department findByDepartmentName(String departmentName);


 Department findByDepartmentNameIgnoreCase (String departmentName);



}
