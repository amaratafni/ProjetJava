package com.dao;

import java.util.List;
import java.util.Set;

import com.model.Annonce;
import com.model.Utilisateur;

public interface UtilisateurDaoInterface {
    public void crieerUtilisateur( Utilisateur utilisateur );

    public void deleteUtilisateur( int idUtilisateur );

    public void updateUtilisateur( Utilisateur utilisateur );

    public Utilisateur getUtilisateur( int idUtilisateur );

    @SuppressWarnings( "rawtypes" )
    public List getAllUtilisteur();

    // other find by creteria:
    public List<Utilisateur> findByExample( Utilisateur utilisateur );

    public List<Utilisateur> findByCreteria( String champs, Object value );

    public void deleteUtilisateurByAnnonce( Set<Annonce> annonces );

    public int getIDUser( String alias );

}
