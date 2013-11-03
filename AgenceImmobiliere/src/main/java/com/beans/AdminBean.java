package com.beans;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

<<<<<<< HEAD
import org.richfaces.component.html.HtmlScrollableDataTable;
=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Admin;
<<<<<<< HEAD
import com.model.Annonce;
import com.model.Utilisateur;
import com.services.AdminInterface;
import com.services.AnnonceInterface;
=======
import com.services.AdminInterface;
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

@Controller( "adminBean" )
@Scope( "session" )
public class AdminBean {

<<<<<<< HEAD
    private Utilisateur                       curentUtilisateur;
    private List<Utilisateur>                 utilisateurListTest;
    private transient HtmlScrollableDataTable utilisateurTable;
    private transient HtmlScrollableDataTable utilisateurTableDesac;
    private List<Utilisateur>                 utilisateurListTestDesac;
    @Autowired
    private AnnonceInterface                  annonceInterface;

    public HtmlScrollableDataTable getUtilisateurTableDesac() {
        return utilisateurTableDesac;
    }

    public void setUtilisateurTableDesac( HtmlScrollableDataTable utilisateurTableDesac ) {
        this.utilisateurTableDesac = utilisateurTableDesac;
    }

    public List<Utilisateur> getUtilisateurListTestDesac() {
        utilisateurListTestDesac = getaBean().getUtilisateurInterface().getAllUtilisteur();
        return utilisateurListTestDesac;
    }

    public void setUtilisateurListTestDesac( List<Utilisateur> utilisateurListTestDesac ) {
        this.utilisateurListTestDesac = utilisateurListTestDesac;
    }

    @Autowired
    AdresseBean        adresseBean;

    @Autowired
    public AnnonceBean annonceBean;
    @Autowired
    public filtreBean  aFiltreBean;

    public filtreBean getaFiltreBean() {
        return aFiltreBean;
    }

    public void setaFiltreBean( filtreBean aFiltreBean ) {
        this.aFiltreBean = aFiltreBean;
    }

    /* mes methode : */
    /* methode 1 */
    public String update() {
        getaBean().getUtilisateurInterface().updateUtilisateur( curentUtilisateur );
        return null;
    }

    /* methode 1 */
    @SuppressWarnings( { "rawtypes" } )
    public String deleteIn() {
        int idUserCurent = curentUtilisateur.getIdUser();
        List resultatAllAnnonce = annonceInterface.getALLAnnanceByIdeUser( idUserCurent );
        for ( Iterator iterator = resultatAllAnnonce.iterator(); iterator.hasNext(); ) {
            Annonce aAnn = (Annonce) iterator.next();
            int idAdresseCourant = aAnn.getAdresse().getIdAdresse();
            annonceInterface.deleteAnnonceByID( aAnn.getIdAnnonce() );
            List annonceRestantes = annonceInterface.getALLAnnanceByIdAdress(
                    idAdresseCourant );
            if ( annonceRestantes.isEmpty() ) {
                getAdresseBean().getAdresseInterface().deleteAdresse( idAdresseCourant );
            }
        }
        getaFiltreBean().getaFiltreInterface().deleteFiltreByIDUser( idUserCurent );
        getaBean().getUtilisateurInterface().deleteUtilisateur( idUserCurent );

        return "listUtilisateur";
    }

    /* methode 1 */
    @SuppressWarnings( "unchecked" )
    public String viewDetail() {
        List<Utilisateur> valueList = (List<Utilisateur>) utilisateurTable.getValue();

        System.out.println( "je vien d'entré " );
        Iterator<Object> keys = utilisateurTable.getSelection().getKeys();
        if ( keys.hasNext() ) {
            curentUtilisateur = valueList.get( ( (Integer) keys.next() ).intValue() );
            // ici il retur detaill que j'ai defini ds faces config pour aller a
            // une autre page.
            return "detailUtilisateur";
        } else {
            return null;
        }
    }

    @SuppressWarnings( "unchecked" )
    public String viewDetailDesactiverUser() {
        List<Utilisateur> valueList = (List<Utilisateur>) utilisateurTableDesac.getValue();

        Iterator<Object> keys = utilisateurTableDesac.getSelection().getKeys();
        if ( keys.hasNext() ) {
            curentUtilisateur = valueList.get( ( (Integer) keys.next() ).intValue() );

            return "detailDesactiverUser";
        } else {
            return null;
        }
    }

    /* methode 1 */
    public String viewNew() {
        setCurentUtilisateur( new Utilisateur() );
        return "detail";
    }

    /* getter et setter */
    public AdresseBean getAdresseBean() {
        return adresseBean;
    }

    public void setAdresseBean( AdresseBean adresseBean ) {
        this.adresseBean = adresseBean;
    }

    public AnnonceBean getAnnonceBean() {
        return annonceBean;
    }

    public void setAnnonceBean( AnnonceBean annonceBean ) {
        this.annonceBean = annonceBean;
    }

    @Autowired
    public UtilisateurBean aBean;

    public UtilisateurBean getaBean() {
        return aBean;
    }

    public void setaBean( UtilisateurBean aBean ) {
        this.aBean = aBean;
    }

    @Autowired
    public AdminInterface adminInterface;

    private String        login;

    @SuppressWarnings( "unchecked" )
    public List<Utilisateur> getUtilisateurListTest() {

        utilisateurListTest = getaBean().getUtilisateurInterface().getAllUtilisteur();
        return utilisateurListTest;
    }

    public void setUtilisateurListTest( List<Utilisateur> utilisateurListTest ) {
        this.utilisateurListTest = utilisateurListTest;
    }
=======
    @Autowired
    AdminInterface adminInterface;

    private String login;
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

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

<<<<<<< HEAD
        FacesContext.getCurrentInstance().getExternalContext().redirect( "acceuilAdmin.jsf" );
=======
        FacesContext.getCurrentInstance().getExternalContext().redirect( "pageGestionAdmin.jsf" );
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
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
<<<<<<< HEAD

    // surprimer :

    public Utilisateur getCurentUtilisateur() {
        return curentUtilisateur;
    }

    public void setCurentUtilisateur( Utilisateur curentUtilisateur ) {
        this.curentUtilisateur = curentUtilisateur;
    }

    public HtmlScrollableDataTable getUtilisateurTable() {
        return utilisateurTable;
    }

    public void setUtilisateurTable( HtmlScrollableDataTable utilisateurTable ) {
        this.utilisateurTable = utilisateurTable;
    }

=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}