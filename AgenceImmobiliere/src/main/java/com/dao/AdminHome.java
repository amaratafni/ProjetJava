package com.dao;

// Generated 11 oct. 2013 15:38:40 by Hibernate Tools 3.4.0.CR1

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Admin;

@Repository
public class AdminHome implements AdminDaoInterface {

    private static final Log log = LogFactory.getLog( AdminHome.class );
    @Autowired
    private SessionFactory   sessionFactory;

    @SuppressWarnings( "unchecked" )
    @Transactional
    public List<Admin> findByExample( Admin instance ) {
        log.debug( "finding Admin instance by example" );
        try {
            List<Admin> results = (List<Admin>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.model.Admin" )
                    .add( create( instance ) )
                    .list();
            log.debug( "find by example successful, result size: " + results.size() );
            return results;
        } catch ( RuntimeException re ) {
            log.error( "find by example failed", re );
            throw re;
        }
    }

    @SuppressWarnings( { "rawtypes", "unchecked" } )
    @Transactional
    public List<Admin> findByCreteria( String login, Object value )
    {
        List crit = sessionFactory.getCurrentSession().createCriteria( Admin.class )
                .add( Restrictions.eq( login, value ) ).list();
        return crit;

    }
}

/*
 * package com.dao;
 * 
 * // Generated 11 oct. 2013 15:38:40 by Hibernate Tools 3.4.0.CR1
 * 
 * import static org.hibernate.criterion.Example.create;
 * 
 * import java.util.List;
 * 
 * import javax.naming.InitialContext;
 * 
 * import org.apache.commons.logging.Log; import
 * org.apache.commons.logging.LogFactory; import org.hibernate.LockMode; import
 * org.hibernate.SessionFactory;
 * 
 * import com.model.Admin;
 * 
 * public class AdminHome {
 * 
 * private static final Log log = LogFactory.getLog( AdminHome.class );
 * 
 * private final SessionFactory sessionFactory = getSessionFactory();
 * 
 * protected SessionFactory getSessionFactory() { try { return (SessionFactory)
 * new InitialContext().lookup( "SessionFactory" ); } catch ( Exception e ) {
 * log.error( "Could not locate SessionFactory in JNDI", e ); throw new
 * IllegalStateException( "Could not locate SessionFactory in JNDI" ); } }
 * 
 * public void persist( Admin transientInstance ) { log.debug(
 * "persisting Admin instance" ); try {
 * sessionFactory.getCurrentSession().persist( transientInstance ); log.debug(
 * "persist successful" ); } catch ( RuntimeException re ) { log.error(
 * "persist failed", re ); throw re; } }
 * 
 * public void attachDirty( Admin instance ) { log.debug(
 * "attaching dirty Admin instance" ); try {
 * sessionFactory.getCurrentSession().saveOrUpdate( instance ); log.debug(
 * "attach successful" ); } catch ( RuntimeException re ) { log.error(
 * "attach failed", re ); throw re; } }
 * 
 * public void attachClean( Admin instance ) { log.debug(
 * "attaching clean Admin instance" ); try {
 * sessionFactory.getCurrentSession().lock( instance, LockMode.NONE );
 * log.debug( "attach successful" ); } catch ( RuntimeException re ) {
 * log.error( "attach failed", re ); throw re; } }
 * 
 * public void delete( Admin persistentInstance ) { log.debug(
 * "deleting Admin instance" ); try { sessionFactory.getCurrentSession().delete(
 * persistentInstance ); log.debug( "delete successful" ); } catch (
 * RuntimeException re ) { log.error( "delete failed", re ); throw re; } }
 * 
 * public Admin merge( Admin detachedInstance ) { log.debug(
 * "merging Admin instance" ); try { Admin result = (Admin)
 * sessionFactory.getCurrentSession() .merge( detachedInstance ); log.debug(
 * "merge successful" ); return result; } catch ( RuntimeException re ) {
 * log.error( "merge failed", re ); throw re; } }
 * 
 * public Admin findById( int id ) { log.debug(
 * "getting Admin instance with id: " + id ); try { Admin instance = (Admin)
 * sessionFactory.getCurrentSession() .get( "com.dao.Admin", id ); if ( instance
 * == null ) { log.debug( "get successful, no instance found" ); } else {
 * log.debug( "get successful, instance found" ); } return instance; } catch (
 * RuntimeException re ) { log.error( "get failed", re ); throw re; } }
 * 
 * public List<Admin> findByExample( Admin instance ) { log.debug(
 * "finding Admin instance by example" ); try { List<Admin> results =
 * (List<Admin>) sessionFactory.getCurrentSession() .createCriteria(
 * "com.dao.Admin" ) .add( create( instance ) ) .list(); log.debug(
 * "find by example successful, result size: " + results.size() ); return
 * results; } catch ( RuntimeException re ) { log.error(
 * "find by example failed", re ); throw re; } } }
 */