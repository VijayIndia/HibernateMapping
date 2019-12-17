package com.database.hibernateannotation.model.key;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="EmployeeSalaryWithForeignKey")
public class EmployeeSalaryWithForeignKey implements Serializable {
    @Id
    @Column(name="salary_id")
    private int salaryId;
    @Column(name="avg_salary")
    private long avgSalary;
    @Column(name="curr_salary")
    private int currSalary;
    @Column(name="emp_id")
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
