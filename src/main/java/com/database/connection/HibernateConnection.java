package com.database.connection;
import com.database.bean.FirstTable;
import com.database.insertion.DataInsertion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.hibernate.*;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

public class HibernateConnection {

    private static BasicDataSource dataSource;
    private static SessionFactory sessionFactory;
    private static DataInsertion dataInsertion;

    private void testDataSourceConnection(){
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

    private void testHibernateConnection(){
        System.out.println("Trying to establish Hibernate Connection");
        HibernateTemplate hibernateTemplate = new HibernateTemplate(this.sessionFactory);
        FirstTable firstTable=new FirstTable();
        firstTable.setFirstName("Vijay");
        firstTable.setLastName("Manohar");
        firstTable.setSalary(1000);
        hibernateTemplate.save(firstTable);
        System.out.println("Hibernate Connection has been established succesfully");
    }

    public static void main(String args[]) {
        HibernateConnection conn=new HibernateConnection();
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        conn.testDataSourceConnection();
        conn.testHibernateConnection();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;

    }

    public void setDataInsertion(DataInsertion dataInsertion) {
        this.dataInsertion = dataInsertion;
    }

}
