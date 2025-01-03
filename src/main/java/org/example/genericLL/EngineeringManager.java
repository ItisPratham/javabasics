package org.example.genericLL;

public class EngineeringManager extends Engineer{
    public EngineeringManager(String name, int salary, String field) {
        super(name, salary, field);
    }

    public double bonus(){
        return salary*0.1;
    }

    @Override
    public double getInhandSalary() {
        return super.getInhandSalary() + bonus();
    }

    @Override
    public void getDetails() {
        System.out.println("Employee ID : " + id + "Inhand Salary : " + getInhandSalary());
    }

    @Override
    public String toString() {
        return "Engineering Manager ID: " + eid + ", Name: " + name + ", Field: " + field + ", In-hand Salary: " + getInhandSalary() + ", Bonus: " + bonus();
    }
}
