package com.database.hibernate.upsert;
import com.database.common.model.date.EmployeeWithDateTime;
import com.database.common.model.key.*;
import com.database.common.connection.DatabaseConnection;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;

import javax.xml.crypto.Data;
import java.util.UUID;
import java.util.Date;

public class HibernateInsertion {

    private HibernateTemplate hibernateTemplate;

    public void performInsertionOperation(){
        // insertWithSqlGeneratedPrimaryKey();
        // insertWithHibernateGeneratedPrimaryKey();
        // insertWithSqlServerGeneratedGuid();
        // insertWithHibernateGeneratedGuid();
        // insertWithCompositeKey();
        //   insertWithForeignKey();
        //   insertWithTwoForeignKey();
        //   insertWithDateAndTime();
        //   insertWithTransaction();
        // insertWithDate();
        // insertWithIsoDate();
        // insertWithDateTime();
    }
    private void insertWithSqlGeneratedPrimaryKey(){
        EmployeeWithSqlGeneratedPrimaryKey employeeWithSqlGeneratedPrimaryKey =new EmployeeWithSqlGeneratedPrimaryKey();
        employeeWithSqlGeneratedPrimaryKey.setEmployeeName("Vijay");
        employeeWithSqlGeneratedPrimaryKey.setDataAllowance(100);
        employeeWithSqlGeneratedPrimaryKey.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(employeeWithSqlGeneratedPrimaryKey);
    }
    private void insertWithHibernateGeneratedPrimaryKey(){
        EmployeeWithHibernateGeneratedPrimaryKey employeeWithHibernateGeneratedPrimaryKey =new EmployeeWithHibernateGeneratedPrimaryKey();
        employeeWithHibernateGeneratedPrimaryKey.setEmployeeName("Vijay");
        employeeWithHibernateGeneratedPrimaryKey.setDataAllowance(100);
        employeeWithHibernateGeneratedPrimaryKey.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(employeeWithHibernateGeneratedPrimaryKey);
    }
    private void insertWithSqlServerGeneratedGuid(){
        EmployeeWithSqlGeneratedGuid employeeWithSqlGeneratedGuid =new EmployeeWithSqlGeneratedGuid();
        employeeWithSqlGeneratedGuid.setEmployeeName("Vijay");
        employeeWithSqlGeneratedGuid.setDataAllowance(100);
        employeeWithSqlGeneratedGuid.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(employeeWithSqlGeneratedGuid);
    }
    private void insertWithHibernateGeneratedGuid(){
        EmployeeWithHibernateGeneratedGuid employeeWithHibernateGeneratedGuide =new EmployeeWithHibernateGeneratedGuid();
        employeeWithHibernateGeneratedGuide.setEmployeeGuid(UUID.randomUUID().toString());
        employeeWithHibernateGeneratedGuide.setEmployeeName("Vijay");
        employeeWithHibernateGeneratedGuide.setDataAllowance(100);
        employeeWithHibernateGeneratedGuide.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(employeeWithHibernateGeneratedGuide);
    }
    private void insertWithCompositeKey(){
        EmployeeWithCompositeKey employeeWithCompositeKey =new EmployeeWithCompositeKey();
        employeeWithCompositeKey.setEmployeeName("Vijay");
        employeeWithCompositeKey.setDataAllowance(100);
        employeeWithCompositeKey.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(employeeWithCompositeKey);
    }
    private void insertWithDateAndTime(){
        EmployeeWithDateTime dateTime = new EmployeeWithDateTime();
        dateTime.setEmployeeName("Vijay");
        dateTime.setStartDate(new Date());
        dateTime.setIsoDateTime("2015-07-06T12:08:27");
        this.hibernateTemplate.saveOrUpdate(dateTime);
    }
    private void insertWithForeignKey(Session session){
        EmployeeSalaryWithForeignKey employeeSalaryWithForeignKey =new EmployeeSalaryWithForeignKey();
        employeeSalaryWithForeignKey.setEmpId(38);
        employeeSalaryWithForeignKey.setCurrSalary(1000);
        employeeSalaryWithForeignKey.setAvgSalary(1000);
        session.saveOrUpdate(employeeSalaryWithForeignKey);
        //this.hibernateTemplate.saveOrUpdate(employeeSalaryWithForeignKey);
    }
    private void insertWithTwoForeignKey(Session session){
        EmployeeSalaryWithTwoForeignKey employeeSalaryWithTwoForeignKey =new EmployeeSalaryWithTwoForeignKey();
        employeeSalaryWithTwoForeignKey.setEmpId(38);
        employeeSalaryWithTwoForeignKey.setCurrSalary(1000);
        employeeSalaryWithTwoForeignKey.setAvgSalary(1000);
        session.saveOrUpdate(employeeSalaryWithTwoForeignKey);
        //this.hibernateTemplate.saveOrUpdate(employeeSalaryWithTwoForeignKey);
    }
    private void insertWithTransaction(){
        Transaction tx=null;
        Session session;
        try {
            session= DatabaseConnection.getSession();
            tx = session.beginTransaction();
            tx.begin();
            insertWithForeignKey(session);
            insertWithTwoForeignKey(session);
            tx.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            tx.rollback();
        }
    }
    private void insertWithDate(){

    }
    private void insertWithIsoDate(){

    }
    private void insertWithDateTime(){

    }
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

