package com.beans;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

import org.richfaces.component.html.HtmlScrollableDataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Annonce;
import com.model.Filtre;
import com.model.Statistique;
import com.model.Utilisateur;
import com.services.UtilisateurInterface;

@Controller( "utilisateurBean" )
@Scope( "session" )
public class UtilisateurBean {

    @Autowired
    UtilisateurInterface                      utilisateurInterface;
    private int                               idUser;
    private String                            alias;
    private String                            name;
    private String                            prenom;
    private String                            email;
    private Date                              dateInscri;
    private Set<Annonce>                      annonces     = new HashSet<Annonce>( 0 );
    private Set<Statistique>                  statistiques = new HashSet<Statistique>( 0 );
    private Set<Filtre>                       filtres      = new HashSet<Filtre>( 0 );

    private List<Utilisateur>                 utilisateurListTest;
    private transient HtmlScrollableDataTable utilisateurTable;

    public Date getSysdate() {
        return new Date();
    }

    public void setSysdate( SimpleDateFormat sysdate ) {
        this.sysdate = sysdate;
    }

    private Utilisateur curentUtilisateur;
    SimpleDateFormat    sysdate;

    // valeur pour tester mes champs

    // valider alias :
    public void checkValidity() throws IOException {

        FacesContext.getCurrentInstance().getExternalContext().redirect( "pageGestionAdmin.jsf" );

    }

    public Utilisateur getCurentUtilisateur() {
        return curentUtilisateur;
    }

    public void setCurentUtilisateur( Utilisateur curentUtilisateur ) {
        this.curentUtilisateur = curentUtilisateur;
    }

    @SuppressWarnings( "rawtypes" )
    public void validerAlias( FacesContext contexte, UIComponent composant, Object objet ) {

        String valeur = null;
        boolean estValide = false;
        valeur = objet.toString();
        Utilisateur aUtilisateur = new Utilisateur();
        aUtilisateur.setAlias( valeur );

        List<Utilisateur> listUtilisteur = utilisateurInterface.findByCreteria( "alias", valeur );

        for ( Iterator iterator = listUtilisteur.iterator(); iterator.hasNext(); ) {
            Utilisateur aAdmin = (Utilisateur) iterator.next();

            if ( aAdmin.getAlias().equals( valeur ) ) {
                estValide = true;
                System.out.println( "i am in egalité: voilà .getAdmin" + aAdmin.getAlias() );
                System.out.println( "voilà mes truc : " + valeur );
            }
        }

        if ( estValide ) {

            throw new ValidatorException( new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Entrée non valide login existe deja",
                    "Entrée non valide login existe deja" ) );
        }
    }

    // methode pour récupérer la date du jour :

    public String getSysDate() {

        java.util.Date today;
        today = new java.util.Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat( "dd/MM/yyyy" );
        setSysdate( DateFormat );
        return DateFormat.format( today );
    }

    // methode pour créer un Utilisateur :
    public void createUser() throws IOException {

        Utilisateur aUtilisateur = new Utilisateur();
        aUtilisateur.setAlias( getAlias() );

        aUtilisateur.setEmail( getEmail() );
        aUtilisateur.setName( getName() );
        aUtilisateur.setPrenom( getPrenom() );
        aUtilisateur.setEtat( true );
        // je récupère la date d'aujordh'ui :

        java.util.Date today;
        today = new java.util.Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat( "yyyy-MM-dd" );

        setSysdate( DateFormat );

        aUtilisateur.setDateInscri( getSysdate() );

        utilisateurInterface.crieerUtilisateur( aUtilisateur );
        FacesContext.getCurrentInstance().getExternalContext().redirect( "succes.jsf" );

    }

    // methode pour valider l'email d'authentification :
    public void checkValidityAuthentificationUser() throws IOException {

        FacesContext.getCurrentInstance().getExternalContext().redirect( "acceuilUtilisateur.jsf" );

    }

    @SuppressWarnings( "rawtypes" )
    public void validerAliasAuthentification( FacesContext contexte, UIComponent composant, Object objet ) {

        String valeur = null;
        boolean estValide = false;
        valeur = objet.toString();
        Utilisateur aUtilisateur = new Utilisateur();
        aUtilisateur.setAlias( valeur );

        List<Utilisateur> listUtilisteur = utilisateurInterface.findByCreteria( "alias", valeur );

        for ( Iterator iterator = listUtilisteur.iterator(); iterator.hasNext(); ) {
            Utilisateur aAdmin = (Utilisateur) iterator.next();

            if ( aAdmin.getAlias().equals( valeur ) ) {
                if ( aAdmin.getEtat() == true ) {
                    estValide = true;
                    System.out.println( "i am in egalité: voilà .getAdmin" + aAdmin.getAlias() );
                    System.out.println( "voilà mes truc : " + valeur );

                }

            }
        }

        if ( !estValide ) {

            throw new ValidatorException( new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Entrée non valide alias n'existe pas, ou vous etes bloqué par l'admin ",
                    "Entrée non valide alias n'existe pas, ou bloqué par l'admin" ) );
        }
    }

    // verification l'eamil:
    @SuppressWarnings( "rawtypes" )
    public void validerEmailAuthentification( FacesContext contexte, UIComponent composant, Object objet ) {

        String valeur = null;
        boolean estValide = false;
        valeur = objet.toString();
        Utilisateur aUtilisateur = new Utilisateur();
        aUtilisateur.setEmail( valeur );

        List<Utilisateur> listUtilisteur = utilisateurInterface.findByCreteria( "email", valeur );

        for ( Iterator iterator = listUtilisteur.iterator(); iterator.hasNext(); ) {
            Utilisateur aUtilisateur2 = (Utilisateur) iterator.next();

            if ( aUtilisateur2.getEmail().equals( valeur ) ) {

                estValide = true;
                System.out.println( "i am in egalité: voilà .getAdmin" + aUtilisateur2.getAlias() );
                System.out.println( "voilà mes truc : " + valeur );
            }
        }

        if ( !estValide ) {

            throw new ValidatorException( new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "Entrée non valide email n'est pas valide",
                    "Entrée non valide email n'est pas valide" ) );
        }
    }

    public UtilisateurInterface getUtilisateurInterface() {
        return utilisateurInterface;
    }

    public void setUtilisateurInterface( UtilisateurInterface utilisateurInterface ) {
        this.utilisateurInterface = utilisateurInterface;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser( int idUser ) {
        this.idUser = idUser;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias( String alias ) {
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Date getDateInscri() {
        return dateInscri;
    }

    public void setDateInscri( Date dateInscri ) {
        this.dateInscri = dateInscri;
    }

    public Set<Annonce> getAnnonces() {
        return annonces;
    }

    public void setAnnonces( Set<Annonce> annonces ) {
        this.annonces = annonces;
    }

    public Set<Statistique> getStatistiques() {
        return statistiques;
    }

    public void setStatistiques( Set<Statistique> statistiques ) {
        this.statistiques = statistiques;
    }

    public Set<Filtre> getFiltres() {
        return filtres;
    }

    public void setFiltres( Set<Filtre> filtres ) {
        this.filtres = filtres;
    }

    @SuppressWarnings( "unchecked" )
    public List<Utilisateur> getUtilisateurListTest() {

        utilisateurListTest = getUtilisateurInterface().getAllUtilisteur();

        return utilisateurListTest;
    }

    public void setUtilisateurListTest( List<Utilisateur> utilisateurListTest ) {
        this.utilisateurListTest = utilisateurListTest;
    }

    public HtmlScrollableDataTable getUtilisateurTable() {
        return utilisateurTable;
    }

    public void setUtilisateurTable( HtmlScrollableDataTable utilisateurTable ) {
        this.utilisateurTable = utilisateurTable;
    }

    // for supression :

}
