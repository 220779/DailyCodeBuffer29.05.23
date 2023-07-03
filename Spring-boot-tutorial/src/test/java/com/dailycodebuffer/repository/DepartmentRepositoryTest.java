package com.dailycodebuffer.repository;

import com.dailycodebuffer.entity.Department;
import jakarta.persistence.EntityManager;
import lombok.Data;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {

        Department department = new Department().builder()
                .departmentName("Java chef")
                .departmentCode("JC -011")
                .departmentAddress("Tartu")
                .build();

        entityManager.persist(department);
    }

    @Test
    public void whenFindId_thenReturnDepartment (){
        Department department = departmentRepository.findById(1L).get();

        assertEquals(department.getDepartmentName(), "Java chef");
        }
    }
