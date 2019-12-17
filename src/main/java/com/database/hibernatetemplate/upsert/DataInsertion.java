package com.database.hibernatetemplate.upsert;
import org.hibernate.SessionFactory;
public class DataInsertion {

    private HibernateTemplate hibernateTemplate;
    private SessionFactory sessionFactory;

    public void insertWithHiberateTemplate(){
        //hibernateTemplate.insertWithGuid();
        //hibernateTemplate.insertWithAutoIncrement();
    }
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
