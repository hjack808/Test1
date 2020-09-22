package com.hjack.ssm.handler;

import com.hjack.ssm.beans.Department;
import com.hjack.ssm.beans.Employee;
import com.hjack.ssm.service.DepartmentService;
import com.hjack.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：hjy
 * @date ：Created in 2020/8/22 1:03
 * @description：
 * @modified By：
 * @version:
 */
@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    /**
     * 显示所有的员工信息
     */
    @RequestMapping(value="/emps" ,method= RequestMethod.GET)
    public String listAllEmps(Map<String ,Object> map){
        List<Employee> employees = employeeService.getAllEmps();
        map.put("emps",employees);

        return "list";
    }
    /*
    * 前往添加页面
    * */
    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public String toAddPage(Map<String, Object> map){

        Collection<Department> departments = departmentService.getAllDepartments();

        map.put("depts",departments);

        Map<String,String> genders = new HashMap<>();
        genders.put("0","女");
        genders.put("1","男");
        map.put("genders",genders);

        map.put("employee",new Employee());

        return "input";
    }
    /*
    * 新增一个员工
    * */
    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public String AddEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/emps";
    }
    /*
    * 删除一个员工
    * */
    @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
    public String DeleteEmployee(@PathVariable("id") Integer id){
       employeeService.deleteEmployee(id);
        return "redirect:/emps";
    }

    /*
    *前往修改页面
    * */
    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public String toUpdatePage(@PathVariable("id")Integer id,Map<String,Object> map){

        Employee employee = employeeService.getEmployeeById(id);

        map.put("employee",employee);

        System.out.println("toUpdatePage employee:"+employee);
        Collection<Department> departments = departmentService.getAllDepartments();

        map.put("depts",departments);

        map.put("genders",myGenders());

        return "input";
    }
    /*
    * 修改功能
    * */
    @RequestMapping(value = "/emp",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){

        employeeService.updateEmployee(employee);
        return "redirect:/emps";

    }

    private Map<String,String> myGenders(){
        Map<String,String> genders = new HashMap<>();
        genders.put("0","女");
        genders.put("1","男");
        return genders;
    }
}
