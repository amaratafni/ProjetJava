package com.services;

import java.util.List;
<<<<<<< HEAD
import java.util.Set;
=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UtilisateurDaoInterface;
<<<<<<< HEAD
import com.model.Annonce;
=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
import com.model.Utilisateur;

@Service( "utilisateurService" )
public class UtilisateurServiceImp implements UtilisateurInterface {

    @Autowired
    private UtilisateurDaoInterface daoInterface;

    public UtilisateurDaoInterface getDaoInterface() {
        return daoInterface;
    }

    public void setDaoInterface( UtilisateurDaoInterface daoInterface ) {
        this.daoInterface = daoInterface;
    }

    // mes service :
    @Override
    public void crieerUtilisateur( Utilisateur utilisateur ) {
        getDaoInterface().crieerUtilisateur( utilisateur );
    }

    @Override
    public void deleteUtilisateur( int idUtilisateur ) {
        getDaoInterface().deleteUtilisateur( idUtilisateur );
    }

    @Override
    public void updateUtilisateur( Utilisateur utilisateur ) {
        getDaoInterface().updateUtilisateur( utilisateur );
    }

    @Override
    public Utilisateur getUtilisateur( int idUtilisateur ) {

        return getDaoInterface().getUtilisateur( idUtilisateur );
    }

    @SuppressWarnings( "rawtypes" )
    @Override
    public List getAllUtilisteur() {

        return getDaoInterface().getAllUtilisteur();
    }

    @Override
    public List<Utilisateur> findByExample( Utilisateur utilisateur ) {

        return getDaoInterface().findByExample( utilisateur );
    }

    @Override
    public List<Utilisateur> findByCreteria( String champs, Object value ) {

        return getDaoInterface().findByCreteria( champs, value );
    }

<<<<<<< HEAD
    @Override
    public void deleteUtilisateurByAnnonce( Set<Annonce> annonces ) {

        getDaoInterface().deleteUtilisateurByAnnonce( annonces );

    }

    @Override
    public int getIDUser( String alias ) {
        // TODO Auto-generated method stub
        return getDaoInterface().getIDUser( alias );
    }
=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}
