package com.hjack.ssm.service;

import com.hjack.ssm.beans.Employee;

import java.util.List;

/**
 * @author ：hjy
 * @date ：Created in 2020/8/22 1:04
 * @description：
 * @modified By：
 * @version:
 */
public interface EmployeeService {
    public List<Employee> getAllEmps();

    public void saveEmployee(Employee employee);

    public void updateEmployee(Employee employee);

    public void deleteEmployee(Integer id);

    public Employee getEmployeeById(Integer id);

}
