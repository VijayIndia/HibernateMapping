package com.database.hibernateannotation.model.key;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="EmployeeWithSqlGeneratedPrimaryKey")
public class EmployeeWithSqlGeneratedPrimaryKey implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    private int employeeId;
    @Column(name="employee_name")
    private String employeeName;
    @Column(name="is_active")
    private int isActive;
    @Column(name="data_allowance")
    private long dataAllowance;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public long getDataAllowance() {
        return dataAllowance;
    }

    public void setDataAllowance(long dataAllowance) {
        this.dataAllowance = dataAllowance;
    }
}
