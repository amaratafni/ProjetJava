package com.services;

import java.util.List;

import com.model.Annonce;

public interface AnnonceInterface {

    public void crieerAnnonce( Annonce annonce );

    public void deleteAnnonce( List ass );

    public void updateAnnonce( Annonce annonce );

    public Annonce getAnnonce( int idAnnonce );

    @SuppressWarnings( "rawtypes" )
    public List getAllAnnonce();

    // other find by creteria:
    public List<Annonce> findByExample( Annonce annonce );

    public List<Annonce> findByCreteria( String champs, Object value );

    public List<Annonce> DeleteCreteria( String champs, Object value );

    public void deleteByClasse( Annonce annonce );

    public void deleteAnnonce( int idAnnonce );

    public List getALLAnnanceByIdeUser( int idUserCurent );

    public List getALLAnnanceByIdAdress( int idAdresseCourant );

    public void deleteAnnonceByID( int idUser );

}
