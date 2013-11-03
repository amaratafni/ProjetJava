package com.dao;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Adresse;

@Repository
public class AdresseDAO implements AdresseDaoInterface {

    private static final Log log = LogFactory.getLog( AdresseDAO.class );

    @Autowired
    private SessionFactory   sessionFactory;

    @Transactional
    @Override
    public void crieerAdresse( Adresse adresse ) {
        sessionFactory.getCurrentSession().persist( adresse );
    }

    @Transactional
    @Override
    public void deleteAdresse( int idAdresse ) {
        // sessionFactory.getCurrentSession().delete( getAdresse( idAdresse ) );
        sessionFactory.getCurrentSession().delete( getAdresse( idAdresse ) );
        /*
         * Query query = sessionFactory.getCurrentSession().createSQLQuery(
         * "delete from Adresse  where id_adresse = :id_adresse" ) .addEntity(
         * Adresse.class ) .setParameter( "id_adresse", idAdresse );
         * query.executeUpdate();
         */
    }

    @Transactional
    @Override
    public void updateAdresse( Adresse adresse ) {
        sessionFactory.getCurrentSession().update( adresse );
    }

    @Transactional
    @Override
    public Adresse getAdresse( int idAdresse ) {

        return (Adresse) sessionFactory.getCurrentSession().get( Adresse.class, idAdresse );
    }

    @SuppressWarnings( "unchecked" )
    @Transactional
    @Override
    public List<Adresse> findByExample( Adresse instance ) {
        log.debug( "finding Adresse instance by example" );
        try {
            List<Adresse> results = (List<Adresse>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.model.Adresse" )
                    .add( create( instance ) )
                    .list();
            log.debug( "find by example successful, result size: " + results.size() );
            return results;
        } catch ( RuntimeException re ) {
            log.error( "find by example failed", re );
            throw re;
        }
    }

    @Transactional
    @Override
    public List<Adresse> findByCreteria( String login, Object value ) {

        return null;
    }

    @SuppressWarnings( "unchecked" )
    @Transactional
    @Override
    public List<Adresse> getAllAdresse() {
        return sessionFactory.getCurrentSession().createQuery( " from Adresse "
                ).list();
    }

}
