package com.dao;

// Generated 11 oct. 2013 15:38:40 by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.model.Adresse;

/**
 * Home object for domain model class Adresse.
 * 
 * @see com.dao.Adresse
 * @author Hibernate Tools
 */
public class AdresseHome {

    private static final Log     log            = LogFactory.getLog( AdresseHome.class );

    private final SessionFactory sessionFactory = getSessionFactory();

    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup( "SessionFactory" );
        } catch ( Exception e ) {
            log.error( "Could not locate SessionFactory in JNDI", e );
            throw new IllegalStateException( "Could not locate SessionFactory in JNDI" );
        }
    }

    public void persist( Adresse transientInstance ) {
        log.debug( "persisting Adresse instance" );
        try {
            sessionFactory.getCurrentSession().persist( transientInstance );
            log.debug( "persist successful" );
        } catch ( RuntimeException re ) {
            log.error( "persist failed", re );
            throw re;
        }
    }

    public void attachDirty( Adresse instance ) {
        log.debug( "attaching dirty Adresse instance" );
        try {
            sessionFactory.getCurrentSession().saveOrUpdate( instance );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void attachClean( Adresse instance ) {
        log.debug( "attaching clean Adresse instance" );
        try {
            sessionFactory.getCurrentSession().lock( instance, LockMode.NONE );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void delete( Adresse persistentInstance ) {
        log.debug( "deleting Adresse instance" );
        try {
            sessionFactory.getCurrentSession().delete( persistentInstance );
            log.debug( "delete successful" );
        } catch ( RuntimeException re ) {
            log.error( "delete failed", re );
            throw re;
        }
    }

    public Adresse merge( Adresse detachedInstance ) {
        log.debug( "merging Adresse instance" );
        try {
            Adresse result = (Adresse) sessionFactory.getCurrentSession()
                    .merge( detachedInstance );
            log.debug( "merge successful" );
            return result;
        } catch ( RuntimeException re ) {
            log.error( "merge failed", re );
            throw re;
        }
    }

    public Adresse findById( int id ) {
        log.debug( "getting Adresse instance with id: " + id );
        try {
            Adresse instance = (Adresse) sessionFactory.getCurrentSession()
                    .get( "com.dao.Adresse", id );
            if ( instance == null ) {
                log.debug( "get successful, no instance found" );
            }
            else {
                log.debug( "get successful, instance found" );
            }
            return instance;
        } catch ( RuntimeException re ) {
            log.error( "get failed", re );
            throw re;
        }
    }

    public List<Adresse> findByExample( Adresse instance ) {
        log.debug( "finding Adresse instance by example" );
        try {
            List<Adresse> results = (List<Adresse>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.dao.Adresse" )
                    .add( create( instance ) )
                    .list();
            log.debug( "find by example successful, result size: " + results.size() );
            return results;
        } catch ( RuntimeException re ) {
            log.error( "find by example failed", re );
            throw re;
        }
    }
}
