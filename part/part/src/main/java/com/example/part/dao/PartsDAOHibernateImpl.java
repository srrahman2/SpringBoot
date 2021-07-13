package com.example.part.dao;


import com.example.part.entity.Parts;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PartsDAOHibernateImpl implements PartsDAO{

    private EntityManager entityManager;

    @Autowired
    public PartsDAOHibernateImpl(EntityManager theEntityManager){entityManager = theEntityManager;}

    @Override
    public List<Parts> findAll(){

        Session currentSession = entityManager.unwrap(Session.class);

        Query<Parts> theQuery = currentSession.createQuery("from Parts", Parts.class);
        List<Parts> allparts = theQuery.getResultList();
        return allparts;
    }

    @Override
    public  Parts findById(int pId){
        Session currentSession = entityManager.unwrap(Session.class);
        Parts aPart = currentSession.get(Parts.class, pId);
        return aPart;
    }

    @Override
    public void save(Parts theParts){
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theParts);
    }

    @Override
    public void deleteById(int aId){
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from Parts where id=:partsId");
        theQuery.setParameter("partsId", aId);
        theQuery.executeUpdate();
    }
}
