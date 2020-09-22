package com.hjack.ssm.mapper;


import com.hjack.ssm.beans.Employee;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {

    public List<Employee> getAllEmps();

    //根据Id查询Employee
    public Employee getEmployeById(Integer id);
    //添加一个新的Employee
    public void addEmployee(Employee employee);

    //修改一个Employee
    public void updateEmployee(Employee employee);
    //删除一个Employee
    public void deleteEmployeeById(Integer id);

    //查询多行数据，返回一个对象的集合
    public List<Employee> getEmps();

    //查询单条，返回Map类型
    public Map<String , Object> getEmployeeByIdReturnMap(Integer id);

    @MapKey("id")
    public Map<Integer,Employee> getEmpsReturnMap();


}
