package com.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Filtre;

@Repository
public class FiltreDAO implements FiltreDaoInterface {
    @SuppressWarnings( "unused" )
    private static final Log log = LogFactory.getLog( AdresseDAO.class );

    @Autowired
    private SessionFactory   sessionFactory;

    @Transactional
    @Override
    public void creerFiltre( Filtre filtre ) {
        sessionFactory.getCurrentSession().persist( filtre );
    }

    @Transactional
    @Override
    public void deleteFiltre( int idFiltre ) {
        sessionFactory.getCurrentSession().delete( getFiltre( idFiltre ) );

    }

    @Transactional
    @Override
    public void updateFiltre( Filtre filtre ) {

        sessionFactory.getCurrentSession().update( filtre );

    }

    @Transactional
    @Override
    public Filtre getFiltre( int idFiltre ) {

        return (Filtre) sessionFactory.getCurrentSession().get( Filtre.class, idFiltre );

    }

    @SuppressWarnings( "unchecked" )
    @Transactional
    @Override
    public List<Filtre> getAllFiltre() {

        return sessionFactory.getCurrentSession().createQuery( " from Filtre "
                ).list();
    }

    @Transactional
    @Override
    public List getAllFiltreByIdUser( int idUserRecup ) {
        List allfiltre = sessionFactory.getCurrentSession()
                .createSQLQuery( "select * from Filtre  where id_user = :id_user" ).addEntity( Filtre.class
                ).setParameter( "id_user", idUserRecup ).list();

        return allfiltre;
    }

    @Transactional
    @Override
    public void deleteFiltreByIdUser( int idUserCurent ) {
        Query query = sessionFactory.getCurrentSession().createSQLQuery(
                "delete from Filtre  where id_user = :id_user" )
                .addEntity( Filtre.class )
                .setParameter( "id_user", idUserCurent );
        query.executeUpdate();
    }

}
