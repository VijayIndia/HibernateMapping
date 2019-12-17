package com.database.hibernateannotation.upsert;
import com.database.hibernateannotation.model.key.EmployeeSalaryWithForeignKey;
import com.database.hibernateannotation.model.key.EmployeeSalaryWithTwoForeignKey;
import com.database.hibernateannotation.model.key.*;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class HibernateAnnotationInsertion {

    private HibernateTemplate hibernateTemplate;

    public void performAnnotationInsertionOperation(){
         insertThroughAnnotationWithSqlGeneratedPrimaryKey();
         insertThroughAnnotationWithHibernateGeneratedPrimaryKey();
         insertThroughAnnotationWithSqlServerGeneratedGuid();
        // insertThroughAnnotationWithHibernateGeneratedGuid();
        // insertThroughAnnotationWithCompositeKey();
        // insertThroughAnnotationWithForeignKey();
        // insertThroughAnnotationWithTwoForeignKey();
        // insertThroughAnnotationWithDateAndTime();
        // insertThroughAnnotationWithTransaction();
        // insertThroughAnnotationWithDate();
        // insertThroughAnnotationWithIsoDate();
        // insertThroughAnnotationWithDateTime();
    }

    private void insertThroughAnnotationWithSqlGeneratedPrimaryKey(){
        EmployeeWithSqlGeneratedPrimaryKey empWithSqlGeneratedPrimaryKey=new EmployeeWithSqlGeneratedPrimaryKey();
        empWithSqlGeneratedPrimaryKey.setEmployeeName("Vinay");
        empWithSqlGeneratedPrimaryKey.setDataAllowance(333);
        empWithSqlGeneratedPrimaryKey.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(empWithSqlGeneratedPrimaryKey);
    }
    private void insertThroughAnnotationWithHibernateGeneratedPrimaryKey(){
        EmployeeWithHibernateGeneratedPrimaryKey employeeWithHibernateGeneratedPrimaryKey=new EmployeeWithHibernateGeneratedPrimaryKey();
        employeeWithHibernateGeneratedPrimaryKey.setEmployeeId(Math.abs((int)(Math.random()*100)));
        employeeWithHibernateGeneratedPrimaryKey.setEmployeeName("Vijay");
        employeeWithHibernateGeneratedPrimaryKey.setDataAllowance(234);
        employeeWithHibernateGeneratedPrimaryKey.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(employeeWithHibernateGeneratedPrimaryKey);
    }
    private void insertThroughAnnotationWithSqlServerGeneratedGuid(){
       EmployeeWithSqlGeneratedGuid employeeWithSqlGeneratedGuid=new EmployeeWithSqlGeneratedGuid();
        employeeWithSqlGeneratedGuid.setEmployeeName("Vijay");
        employeeWithSqlGeneratedGuid.setDataAllowance(1000);
        employeeWithSqlGeneratedGuid.setIsActive(1);
        this.hibernateTemplate.saveOrUpdate(employeeWithSqlGeneratedGuid);
    }
    private void insertThroughAnnotationWithForeignKey(){
        System.out.println("Inserted through Annotation with Foreign Key Started");
        EmployeeSalaryWithForeignKey employeeSalaryWithForeignKey =new EmployeeSalaryWithForeignKey();
        employeeSalaryWithForeignKey.setEmpId(38);
        employeeSalaryWithForeignKey.setCurrSalary(1000);
        employeeSalaryWithForeignKey.setAvgSalary(1000);
        this.hibernateTemplate.save(employeeSalaryWithForeignKey);
        System.out.println("Inserted through Annotation with Foreign Key Ended");
    }
    private void insertThroughAnnotationWithTwoForeignKey(){

    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
