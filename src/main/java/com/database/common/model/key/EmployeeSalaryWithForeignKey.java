package com.database.common.model.key;

public class EmployeeSalaryWithForeignKey {

    private int salaryId;
    private long avgSalary;
    private int currSalary;
    private int empId;

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public long getAvgSalary() {
        return avgSalary;
    }

    public void setAvgSalary(long avgSalary) {
        this.avgSalary = avgSalary;
    }

    public int getCurrSalary() {
        return currSalary;
    }

    public void setCurrSalary(int currSalary) {
        this.currSalary = currSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
