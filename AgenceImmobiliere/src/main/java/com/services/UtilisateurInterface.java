package com.services;

import java.util.List;
<<<<<<< HEAD
import java.util.Set;

import com.model.Annonce;
=======

>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
import com.model.Utilisateur;

public interface UtilisateurInterface {

    public void crieerUtilisateur( Utilisateur utilisateur );

    public void deleteUtilisateur( int idUtilisateur );

    public void updateUtilisateur( Utilisateur utilisateur );

    public Utilisateur getUtilisateur( int idUtilisateur );

    @SuppressWarnings( "rawtypes" )
    public List getAllUtilisteur();

    // other find by creteria:
    public List<Utilisateur> findByExample( Utilisateur utilisateur );

    public List<Utilisateur> findByCreteria( String champs, Object value );
<<<<<<< HEAD

    public void deleteUtilisateurByAnnonce( Set<Annonce> annonces );

    public int getIDUser( String alias );

=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}
