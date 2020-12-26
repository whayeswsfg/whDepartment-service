package com.whayes.services.whDepartmentservice.repository;

import com.whayes.services.whDepartmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentID(Long departmentID);
}
