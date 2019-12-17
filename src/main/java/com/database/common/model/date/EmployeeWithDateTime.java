package com.database.common.model.date;
import java.util.Date;

public class EmployeeWithDateTime {

    private int employeeId;
    private String employeeName;
    private Date startDate;
    private String isoDateTime;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getIsoDateTime() {
        return isoDateTime;
    }

    public void setIsoDateTime(String isoDateTime) {
        this.isoDateTime = isoDateTime;
    }
}
