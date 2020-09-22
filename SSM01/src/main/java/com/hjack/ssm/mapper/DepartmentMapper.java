package com.hjack.ssm.mapper;

import com.hjack.ssm.beans.Department;

import java.util.Collection;

public interface DepartmentMapper {
    public Collection<Department> getAllDepartments();

    public Department getDepartmentById(Integer id);
}
