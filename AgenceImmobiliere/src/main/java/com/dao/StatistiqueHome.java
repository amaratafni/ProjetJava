package com.dao;

// Generated 11 oct. 2013 15:38:40 by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.model.Statistique;

/**
 * Home object for domain model class Statistique.
 * 
 * @see com.dao.Statistique
 * @author Hibernate Tools
 */
public class StatistiqueHome {

    private static final Log     log            = LogFactory.getLog( StatistiqueHome.class );

    private final SessionFactory sessionFactory = getSessionFactory();

    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup( "SessionFactory" );
        } catch ( Exception e ) {
            log.error( "Could not locate SessionFactory in JNDI", e );
            throw new IllegalStateException( "Could not locate SessionFactory in JNDI" );
        }
    }

    public void persist( Statistique transientInstance ) {
        log.debug( "persisting Statistique instance" );
        try {
            sessionFactory.getCurrentSession().persist( transientInstance );
            log.debug( "persist successful" );
        } catch ( RuntimeException re ) {
            log.error( "persist failed", re );
            throw re;
        }
    }

    public void attachDirty( Statistique instance ) {
        log.debug( "attaching dirty Statistique instance" );
        try {
            sessionFactory.getCurrentSession().saveOrUpdate( instance );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void attachClean( Statistique instance ) {
        log.debug( "attaching clean Statistique instance" );
        try {
            sessionFactory.getCurrentSession().lock( instance, LockMode.NONE );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void delete( Statistique persistentInstance ) {
        log.debug( "deleting Statistique instance" );
        try {
            sessionFactory.getCurrentSession().delete( persistentInstance );
            log.debug( "delete successful" );
        } catch ( RuntimeException re ) {
            log.error( "delete failed", re );
            throw re;
        }
    }

    public Statistique merge( Statistique detachedInstance ) {
        log.debug( "merging Statistique instance" );
        try {
            Statistique result = (Statistique) sessionFactory.getCurrentSession()
                    .merge( detachedInstance );
            log.debug( "merge successful" );
            return result;
        } catch ( RuntimeException re ) {
            log.error( "merge failed", re );
            throw re;
        }
    }

    public Statistique findById( int id ) {
        log.debug( "getting Statistique instance with id: " + id );
        try {
            Statistique instance = (Statistique) sessionFactory.getCurrentSession()
                    .get( "com.dao.Statistique", id );
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

    public List<Statistique> findByExample( Statistique instance ) {
        log.debug( "finding Statistique instance by example" );
        try {
            List<Statistique> results = (List<Statistique>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.dao.Statistique" )
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
