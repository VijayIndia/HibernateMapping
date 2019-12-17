package com.database.common.model.key;

import java.io.Serializable;

public class EmployeeWithCompositeKey implements Serializable {
    private int employeeId;
    private String employeeName;
    private int isActive;
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
