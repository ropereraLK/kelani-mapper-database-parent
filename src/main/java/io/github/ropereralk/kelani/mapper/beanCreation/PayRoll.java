package io.github.ropereralk.kelani.mapper.beanCreation;

public class PayRoll {

    private Employee employee;

    public PayRoll(Employee employee){
        this.employee = employee;
    }

    public String getEmployeeName(){
        return this.employee.getName();
    }
}
