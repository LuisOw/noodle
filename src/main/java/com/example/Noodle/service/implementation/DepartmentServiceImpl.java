package com.example.Noodle.service.implementation;

import com.example.Noodle.dto.DepartmentDto;
import com.example.Noodle.model.Department;
import com.example.Noodle.repository.DepartmentRepository;
import com.example.Noodle.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public List<Department> getDepartments() {
        return repository.findAll();
    }

    @Override
    public Department postDepartment(DepartmentDto departmentDto) {
        return null;
    }
}
