package com.database.common.connection;
import com.database.common.model.Employee;
import com.database.hibernateannotation.model.key.EmployeeSalaryWithForeignKey;
import com.database.hibernatetemplate.upsert.DataInsertion;
import org.hibernate.classic.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.hibernate.*;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class DatabaseConnection {

    private static BasicDataSource dataSource;
    private static SessionFactory sessionFactory;
    private static SessionFactory annotatedSessionFactory;
    private static DataInsertion dataInsertion;

    public void testDataSourceConnection(){
        System.out.println("Trying to establish JDBC DataSource Connection");
        try {
            Connection connection=this.dataSource.getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("select * from [dbo].[FirstTable];");
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                String pid=resultSet.getString(1);
                String var1=resultSet.getString(2);
                String var2=resultSet.getString(3);
                System.out.println("pid="+pid+"var1="+var1+"var2="+var2);
            }
            System.out.println("JDBC DataSource Connection has been established succesfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void testHibernateConnection(){
        System.out.println("Trying to establish Hibernate Connection");
        HibernateTemplate hibernateTemplate = new HibernateTemplate(this.annotatedSessionFactory);
        EmployeeSalaryWithForeignKey employee=new EmployeeSalaryWithForeignKey();
        employee.setEmpId(1);
        employee.setSalaryId(100);
        employee.setAvgSalary(1000);
        employee.setCurrSalary(2000);
        employee.setSalaryId(25);
        //employee.setLastName("Manohar");
        //employee.setSalary(1000);
        hibernateTemplate.save(employee);
        System.out.println("Hibernate Connection has been established succesfully");
    }

    public static Session getSession(){
       return sessionFactory.openSession();
    }
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setAnnotatedSessionFactory(SessionFactory annotatedSessionFactory) {
        this.annotatedSessionFactory = annotatedSessionFactory;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;

    }

    public void setDataInsertion(DataInsertion dataInsertion) {
        this.dataInsertion = dataInsertion;
    }

}
