package com.database;

import com.database.common.connection.DatabaseConnection;
import com.database.hibernate.HibernateService;
import com.database.hibernateannotation.HibernateAnnotationService;
import com.database.hibernatetemplate.HibernateTemplateService;
import com.database.storedprocedure.StoredProcedureService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DbService {

    private DatabaseConnection hibenateConnection;
    private HibernateService hibernateService;
    private HibernateAnnotationService hibernateAnnotationService;
    private HibernateTemplateService hibernateTemplateService;
    private StoredProcedureService storedProcedureService;

    private void performConnection(){
        hibenateConnection.testDataSourceConnection();
        hibenateConnection.testHibernateConnection();
    }

    private void performCRUDOperations(){
        hibernateService.performCRUDOperations();
        hibernateAnnotationService.performCRUDOperations();
    //    hibernateTemplateService.performCRUDOperations();
    //    storedProcedureService.performCRUDOperations();
    }

    public static  void main(String[] args){
        System.out.println("Hibernate Application Started");
        ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");
        DbService dbService=(DbService) context.getBean("dbService");
        //dbService.performConnection();
        dbService.performCRUDOperations();
        System.out.println("Hibernate Application Ended");
    }

    public void setHibernateService(HibernateService hibernateService) {
        this.hibernateService = hibernateService;
    }

    public void setHibernateTemplateService(HibernateTemplateService hibernateTemplateService) {
        this.hibernateTemplateService = hibernateTemplateService;
    }

    public void setHibernateAnnotationService(HibernateAnnotationService hibernateAnnotationService) {
        this.hibernateAnnotationService = hibernateAnnotationService;
    }

    public void setStoredProcedureService(StoredProcedureService storedProcedureService) {
        this.storedProcedureService = storedProcedureService;
    }

    public void setHibenateConnection(DatabaseConnection hibenateConnection) {
        this.hibenateConnection = hibenateConnection;
    }
}
