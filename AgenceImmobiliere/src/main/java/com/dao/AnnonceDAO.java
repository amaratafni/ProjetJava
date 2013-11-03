package com.dao;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Annonce;

@Repository
public class AnnonceDAO implements AnnonceDaoInterace {
    private static final Log log = LogFactory.getLog( UtilisateurDAO.class );

    @Autowired
    private SessionFactory   sessionFactory;

    @Override
    @Transactional
    public void crieerAnnonce( Annonce annonce ) {
        sessionFactory.getCurrentSession().persist( annonce );
    }

    @Transactional
    @Override
    public void deleteAnnonce( int idAnnonce ) {
        sessionFactory.getCurrentSession().delete( getAnnonce( idAnnonce ) );

    }

    @Override
    @Transactional
    public void updateAnnonce( Annonce annonce ) {
        sessionFactory.getCurrentSession().update( annonce );
    }

    @Override
    @Transactional
    public Annonce getAnnonce( int idAnnonce ) {

        return (Annonce) sessionFactory.getCurrentSession().get( Annonce.class, idAnnonce );
    }

    @SuppressWarnings( "unchecked" )
    @Override
    @Transactional
    public List<Annonce> getAllAnnonce() {

        return sessionFactory.getCurrentSession().createQuery( " from Annonce "
                ).list();
    }

    @Override
    @Transactional
    public List<Annonce> findByExample( Annonce instance ) {
        log.debug( "finding Annonce instance by example" );
        try {
            List<Annonce> results = (List<Annonce>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.dao.Annonce" )
                    .add( create( instance ) )
                    .list();
            log.debug( "find by example successful, result size: " + results.size() );
            return results;
        } catch ( RuntimeException re ) {
            log.error( "find by example failed", re );
            throw re;
        }
    }

    @Override
    @Transactional
    public List<Annonce> findByCreteria( String champs, Object value ) {
        List crit = sessionFactory.getCurrentSession().createCriteria( Annonce.class )
                .add( Restrictions.eq( champs, value ) ).list();
        return crit;
    }

}
