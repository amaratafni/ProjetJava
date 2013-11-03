package com.dao;

import static org.hibernate.criterion.Example.create;

import java.util.List;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Annonce;
import com.model.Utilisateur;

@Repository
public class UtilisateurDAO implements UtilisateurDaoInterface {

    private static final Log log = LogFactory.getLog( UtilisateurDAO.class );

    @Autowired
    private SessionFactory   sessionFactory;

    @Override
    @Transactional
    public void crieerUtilisateur( Utilisateur utilisateur ) {
        sessionFactory.getCurrentSession().persist( utilisateur );

    }

    @Override
    @Transactional
    public void deleteUtilisateur( int idUtilisateur ) {
        sessionFactory.getCurrentSession().delete( getUtilisateur( idUtilisateur ) );
    }

    @Override
    @Transactional
    public void updateUtilisateur( Utilisateur utilisateur ) {
        sessionFactory.getCurrentSession().update( utilisateur );
    }

    @Override
    @Transactional
    public Utilisateur getUtilisateur( int idUtilisateur ) {
        return (Utilisateur) sessionFactory.getCurrentSession().get( Utilisateur.class, idUtilisateur );
    }

    @SuppressWarnings( "unchecked" )
    @Override
    @Transactional
    public List<Utilisateur> getAllUtilisteur() {

        return sessionFactory.getCurrentSession().createQuery( " from Utilisateur "
                ).list();
    }

    @SuppressWarnings( "unchecked" )
    @Override
    @Transactional
    public List<Utilisateur> findByExample( Utilisateur instance ) {
        log.debug( "finding Utilisateur instance by example" );
        try {
            List<Utilisateur> results = (List<Utilisateur>) sessionFactory.getCurrentSession()
                    .createCriteria( "com.model.Utilisateur" )
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
    @SuppressWarnings( { "rawtypes", "unchecked" } )
    @Transactional
    public List<Utilisateur> findByCreteria( String champs, Object value )
    {
        List crit = sessionFactory.getCurrentSession().createCriteria( Utilisateur.class )
                .add( Restrictions.eq( champs, value ) ).list();
        return crit;
    }

    @Override
    @Transactional
    public void deleteUtilisateurByAnnonce( Set<Annonce> annonces ) {
        // TODO Auto-generated method stub
        sessionFactory.getCurrentSession().delete( annonces );
    }

    @Override
    @Transactional
    public int getIDUser( String alias ) {
        sessionFactory.getCurrentSession().
                createSQLQuery( "select id_user from Utilisateur  where alias = :alias" )
                .addEntity( Utilisateur.class )
                .setParameter( "alias", alias );

        // int b = Integer.parseInt( a );
        // System.out.println( "voilà le id que j'ai recupèrer" + a );
        return 0;
    }
}
