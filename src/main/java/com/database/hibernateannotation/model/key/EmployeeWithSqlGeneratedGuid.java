package com.database.hibernateannotation.model.key;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EmployeeWithSqlGeneratedGuid")
public class EmployeeWithSqlGeneratedGuid implements Serializable {

    @Id
    @GeneratedValue(generator="uuid")
    @Column(name="employee_guid")
    private String employeeGuid;
    @Column(name="employee_name")
    private String employeeName;
    @Column(name="is_active")
    private int isActive;
    @Column(name="data_allowance")
    private long dataAllowance;

    public String getEmployeeGuid() {
        return employeeGuid;
    }

    public void setEmployeeGuid(String employeeGuid) {
        this.employeeGuid = employeeGuid;
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
