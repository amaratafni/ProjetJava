package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AnnonceDaoInterace;
import com.model.Annonce;

@Service( "annonceService" )
public class AnnonceServiceImp implements AnnonceInterface {
    @Autowired
    private AnnonceDaoInterace annonceDaoInterace;

    public AnnonceDaoInterace getAnnonceDaoInterace() {
        return annonceDaoInterace;
    }

    public void setAnnonceDaoInterace( AnnonceDaoInterace annonceDaoInterace ) {
        this.annonceDaoInterace = annonceDaoInterace;
    }

    @Override
    public void crieerAnnonce( Annonce annonce ) {
        getAnnonceDaoInterace().crieerAnnonce( annonce );

    }

    @Override
    public void deleteAnnonce( int idAnnonce ) {
        getAnnonceDaoInterace().deleteAnnonce( idAnnonce );

    }

    @Override
    public void updateAnnonce( Annonce annonce ) {
        getAnnonceDaoInterace().updateAnnonce( annonce );
    }

    @Override
    public Annonce getAnnonce( int idAnnonce ) {
        return getAnnonceDaoInterace().getAnnonce( idAnnonce );

    }

<<<<<<< HEAD
    @SuppressWarnings( "rawtypes" )
    @Override
    public List getAllAnnonce() {
=======
    @Override
    public List getAllAnnonce() {

>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
        return getAnnonceDaoInterace().getAllAnnonce();
    }

    @Override
    public List<Annonce> findByExample( Annonce annonce ) {
<<<<<<< HEAD
        return getAnnonceDaoInterace().findByExample( annonce );
    }

    @Override
    public void deleteByClasse( Annonce annonce ) {
        getAnnonceDaoInterace().deleteByClasse( annonce );
=======

        return getAnnonceDaoInterace().findByExample( annonce );
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
    }

    @Override
    public List<Annonce> findByCreteria( String champs, Object value ) {

        return getAnnonceDaoInterace().findByCreteria( champs, value );
    }

<<<<<<< HEAD
    @Override
    public List<Annonce> DeleteCreteria( String champs, Object value ) {
        return getAnnonceDaoInterace().DeleteCreteria( champs, value );
    }

    @SuppressWarnings( "rawtypes" )
    @Override
    public void deleteAnnonce( List ass ) {
        // TODO Auto-generated method stub
        getAnnonceDaoInterace().deleteAnnonce( ass );
    }

    @SuppressWarnings( "rawtypes" )
    @Override
    public List getALLAnnanceByIdeUser( int idUserCurent ) {

        return getAnnonceDaoInterace().getAllAnnonceByIdUser( idUserCurent );
    }

    @SuppressWarnings( "rawtypes" )
    @Override
    public List getALLAnnanceByIdAdress( int idAdresseCourant ) {

        return getAnnonceDaoInterace().getAllAnnonceByIdAdress( idAdresseCourant );

    }

    @Override
    public void deleteAnnonceByID( int idUser ) {
        // TODO Auto-generated method stub
        getAnnonceDaoInterace().deleteAnnonceByID( idUser );
    }

=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}
