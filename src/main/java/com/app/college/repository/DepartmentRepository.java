package com.app.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.college.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
