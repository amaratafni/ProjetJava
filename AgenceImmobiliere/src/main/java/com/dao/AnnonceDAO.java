package com.dao;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
<<<<<<< HEAD
import org.hibernate.Query;
=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
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
<<<<<<< HEAD
        // sessionFactory.getCurrentSession().delete( getAnnonce( idAnnonce ) );
        Query query = sessionFactory.getCurrentSession().createSQLQuery(
                "delete from Annonce  where id_user = :id_user" )
                .addEntity( Annonce.class )
                .setParameter( "id_user", idAnnonce );
        query.executeUpdate();
=======
        sessionFactory.getCurrentSession().delete( getAnnonce( idAnnonce ) );
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

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
<<<<<<< HEAD
                    .createCriteria( "com.model.Annonce" )
=======
                    .createCriteria( "com.dao.Annonce" )
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
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

<<<<<<< HEAD
    @Override
    @Transactional
    public List<Annonce> DeleteCreteria( String champs, Object value ) {
        List crit = sessionFactory.getCurrentSession().createCriteria( Annonce.class )
                .add( Restrictions.eq( champs, value ) )
                .list();

        return crit;
    }

    @Override
    @Transactional
    public void deleteByClasse( Annonce persistentInstance ) {
        System.out.println( "je suis la pour imprimer dans annonxe dao" + persistentInstance.getIdAnnonce() );

        sessionFactory.getCurrentSession().delete( persistentInstance );

    }

    @SuppressWarnings( "rawtypes" )
    @Override
    @Transactional
    public void deleteAnnonce( List ass ) {
        sessionFactory.getCurrentSession().delete( ass );
    }

    @SuppressWarnings( "rawtypes" )
    @Override
    @Transactional
    public List getAllAnnonceByIdUser( int idUser ) {
        List allAnonce = sessionFactory.getCurrentSession()
                .createSQLQuery( "select * from annonce  where id_user = :id_user" ).addEntity( Annonce.class
                ).setParameter( "id_user", idUser ).list();
        return allAnonce;
    }

    @SuppressWarnings( "rawtypes" )
    @Override
    @Transactional
    public List getAllAnnonceByIdAdress( int idAdresseCourant ) {
        // c faut j'ai besoin de toute les annonces enfait qui
        List allAnonces = sessionFactory.getCurrentSession().
                createSQLQuery( "select * from annonce  where id_adresse = :id_adresse" ).addEntity( Annonce.class )
                .setParameter( "id_adresse", idAdresseCourant ).list();
        return allAnonces;
    }

    @Override
    @Transactional
    public void deleteAnnonceByID( int idUser ) {
        sessionFactory.getCurrentSession().delete( getAnnonce( idUser ) );

    }

=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}
