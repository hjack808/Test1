package com.hjack.ssm.service;

import com.hjack.ssm.beans.Department;

import java.util.Collection;


public interface DepartmentService {
    public Collection<Department> getAllDepartments();

    public Department getDepartmentById(Integer id);
}
