package com.database.connection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.dbcp2.BasicDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HibernateConnection {

    private static BasicDataSource dataSource;

    private void testDataSourceConnection(){
        System.out.println("Trying to establish JDBC DataSource Connection");
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        BasicDataSource dataSource=(BasicDataSource)context.getBean("dataSource");
        try {
            Connection connection=dataSource.getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement("select * from [dbo].[FirstTable];");
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                int pid=resultSet.getInt(1);
                int var1=resultSet.getInt(2);
                String var2=resultSet.getString(3);
                System.out.println("pid="+pid+"var1="+var1+"var2="+var2);
            }
            System.out.println("JDBC DataSource Connection has been established succesfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        HibernateConnection conn=new HibernateConnection();
        conn.testDataSourceConnection();
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
