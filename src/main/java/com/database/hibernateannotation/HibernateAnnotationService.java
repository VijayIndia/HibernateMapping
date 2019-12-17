package com.database.hibernateannotation;

import com.database.hibernateannotation.upsert.HibernateAnnotationInsertion;

public class HibernateAnnotationService {

    private HibernateAnnotationInsertion hibernateAnnotationInsertion;

    public void performCRUDOperations(){
        hibernateAnnotationInsertion.performAnnotationInsertionOperation();
    }

    public void setHibernateAnnotationInsertion(HibernateAnnotationInsertion hibernateAnnotationInsertion) {
        this.hibernateAnnotationInsertion = hibernateAnnotationInsertion;
    }
}
