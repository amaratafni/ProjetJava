package com.beans;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Adresse;
import com.model.Annonce;
import com.services.AdresseInterface;

@Controller( "adresseBean" )
@Scope( "session" )
public class AdresseBean {
    @Autowired
    AdresseInterface adresseInterface;

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

    // Créer une classe Adresse :
    public void creerAdresse() throws IOException {

        Adresse adresse = new Adresse();
        adresse.setCartier( getCartier() );
        adresse.setCodePostale( getCodePostale() );
        adresse.setVille( getVille() );
        getAdresseInterface().crieerAdresse( adresse );
        FacesContext.getCurrentInstance().getExternalContext().redirect( "ajouterAnnonce.jsf" );
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

}
