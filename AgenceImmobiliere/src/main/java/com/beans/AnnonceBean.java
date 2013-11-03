package com.beans;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dao.UtilisateurDaoInterface;
import com.model.Adresse;
import com.model.Annonce;
import com.model.Bien;
import com.model.Utilisateur;
import com.services.AnnonceInterface;
import com.services.UtilisateurInterface;

@Controller( "annonceBean" )
@Scope( "session" )
public class AnnonceBean {

    @Autowired
    AnnonceInterface      annonceInterface;
    @Autowired
    UtilisateurInterface  aInterface;
    @Autowired
    UtilisateurBean       aBean;
    @Autowired
    AdresseBean           adresseBean;

    private int           idAnnonce;
    private Bien          bien;
    private Utilisateur   utilisateur;
    private Adresse       adresse;
    private String        typeBien;
    private String        typeAnnonce;
    private String        titre;
    private Integer       surface;
    private Integer       surfaceCarry;
    private String        description;
    private String        classeEnergitique;
    private String        email;
    private Integer       numTel;
    private Integer       prix;
    private Date          datePublication;
    private List<Annonce> listAnonce;
    LinkedList            listeChainee = new LinkedList();

    public AdresseBean getAdresseBean() {
        return adresseBean;
    }

    public void setAdresseBean( AdresseBean adresseBean ) {
        this.adresseBean = adresseBean;
    }

    @Autowired
    private UtilisateurDaoInterface daoInterface;

    public UtilisateurDaoInterface getDaoInterface() {
        return daoInterface;
    }

    public void setDaoInterface( UtilisateurDaoInterface daoInterface ) {
        this.daoInterface = daoInterface;
    }

    // le service
    public UtilisateurInterface getaInterface() {
        return aInterface;
    }

    public void setaInterface( UtilisateurInterface aInterface ) {
        this.aInterface = aInterface;
    }

    public UtilisateurBean getaBean() {
        return aBean;
    }

    public void setaBean( UtilisateurBean aBean ) {
        this.aBean = aBean;
    }

    // créer une annonce :
    public void creerAnnonce() {

        // attention vérifier d'abord le macha (declencher une annonce oki...)
        // attention insérer d'abord l'adresse ensuire je vai insérer les autres
        // info a propos de ...l'annonce

        Adresse adres = new Adresse();
        adres.setCartier( "paris" );
        adres.setCodePostale( 931200 );
        adres.setVille( "parisss" );
        adres.setIdAdresse( 0 );
        Annonce a = new Annonce();
        a.setBien( getBien() );
        a.setClasseEnergitique( getClasseEnergitique() );
        a.setDatePublication( getDatePublication() );
        a.setDescription( getDescription() );
        a.setEmail( getEmail() );
        a.setNumTel( getNumTel() );
        a.setPrix( getPrix() );
        a.setSurface( getSurface() );
        a.setSurfaceCarry( getSurfaceCarry() );
        a.setTitre( getTitre() );
        a.setTypeAnnonce( getTypeAnnonce() );
        a.setTypeBien( getTypeBien() );
        a.setBien( null );
        // Utilisateur aziz =
        // getaBean().getUtilisateurInterface().getUtilisateur(
        // getaBean().getIdUser() );
        Utilisateur aUtili = null;
        List<Utilisateur> aaa = getDaoInterface().findByCreteria( "alias", getaBean().getAlias() );
        for ( Iterator iterator = aaa.iterator(); iterator.hasNext(); ) {
            aUtili = (Utilisateur) iterator.next();
        }

        a.setUtilisateur( aUtili );
        System.out.println( "voilà la ville que j'ai saisie : " + getAdresseBean().getVille() );

        // a.setAdresse( adres );
        // getAnnonceInterface().crieerAnnonce( a );
        Adresse adddd = new Adresse();
        adddd.setCartier( getAdresseBean().getCartier() );
        adddd.setCodePostale( getAdresseBean().getCodePostale() );
        adddd.setVille( getAdresseBean().getVille() );
        listAnonce.add( a );
        // adddd.setAnnonces();
        // getAdresseBean().
        a.setAdresse( adddd );
        // pb : pour créer une annonce il faut ajouter adresse et bien, tq le
        // bien peut etre null...
        getAnnonceInterface().crieerAnnonce( a );
    }

    public void suprimerAnnonce() {

    }

    public void modifierAnnonce() {

    }

    // pour la recherche je vais réflichir comment le faire :
    public List<Annonce> rechercheAnnonce() {

        return null;

    }

    public AnnonceInterface getAnnonceInterface() {
        return annonceInterface;
    }

    public void setAnnonceInterface( AnnonceInterface annonceInterface ) {
        this.annonceInterface = annonceInterface;
    }

    public int getIdAnnonce() {
        return idAnnonce;
    }

    public void setIdAnnonce( int idAnnonce ) {
        this.idAnnonce = idAnnonce;
    }

    public Bien getBien() {
        return bien;
    }

    public void setBien( Bien bien ) {
        this.bien = bien;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur( Utilisateur utilisateur ) {
        this.utilisateur = utilisateur;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse( Adresse adresse ) {
        this.adresse = adresse;
    }

    public String getTypeBien() {
        return typeBien;
    }

    public void setTypeBien( String typeBien ) {
        this.typeBien = typeBien;
    }

    public String getTypeAnnonce() {
        return typeAnnonce;
    }

    public void setTypeAnnonce( String typeAnnonce ) {
        this.typeAnnonce = typeAnnonce;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre( String titre ) {
        this.titre = titre;
    }

    public Integer getSurface() {
        return surface;
    }

    public void setSurface( Integer surface ) {
        this.surface = surface;
    }

    public Integer getSurfaceCarry() {
        return surfaceCarry;
    }

    public void setSurfaceCarry( Integer surfaceCarry ) {
        this.surfaceCarry = surfaceCarry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public String getClasseEnergitique() {
        return classeEnergitique;
    }

    public void setClasseEnergitique( String classeEnergitique ) {
        this.classeEnergitique = classeEnergitique;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Integer getNumTel() {
        return numTel;
    }

    public void setNumTel( Integer numTel ) {
        this.numTel = numTel;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix( Integer prix ) {
        this.prix = prix;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication( Date datePublication ) {
        this.datePublication = datePublication;
    }
    // for ajax oki :

}
