package com.whayes.services.whDepartmentservice.service;


import com.whayes.services.whDepartmentservice.entity.Department;
import com.whayes.services.whDepartmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department findDepartmentByID(Long departmentID) {
        return departmentRepository.findByDepartmentID(departmentID);
    }
}
