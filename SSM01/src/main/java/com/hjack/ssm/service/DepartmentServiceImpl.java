package com.hjack.ssm.service;

import com.hjack.ssm.beans.Department;
import com.hjack.ssm.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author ：hjy
 * @date ：Created in 2020/8/24 10:47
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class DepartmentServiceImpl implements DepartmentService
{
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public Collection<Department> getAllDepartments() {
        System.out.println("deptments:"+Arrays.asList(departmentMapper.getAllDepartments()));
        return departmentMapper.getAllDepartments();
    }

    @Override
    public Department getDepartmentById(Integer id) {
       return departmentMapper.getDepartmentById(id);

    }
}
