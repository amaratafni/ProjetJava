package com.dao;

// Generated 11 oct. 2013 15:38:40 by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.model.Bien;

/**
 * Home object for domain model class Bien.
 * 
 * @see com.dao.Bien
 * @author Hibernate Tools
 */
public class BienHome {

    private static final Log     log            = LogFactory.getLog( BienHome.class );

    private final SessionFactory sessionFactory = getSessionFactory();

    protected SessionFactory getSessionFactory() {
        try {
            return (SessionFactory) new InitialContext().lookup( "SessionFactory" );
        } catch ( Exception e ) {
            log.error( "Could not locate SessionFactory in JNDI", e );
            throw new IllegalStateException( "Could not locate SessionFactory in JNDI" );
        }
    }

    public void persist( Bien transientInstance ) {
        log.debug( "persisting Bien instance" );
        try {
            sessionFactory.getCurrentSession().persist( transientInstance );
            log.debug( "persist successful" );
        } catch ( RuntimeException re ) {
            log.error( "persist failed", re );
            throw re;
        }
    }

    public void attachDirty( Bien instance ) {
        log.debug( "attaching dirty Bien instance" );
        try {
            sessionFactory.getCurrentSession().saveOrUpdate( instance );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void attachClean( Bien instance ) {
        log.debug( "attaching clean Bien instance" );
        try {
            sessionFactory.getCurrentSession().lock( instance, LockMode.NONE );
            log.debug( "attach successful" );
        } catch ( RuntimeException re ) {
            log.error( "attach failed", re );
            throw re;
        }
    }

    public void delete( Bien persistentInstance ) {
        log.debug( "deleting Bien instance" );
        try {
            sessionFactory.getCurrentSession().delete( persistentInstance );
            log.debug( "delete successful" );
        } catch ( RuntimeException re ) {
            log.error( "delete failed", re );
            throw re;
        }
    }

    public Bien merge( Bien detachedInstance ) {
        log.debug( "merging Bien instance" );
        try {
            Bien result = (Bien) sessionFactory.getCurrentSession()
                    .merge( detachedInstance );
            log.debug( "merge successful" );
            return result;
        } catch ( RuntimeException re ) {
            log.error( "merge failed", re );
            throw re;
        }
    }

    public Bien findById( int id ) {
        log.debug( "getting Bien instance with id: " + id );
        try {
            Bien instance = (Bien) sessionFactory.getCurrentSession()
                    .get( "com.dao.Bien", id );
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

    public List<Bien> findByExample( Bien instance ) {
        log.debug( "finding Bien instance by example" );
        try {
            List<Bien> results = (List<Bien>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.dao.Bien" )
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
