package org.example.genericLL;

import java.lang.reflect.Field;

public class Engineer extends Employee{
    String field;
    public Engineer(String name, int salary, String field) {
        super(name, salary);
        this.field = field;
    }

    @Override
    public void getDetails() {
        System.out.println("Employee ID : " + id + "Inhand Salary : " + getInhandSalary() + "Field :" + field);
    }

}
