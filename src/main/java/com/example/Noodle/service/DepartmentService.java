package com.example.Noodle.service;

import com.example.Noodle.dto.DepartmentDto;
import com.example.Noodle.model.Department;

import java.util.List;

public interface DepartmentService {
    public List<Department> getDepartments();
    public Department postDepartment(DepartmentDto departmentDto);
}
