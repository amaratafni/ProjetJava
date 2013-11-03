package com.beans;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Adresse;
import com.model.Utilisateur;

@Controller( "scriptInsertBean" )
@Scope( "session" )
public class ScriptInsert {

    // je récupère les bean :
    @Autowired
    AdresseBean     adresseBean;
    @Autowired
    AnnonceBean     annonceBean;
    @Autowired
    UtilisateurBean utilisateurBean;

    /* Mes variable User */
    String          aliasUser;
    String          name;
    String          prenomUser;
    String          email;
    Date            date;
    ScriptInsert    aScriptInsert;
    Boolean         etat = true;

    public String getAliasUser() {

        return aScriptInsert.genereAlias();

    }

    public void setAliasUser( String aliasUser ) {
        this.aliasUser = aliasUser;
    }

    public String getName() {
        return aScriptInsert.genereNoms();
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPrenomUser() {
        return aScriptInsert.generePrenom();
    }

    public void setPrenomUser( String prenomUser ) {
        this.prenomUser = prenomUser;
    }

    public String getEmail() {
        return aScriptInsert.genereEmail();
    }

    public void setEmail( String email ) {
        this.email = email;
    }

    public Date getDate() {

        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

    public Boolean getEtat() {
        etat = true;
        return etat;
    }

    public void setEtat( Boolean etat ) {
        this.etat = etat;
    }

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

    public UtilisateurBean getUtilisateurBean() {
        return utilisateurBean;
    }

    public void setUtilisateurBean( UtilisateurBean utilisateurBean ) {
        this.utilisateurBean = utilisateurBean;
    }

    /* Mes tableau */
    String[] alias        = { "adrien", "alex", "fred", "laurent", "lyes", "ghani", "benjamin", "joseph",
                          "amine",
                          "brahim", "jugortha", "imane", "michel", "axil", "adel", "mourice", "stephane",
                          "clement",
                          "jérome",
                          "karim", "steve", "arnold", "keven", "roonie" };
    String[] prenom       = { "adrien", "alex", "fred", "laurent", "lyes", "ghani", "benjamin", "joseph",
                          "amine",
                          "brahim", "jugortha", "imane", "michel", "axil", "adel", "mourice", "stephane",
                          "clement",
                          "jérome",
                          "karim", "steve", "arnold", "keven", "roonie" };
    String[] noms         = { "lebois", "leblanc", "deschamps", "luisier", "chappelle", "dubois", "thomas",
                          "roux",
                          "durand",
                          "leroy", "moreau", "morel", "girard", "mercier", "bertrand", "fournier", "bonnet",
                          "lefevre",
                          "blanc", "fontaine", "chevalier", "robin", "morin", "faure", "garnier", "perrin",
                          "dumont",
                          "gauthier" };

    String   domaines[]   = { "yahoo.fr", "hotmail.fr", "google.com", "aol.com" };

    String[] type_annonce = { "location", "vente" };
    String[] type_bien    = { "maison", "appartement", "terrain", "parking" };
    String[] titre        = { "First annonce", "seconde Annonce", "bon affaire", "pas mal" };
    String[] cle          = { "A", "B", "C", "D", "E", "F", "G" };
    String[] villes       = { "paris", "nice", "marseille", "lyon", "lille", "brest", "montpellier" };
    int[]    cps          = { 75000, 06000, 13000, 69000, 59000, 29200, 34000 };
    String[] cartiers     = { "rue lafayette", "rue saint martin", "rue des martires", "bd saint michel",
                          "rue de la chappelle" };
    String[] telephone    = { "1021454451", "9999999999", "0652805478", "0652805477", "0652805477" };

    public ScriptInsert() {

    }

    // 1
    public String genererAnnonces() {

        String valAnnonce = type_annonce[(int) ( Math.random() * 2 )];
        System.out.println( valAnnonce );
        return valAnnonce;
    }

    // 2
    public String gernereBien() {
        String valBien = type_bien[(int) ( Math.random() * 4 )];
        System.out.println( valBien );
        return valBien;
    }

    // 3
    public int gernereSurface() {
        int valsurface = (int) ( Math.random() * 250 );
        System.out.println( valsurface );
        return valsurface;
    }

    // le prix pose un pb car il doi commencer de 400 euro oki...
    // il faut trouver qui'l commence de 400 euro par exmeple
    public int gernerePrix() {
        int pri = (int) ( Math.random() * 250 );
        System.out.println( pri );
        return pri;
    }

    public int gernereSurfaceCare() {
        int valsurfaceCare = (int) ( Math.random() * 250 );
        System.out.println( valsurfaceCare );
        return valsurfaceCare;
    }

    // 4
    public String generePrenom() {
        String valPr = prenom[(int) ( Math.random() * 24 )];
        System.out.println( valPr );
        return valPr;
    }

    public String genereAlias() {
        String valAlias = alias[(int) ( Math.random() * 24 )];
        System.out.println( valAlias );
        return valAlias;
    }

    // 5
    public String genereNoms() {
        String valNom = noms[(int) ( Math.random() * 28 )];
        System.out.println( valNom );
        return valNom;
    }

    // 6
    public String genereDomaine() {
        String valDomaine = domaines[(int) ( Math.random() * 4 )];

        return valDomaine;
    }

    // 7
    public String genereEmail() {
        ScriptInsert a = new ScriptInsert();
        String prenom = a.generePrenom();
        String mail = prenom.concat( "@" + a.genereDomaine() );
        System.out.println( mail );
        return mail;
    }

    // 8
    public String genereCartier() {
        String cartier = cartiers[(int) ( Math.random() * 4 )];
        System.out.println( cartier );
        return cartier;
    }

    // 9
    public String genereVilles() {
        String ville = villes[(int) ( Math.random() * 7 )];
        System.out.println( ville );
        return ville;
    }

    // 10
    public int genereCpc() {
        int cp = cps[(int) ( Math.random() * 7 )];
        System.out.println( cp );
        return cp;
    }

    // 11
    public String genereCle() {
        String cl = cle[(int) ( Math.random() * 7 )];
        System.out.println( cl );
        return cl;
    }

    private String genereTelephone() {

        String tel = telephone[(int) ( Math.random() * 5 )];
        System.out.println( tel );
        return tel;
    }

    private String genereTitreAnn() {

        String tit = titre[(int) ( Math.random() * 5 )];
        return tit;
    }

    public void inserer() {
        /* Insérer un utilisateur : */
        Utilisateur aUtilisateur = new Utilisateur();
        aUtilisateur.setAlias( genereAlias() );
        aUtilisateur.setEmail( genereEmail() );
        aUtilisateur.setName( genereNoms() );
        aUtilisateur.setPrenom( generePrenom() );
        aUtilisateur.setEtat( true );
        // accé BD :
        getUtilisateurBean().getUtilisateurInterface().crieerUtilisateur( aUtilisateur );
        /* insérer Adresse : */
        Adresse adresse = new Adresse();
        adresse.setVille( genereVilles() );
        adresse.setCartier( genereCartier() );
        adresse.setCodePostale( genereCpc() );
        /* Je test est ce que elle existe en BD : */
        /* je récupère tout les adresses en BD : */
        List<Adresse> listadresse = getAdresseBean().getAdresseInterface().getAllAdresse();
        for ( Iterator iterator = listadresse.iterator(); iterator.hasNext(); ) {
            Adresse adresse2 = (Adresse) iterator.next();
        }

    }

    /*
     * public static void main( String[] args ) {
     * 
     * int booucle = 2000; for ( int i = 0; i < booucle; i++ ) { ScriptInsert a
     * = new ScriptInsert();
     * 
     * User : String alias = a.genereAlias(); String name = a.genereNoms();
     * String prenom = a.generePrenom(); String email = a.genereEmail(); Date
     * date = new Date(); Boolean etat = true;
     * 
     * je récupère Utilisateur
     * 
     * Annonce String type_B = a.gernereBien(); String type_An =
     * a.genererAnnonces(); String titre_A = a.genereTitreAnn(); int surface =
     * a.gernereSurface(); int surfaceCare = a.gernereSurfaceCare(); //
     * description je vais laisser null oki... String calsseEnergitique =
     * a.genereCle(); String emai = a.genereEmail(); String nulTel =
     * a.genereTelephone();// ça pose pb car en base doné c // int. int prix =
     * a.gernerePrix(); // date pub je pense je vais la laisser null pour
     * l'instant : // et il faut que je récupére l'id de l'adresse.... // et lid
     * de user
     * 
     * Adresse :
     * 
     * String vill = a.genereVilles(); String cart = a.genereCartier();
     * a.genereCle(); int codeP = a.genereCpc();
     * 
     * }
     * 
     * }
     */
}
