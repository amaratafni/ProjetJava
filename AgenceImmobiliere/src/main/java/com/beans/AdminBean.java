package com.beans;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Admin;
import com.services.AdminInterface;

@Controller( "adminBean" )
@Scope( "session" )
public class AdminBean {

    @Autowired
    AdminInterface adminInterface;

    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin( String login ) {
        this.login = login;
    }

    private String motPasse;

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse( String motPasse ) {
        this.motPasse = motPasse;
    }

    private boolean isUsernameValid;
    private boolean isPasswordValid;

    private boolean validationComplete = false;

    public boolean getIsUsernameValid() {
        return isUsernameValid;
    }

    public void setUsernameValid( boolean isUsernameValid ) {
        this.isUsernameValid = isUsernameValid;
    }

    public boolean getIsPasswordValid() {
        return isPasswordValid;
    }

    public void setPasswordValid( boolean isPasswordValid ) {
        this.isPasswordValid = isPasswordValid;
    }

    public boolean getValidationComplete() {
        return validationComplete;
    }

    public void setValidationComplete( boolean validationComplete ) {
        this.validationComplete = validationComplete;
    }

    @SuppressWarnings( {} )
    public void checkValidity() throws IOException {

        FacesContext.getCurrentInstance().getExternalContext().redirect( "pageGestionAdmin.jsf" );
        login = null;
        motPasse = null;
    }

    /*************************/
    public static final String CLE_MESSAGE_VALIDATION_IMPOSSIBLE = "message impossible moi";

    private String             numeroSerie;

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie( String numeroSerie ) {
        this.numeroSerie = numeroSerie;
    }

    @SuppressWarnings( "rawtypes" )
    public void validerLogin( FacesContext contexte, UIComponent composant, Object objet ) {

        String valeur = null;
        boolean estValide = false;

        valeur = objet.toString();
        Admin admin = new Admin();
        admin.setLogin( valeur );

        List<Admin> listAdmin = adminInterface.findByCreteria( "login", valeur );

        for ( Iterator iterator = listAdmin.iterator(); iterator.hasNext(); ) {
            Admin aAdmin = (Admin) iterator.next();

            if ( aAdmin.getLogin().equals( valeur ) ) {

                estValide = true;
            }
        }

        if ( !estValide ) {

            throw new ValidatorException( new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Entrée non valide", "Entrée non valide" ) );
        }
    }

    @SuppressWarnings( "rawtypes" )
    public void validerMotPasse( FacesContext contexte, UIComponent composant, Object objet ) {

        String valeur = null;
        boolean estValide = false;

        valeur = objet.toString();
        Admin admin = new Admin();
        admin.setMotPasse( valeur );

        List<Admin> listAdmin2 = adminInterface.findByCreteria( "motPasse", valeur );

        for ( Iterator iterator = listAdmin2.iterator(); iterator.hasNext(); ) {

            Admin aAdmin = (Admin) iterator.next();

            if ( aAdmin.getMotPasse().equals( valeur ) ) {

                estValide = true;
            }
        }

        if ( !estValide ) {

            throw new ValidatorException( new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Entrée non valide", "Entrée non valide" ) );
        }
    }
}