package com.dao;

// Generated 11 oct. 2013 15:38:40 by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.model.Filtre;

/**
 * Home object for domain model class Filtre.
 * 
 * @see com.dao.Filtre
 * @author Hibernate Tools
 */
public class FiltreHome {

    private static final Log     log            = LogFactory.getLog( FiltreHome.class );

    private final SessionFactory sessionFactory = getSessionFactory();

    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup( "SessionFactory" );
        } catch ( Exception e ) {
            log.error( "Could not locate SessionFactory in JNDI", e );
            throw new IllegalStateException( "Could not locate SessionFactory in JNDI" );
        }
    }

    public void persist( Filtre transientInstance ) {
        log.debug( "persisting Filtre instance" );
        try {
            sessionFactory.getCurrentSession().persist( transientInstance );
            log.debug( "persist successful" );
        } catch ( RuntimeException re ) {
            log.error( "persist failed", re );
            throw re;
        }
    }

    public void attachDirty( Filtre instance ) {
        log.debug( "attaching dirty Filtre instance" );
        try {
            sessionFactory.getCurrentSession().saveOrUpdate( instance );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void attachClean( Filtre instance ) {
        log.debug( "attaching clean Filtre instance" );
        try {
            sessionFactory.getCurrentSession().lock( instance, LockMode.NONE );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void delete( Filtre persistentInstance ) {
        log.debug( "deleting Filtre instance" );
        try {
            sessionFactory.getCurrentSession().delete( persistentInstance );
            log.debug( "delete successful" );
        } catch ( RuntimeException re ) {
            log.error( "delete failed", re );
            throw re;
        }
    }

    public Filtre merge( Filtre detachedInstance ) {
        log.debug( "merging Filtre instance" );
        try {
            Filtre result = (Filtre) sessionFactory.getCurrentSession()
                    .merge( detachedInstance );
            log.debug( "merge successful" );
            return result;
        } catch ( RuntimeException re ) {
            log.error( "merge failed", re );
            throw re;
        }
    }

    public Filtre findById( int id ) {
        log.debug( "getting Filtre instance with id: " + id );
        try {
            Filtre instance = (Filtre) sessionFactory.getCurrentSession()
                    .get( "com.dao.Filtre", id );
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

    public List<Filtre> findByExample( Filtre instance ) {
        log.debug( "finding Filtre instance by example" );
        try {
            List<Filtre> results = (List<Filtre>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.dao.Filtre" )
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
