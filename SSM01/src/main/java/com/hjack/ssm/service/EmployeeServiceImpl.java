package com.hjack.ssm.service;

import com.hjack.ssm.beans.Employee;
import com.hjack.ssm.mapper.DepartmentMapper;
import com.hjack.ssm.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：hjy
 * @date ：Created in 2020/8/22 1:05
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Employee> getAllEmps() {
        return employeeMapper.getAllEmps();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employee.setDept(departmentMapper.getDepartmentById( employee.getDept().getId()));
        employeeMapper.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employee.setDept(departmentMapper.getDepartmentById(employee.getDept().getId()));
        employeeMapper.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        employeeMapper.deleteEmployeeById(id);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return employeeMapper.getEmployeById(id);
    }


}
