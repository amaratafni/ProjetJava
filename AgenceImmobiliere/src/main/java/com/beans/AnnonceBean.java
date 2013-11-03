package com.beans;

<<<<<<< HEAD
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.context.FacesContext;

import org.richfaces.component.html.HtmlScrollableDataTable;
=======
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dao.UtilisateurDaoInterface;
import com.model.Adresse;
import com.model.Annonce;
<<<<<<< HEAD
import com.model.Utilisateur;
import com.services.AdresseInterface;
=======
import com.model.Bien;
import com.model.Utilisateur;
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
import com.services.AnnonceInterface;
import com.services.UtilisateurInterface;

@Controller( "annonceBean" )
@Scope( "session" )
public class AnnonceBean {

<<<<<<< HEAD
    private Annonce                           annonce;
    @Autowired
    UtilisateurInterface                      aInterface;
    @Autowired
    UtilisateurBean                           aBean;
    @Autowired
    AdresseBean                               adresseBean;
    @Autowired
    AdresseInterface                          adresseInterface;
    private int                               currentRow;
    private Annonce                           currentItem;
    private List<Annonce>                     annonceList;
    private transient HtmlScrollableDataTable courseTable;
    @SuppressWarnings( "unused" )
    private SimpleDateFormat                  sysdate;
    private transient HtmlScrollableDataTable annonceTableSup;
    @SuppressWarnings( "unused" )
    private List<Annonce>                     annonceListTestSup;
    private Annonce                           curentCourse;
    @Autowired
    private AnnonceInterface                  annonceInterface;
    @Autowired
    private FileUploadBean                    fileUploadBean;

    public AnnonceBean() {
        annonce = new Annonce();
    }

    public Date getSysdate() {
        return new Date();
    }

    public void setSysdate( SimpleDateFormat sysdate ) {
        this.sysdate = sysdate;
    }

    public HtmlScrollableDataTable getCourseTable() {
        return courseTable;
    }

    public void setCourseTable( HtmlScrollableDataTable courseTable ) {
        this.courseTable = courseTable;
    }
=======
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
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

    public AdresseBean getAdresseBean() {
        return adresseBean;
    }

    public void setAdresseBean( AdresseBean adresseBean ) {
        this.adresseBean = adresseBean;
    }

    @Autowired
    private UtilisateurDaoInterface daoInterface;
<<<<<<< HEAD
    private List<Annonce>           annonceListTest;
=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

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

<<<<<<< HEAD
    /*
     * public void listener( UploadEvent event ) throws Exception { UploadItem
     * item = event.getUploadItem(); byte[] datas = item.getData(); //
     * annonce.setBytes( datas ); // creerAnnonce(); }
     */

    // créer une annonce :
    @SuppressWarnings( { "rawtypes", "unused" } )
    public String creerAnnonce() {

        // je Récupère la date du jour :
        java.util.Date today;
        today = new java.util.Date();
        SimpleDateFormat DateFormat = new SimpleDateFormat( "yyyy-MM-dd" );

        setSysdate( DateFormat );
        System.out.println( "La date d'aujordui est : " + getSysdate() );

        annonce.setDatePublication( getSysdate() );

        /* Je vais récupérer l'utilisateur courant : */
=======
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
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
        Utilisateur aUtili = null;
        List<Utilisateur> aaa = getDaoInterface().findByCreteria( "alias", getaBean().getAlias() );
        for ( Iterator iterator = aaa.iterator(); iterator.hasNext(); ) {
            aUtili = (Utilisateur) iterator.next();
        }

<<<<<<< HEAD
        getaBean().getAnnonces().add( annonce );

        annonce.setUtilisateur( aUtili );

        /* Je vais récupérer l'adresse saisie maintenant courant : */
        Adresse adressAnnonce = new Adresse();

        adressAnnonce.setCartier( getAdresseBean().getCartier() );
        adressAnnonce.setCodePostale( getAdresseBean().getCodePostale() );
        adressAnnonce.setVille( getAdresseBean().getVille() );

        List<Adresse> adressAnnonceList = adresseInterface.findByExample( adressAnnonce );
        for ( Iterator iterator = adressAnnonceList.iterator(); iterator.hasNext(); ) {
            adressAnnonce = (Adresse) iterator.next();
        }

        // le id de adresse pose pb car je l'insére automatiquement oki
        annonce.setAdresse( adressAnnonce );
        fileUploadBean.getDatas();
        annonce.setBytes( fileUploadBean.getDatas() );
        annonceInterface.crieerAnnonce( annonce );
        return "succesAjoueAnnotation";
    }

    @SuppressWarnings( { "rawtypes" } )
    public void annulerInsertionAdresse() throws IOException {

        Adresse adressAnnonce = new Adresse();

        adressAnnonce.setCartier( getAdresseBean().getCartier() );
        adressAnnonce.setCodePostale( getAdresseBean().getCodePostale() );
        adressAnnonce.setVille( getAdresseBean().getVille() );
        Adresse testAdresseExistance = null;

        List<Adresse> adressAnnonceList = adresseInterface.findByExample( adressAnnonce );
        for ( Iterator iterator = adressAnnonceList.iterator(); iterator.hasNext(); ) {
            testAdresseExistance = (Adresse) iterator.next();
        }

        //

        if ( getAdresseBean().isExiste() == false ) {

            adresseInterface.deleteAdresse( testAdresseExistance.getIdAdresse() );

        }
        FacesContext.getCurrentInstance().getExternalContext().redirect( "acceuilUtilisateur.jsf" );
    }

    public String viewNew() {
        setCurentCourse( new Annonce() );
        return "detail";
    }

    @SuppressWarnings( "unchecked" )
    public String viewDetail() {
        List<Annonce> valueList = (List<Annonce>) courseTable.getValue();
        Iterator<Object> keys = courseTable.getSelection().getKeys();
        if ( keys.hasNext() ) {
            curentCourse = valueList.get( ( (Integer) keys.next() ).intValue() );
            // ici il retur detaill que j'ai defini ds faces config pour aller a
            // une autre page.
            return "detail";
        } else {
            return null;
        }

    }

    @SuppressWarnings( "unchecked" )
    public String viewDetailSupprimerAnnonce() {
        List<Annonce> valueList = (List<Annonce>) annonceTableSup.getValue();
        Iterator<Object> keys = annonceTableSup.getSelection().getKeys();
        if ( keys.hasNext() ) {
            curentCourse = valueList.get( ( (Integer) keys.next() ).intValue() );
            // ici il retur detaill que j'ai defini ds faces config pour aller a
            // une autre page.
            return "detailPageSupAnnonce";
        } else {
            return null;
        }

    }

    @SuppressWarnings( "rawtypes" )
    public String deleteAnnonce() {

        annonceInterface.deleteAnnonceByID( curentCourse.getIdAnnonce() );
        // je vais supprimer son adresse :
        List annonceRestantes = annonceInterface.getALLAnnanceByIdAdress(
                curentCourse.getAdresse().getIdAdresse() );

        if ( annonceRestantes.isEmpty() ) {
            getAdresseBean().getAdresseInterface().deleteAdresse( curentCourse.getAdresse().getIdAdresse() );
        }
        return "suppressionFiltre";
    }

    public String update() {
        annonceInterface.updateAnnonce( curentCourse );
        // init();
        return null;
    }

    /*
     * @PostConstruct private void init() {
     * 
     * }
     */

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow( int currentRow ) {
        this.currentRow = currentRow;
    }

    public Annonce getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem( Annonce currentItem ) {
        this.currentItem = currentItem;
    }

    /*********************************************************************************/

    // **********************************************************

    public Annonce getCurentCourse() {
        return curentCourse;
    }

    public void setCurentCourse( Annonce curentCourse ) {
        this.curentCourse = curentCourse;
    }

    @SuppressWarnings( { "unchecked", "rawtypes" } )
    public List<Annonce> getAnnonceList() {
        annonceListTest = null;
        // je vai faire la restriction sur annonceList :
        Annonce ab = new Annonce();
        Utilisateur aUtili = null;
        List<Utilisateur> aaa = getDaoInterface().findByCreteria( "alias", getaBean().getAlias() );
        for ( Iterator iterator = aaa.iterator(); iterator.hasNext(); ) {
            aUtili = (Utilisateur) iterator.next();
        }

        ab.setUtilisateur( aUtili );
        // System.out.println( "Le id user " + aUtili.getIdUser() );

        annonceList = annonceInterface.getAllAnnonce();

        for ( Iterator iterator = annonceList.iterator(); iterator.hasNext(); ) {
            ab = (Annonce) iterator.next();
            if ( ab.getUtilisateur().getIdUser() == 1 ) {
                System.out.println( "ihouuuuuuuuuuuuuuuuuuu" + ab.getTitre() );
                ab = annonceInterface.getAnnonce( ab.getIdAnnonce() );
                annonceListTest.add( ab );
            }
        }
        return annonceListTest;
    }

    public void setAnnonceList( List<Annonce> annonceList ) {
        this.annonceList = annonceList;
    }

    @SuppressWarnings( "rawtypes" )
    public List<Annonce> getAnnonceListTest() {
        // annonceListTest = null;
        // je vai faire la restriction sur annonceList :
        Annonce ab = new Annonce();
        Utilisateur aUtili = null;
        List<Utilisateur> aaa = getDaoInterface().findByCreteria( "alias", getaBean().getAlias() );
        for ( Iterator iterator = aaa.iterator(); iterator.hasNext(); ) {
            aUtili = (Utilisateur) iterator.next();
        }

        ab.setUtilisateur( aUtili );
        System.out.println( "Le id user " + aUtili.getIdUser() );

        annonceListTest = annonceInterface.findByCreteria( "utilisateur", aUtili );

        for ( Iterator iterator = annonceListTest.iterator(); iterator.hasNext(); ) {
            ab = (Annonce) iterator.next();
            if ( ab.getUtilisateur().getIdUser() == 1 ) {
                System.out.println( "ihouuuuuuuuuuuuuuuuuuu" + ab.getTitre() );
                ab = annonceInterface.getAnnonce( ab.getIdAnnonce() );
                // annonceListTest=
            }
        }

        return annonceListTest;
    }

    public void setAnnonceListTest( List<Annonce> annonceListTest ) {
        this.annonceListTest = annonceListTest;
    }

    public HtmlScrollableDataTable getAnnonceTableSup() {
        return annonceTableSup;
    }

    public void setAnnonceTableSup( HtmlScrollableDataTable annonceTableSup ) {
        this.annonceTableSup = annonceTableSup;
    }

    @SuppressWarnings( { "rawtypes", "unchecked" } )
    public List<Annonce> getAnnonceListTestSup() {

        Utilisateur aUtili = null;
        List<Utilisateur> aaa = getDaoInterface().findByCreteria( "alias", getaBean().getAlias() );
        for ( Iterator iterator = aaa.iterator(); iterator.hasNext(); ) {
            aUtili = (Utilisateur) iterator.next();
        }

        int idUserRecup = aUtili.getIdUser();

        List annonceList = annonceInterface.getALLAnnanceByIdeUser( idUserRecup );

        return annonceList;
    }

    public void setAnnonceListTestSup( List<Annonce> annonceListTestSup ) {
        this.annonceListTestSup = annonceListTestSup;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce( Annonce annonce ) {
        this.annonce = annonce;
    }
=======
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
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5

}
