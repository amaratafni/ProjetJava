package com.services;

import java.util.List;

import com.model.Annonce;

public interface AnnonceInterface {

    public void crieerAnnonce( Annonce annonce );

<<<<<<< HEAD
    public void deleteAnnonce( List ass );
=======
    public void deleteAnnonce( int idAnnonce );
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

    public void updateAnnonce( Annonce annonce );

    public Annonce getAnnonce( int idAnnonce );

    @SuppressWarnings( "rawtypes" )
    public List getAllAnnonce();

    // other find by creteria:
    public List<Annonce> findByExample( Annonce annonce );

    public List<Annonce> findByCreteria( String champs, Object value );
<<<<<<< HEAD

    public List<Annonce> DeleteCreteria( String champs, Object value );

    public void deleteByClasse( Annonce annonce );

    public void deleteAnnonce( int idAnnonce );

    public List getALLAnnanceByIdeUser( int idUserCurent );

    public List getALLAnnanceByIdAdress( int idAdresseCourant );

    public void deleteAnnonceByID( int idUser );

=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}
