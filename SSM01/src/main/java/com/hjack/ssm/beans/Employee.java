package com.hjack.ssm.beans;

import lombok.Data;

/**
 * @author ：hjy
 * @date ：Created in 2020/8/19 9:54
 * @description：
 * @modified By：
 * @version:
 */
@Data
public class Employee {
    private Integer id ;
    private String lastName;
    private String email ;
    private String gender ;
    private Department dept;

    public Employee(){
        super();
    }

    public Employee(Integer id, String lastName, String email, String gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

    public Employee(Integer id, String lastName, String email, String gender, Department dept) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dept = dept;
    }
}
