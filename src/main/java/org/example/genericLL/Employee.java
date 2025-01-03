package org.example.genericLL;

public class Employee {
    String name;
    int eid;
    int salary;
    static int id = 1;

    public Employee(String name, int salary){
        this.eid = id;
        this.name = name;
        this.salary = salary;
        id++;
    }

    public void getName(){
        System.out.println("Employee name : " + name);
    }
    public double getInhandSalary(){
        return salary*0.9;
    }
    public void getDetails(){
        System.out.println("Employee ID : " + eid + "Inhand Salary : " + getInhandSalary());
    }


}
