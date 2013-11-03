package com.beans;

import java.io.IOException;
<<<<<<< HEAD
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
=======
import java.util.HashSet;
import java.util.Set;

import javax.faces.context.FacesContext;
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Adresse;
import com.model.Annonce;
import com.services.AdresseInterface;

@Controller( "adresseBean" )
@Scope( "session" )
<<<<<<< HEAD
public class AdresseBean implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Autowired
    AdresseInterface          adresseInterface;
=======
public class AdresseBean {
    @Autowired
    AdresseInterface adresseInterface;
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

    public AdresseInterface getAdresseInterface() {
        return adresseInterface;
    }

    public void setAdresseInterface( AdresseInterface adresseInterface ) {
        this.adresseInterface = adresseInterface;
    }

    private int          idAdresse;
    private String       ville;
    private Integer      codePostale;
    private String       cartier;
    private Set<Annonce> annonces = new HashSet<Annonce>( 0 );
<<<<<<< HEAD
    private boolean      isExiste;

    @SuppressWarnings( "rawtypes" )
    public void creerAdresse() throws IOException {
        isExiste = false;
=======

    // Créer une classe Adresse :
    public void creerAdresse() throws IOException {

>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
        Adresse adresse = new Adresse();
        adresse.setCartier( getCartier() );
        adresse.setCodePostale( getCodePostale() );
        adresse.setVille( getVille() );
<<<<<<< HEAD
        Adresse testAdresseExistance = null;
        List<Adresse> adressAnnonceList = getAdresseInterface().findByExample( adresse );
        for ( Iterator iterator = adressAnnonceList.iterator(); iterator.hasNext(); ) {
            testAdresseExistance = (Adresse) iterator.next();
        }

        if ( testAdresseExistance != null ) {
            isExiste = true;

        } else {
            System.out.println( "Adresse  nexiste pas  je vais là créer." );
            getAdresseInterface().crieerAdresse( adresse );
        }

        FacesContext.getCurrentInstance().getExternalContext().redirect( "propreAjouterAnnonce.jsf" );
        if ( getVille() == null ) {
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage message = new FacesMessage();
            message.setDetail( "champs ne doit pas etre null" );
            message.setSeverity( FacesMessage.SEVERITY_ERROR );
            context.addMessage( "formId:validate", message );
        }
    }

    // verification des champs :
    @SuppressWarnings( "unused" )
    public void validerChampsCodePostale( FacesContext contexte, UIComponent composant, Object objet ) {

        String valeur = null;
        boolean estValide = false;
        valeur = objet.toString();
        System.out.println( "je suis entré sdddddddddddd" );
        if ( estValide ) {

            throw new ValidatorException( new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Entrée non valide login existe deja",
                    "Entrée non valide login existe deja" ) );
        }
=======
        getAdresseInterface().crieerAdresse( adresse );
        FacesContext.getCurrentInstance().getExternalContext().redirect( "ajouterAnnonce.jsf" );
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
    }

    public int getIdAdresse() {
        return idAdresse;
    }

    public void setIdAdresse( int idAdresse ) {
        this.idAdresse = idAdresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille( String ville ) {
        this.ville = ville;
    }

    public Integer getCodePostale() {
        return codePostale;
    }

    public void setCodePostale( Integer codePostale ) {
        this.codePostale = codePostale;
    }

    public String getCartier() {
        return cartier;
    }

    public void setCartier( String cartier ) {
        this.cartier = cartier;
    }

    public Set<Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces( Set<Annonce> annonces ) {
        this.annonces = annonces;
    }

<<<<<<< HEAD
    public boolean isExiste() {
        return isExiste;
    }

    public void setExiste( boolean isExiste ) {
        this.isExiste = isExiste;
    }

=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}
