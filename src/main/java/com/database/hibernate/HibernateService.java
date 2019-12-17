package com.database.hibernate;

import com.database.hibernate.delete.HibernateDeletion;
import com.database.hibernate.retrieval.HibernateRetrieval;
import com.database.hibernate.upsert.HibernateInsertion;

public class HibernateService {

    private HibernateInsertion hibernateInsertion;
    private HibernateRetrieval hibernateRetrieval;
    private HibernateDeletion hibernateDeletion;

    public void performCRUDOperations(){
        System.out.println("Hibernate related CRUD Operation Started");
        performInsertionOperations();
        performRetrievalOperations();
        performDeletionOperations();
        System.out.println("Hibernate related CRUD Operation Ends");
    }

    private void performInsertionOperations(){
        hibernateInsertion.performInsertionOperation();
    }

    private void performRetrievalOperations(){
        hibernateRetrieval.performRetrievalOperation();
    }

    private void performDeletionOperations(){
        hibernateDeletion.performDeletionOperation();
    }

    public void setHibernateInsertion(HibernateInsertion hibernateInsertion) {
        this.hibernateInsertion = hibernateInsertion;
    }

    public void setHibernateRetrieval(HibernateRetrieval hibernateRetrieval) {
        this.hibernateRetrieval = hibernateRetrieval;
    }

    public void setHibernateDeletion(HibernateDeletion hibernateDeletion) {
        this.hibernateDeletion = hibernateDeletion;
    }
}
