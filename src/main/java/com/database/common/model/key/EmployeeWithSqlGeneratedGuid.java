package com.database.common.model.key;

import java.util.UUID;

public class EmployeeWithSqlGeneratedGuid {

    private String employeeGuid;
    private String employeeName;
    private int isActive;
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
