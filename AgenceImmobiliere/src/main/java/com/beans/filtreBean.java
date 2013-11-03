package com.beans;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.richfaces.component.html.HtmlScrollableDataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.dao.UtilisateurDaoInterface;
import com.model.Filtre;
import com.model.Utilisateur;
import com.services.FiltreInterface;

@Controller( "filtreBean" )
@Scope( "session" )
public class filtreBean {

    private Utilisateur                       utilisateur;
    private String                            typeAnnonce;
    private String                            typeBien;
    private String                            localisationBien;
    private Date                              datePublication;
    private Integer                           nbPiece;

    private Integer                           intervalPrix;
    private Integer                           intervalSurface;

    private String                            termeDescription;
    private Boolean                           etatFiltre;
    // les champs pour afficher les filtres de cette user :
    @SuppressWarnings( "unused" )
    private List<Filtre>                      filtreList;
    private transient HtmlScrollableDataTable filtreTable;
    private transient HtmlScrollableDataTable filtreTablSup;
    private List<Filtre>                      filtreListSup;

    public HtmlScrollableDataTable getFiltreTablSup() {
        return filtreTablSup;
    }

    public void setFiltreTablSupe( HtmlScrollableDataTable filtreTablSup ) {
        this.filtreTablSup = filtreTablSup;
    }

    public List<Filtre> getFiltreListSup() {

        Utilisateur aUtili = null;
        List<Utilisateur> aaa = getDaoInterface().findByCreteria( "alias", getaUtilisateurBean().getAlias() );
        for ( Iterator iterator = aaa.iterator(); iterator.hasNext(); ) {
            aUtili = (Utilisateur) iterator.next();
        }

        int idUserRecup = aUtili.getIdUser();

        List filtreList = getaFiltreInterface().getALLAnnanceByIdeUser( idUserRecup );

        return filtreList;

    }

    public void setFiltreListSup( List<Filtre> filtreListSup ) {
        this.filtreListSup = filtreListSup;
    }

    public HtmlScrollableDataTable getFiltreTableSup() {
        return filtreTableSup;
    }

    public void setFiltreTableSup( HtmlScrollableDataTable filtreTableSup ) {
        this.filtreTableSup = filtreTableSup;
    }

    private transient HtmlScrollableDataTable filtreTableSup;
    private Filtre                            curentFiltre;
    @Autowired
    private UtilisateurDaoInterface           daoInterface;

    public UtilisateurDaoInterface getDaoInterface() {
        return daoInterface;
    }

    public void setDaoInterface( UtilisateurDaoInterface daoInterface ) {
        this.daoInterface = daoInterface;
    }

    // le DAO de filtre :
    @Autowired
    FiltreInterface aFiltreInterface;

    @SuppressWarnings( { "rawtypes", "unchecked" } )
    public List<Filtre> getFiltreList() {

        Utilisateur aUtili = null;
        List<Utilisateur> aaa = getDaoInterface().findByCreteria( "alias", getaUtilisateurBean().getAlias() );
        for ( Iterator iterator = aaa.iterator(); iterator.hasNext(); ) {
            aUtili = (Utilisateur) iterator.next();
        }

        int idUserRecup = aUtili.getIdUser();

        List filtreList = getaFiltreInterface().getALLAnnanceByIdeUser( idUserRecup );

        return filtreList;
    }

    public void setFiltreList( List<Filtre> filtreList ) {
        this.filtreList = filtreList;
    }

    public HtmlScrollableDataTable getFiltreTable() {
        return filtreTable;
    }

    public void setFiltreTable( HtmlScrollableDataTable filtreTable ) {
        this.filtreTable = filtreTable;
    }

    public FiltreInterface getaFiltreInterface() {
        return aFiltreInterface;
    }

    public void setaFiltreInterface( FiltreInterface aFiltreInterface ) {
        this.aFiltreInterface = aFiltreInterface;
    }

    // utilisateur interface
    @Autowired
    UtilisateurBean aUtilisateurBean;

    public UtilisateurBean getaUtilisateurBean() {
        return aUtilisateurBean;
    }

    public void setaUtilisateurBean( UtilisateurBean aUtilisateurBean ) {
        this.aUtilisateurBean = aUtilisateurBean;
    }

    /* Methode 1 création du Filtre : */
    public String creerFiltre() {

        Filtre aFiltre = new Filtre();
        aFiltre.setTypeAnnonce( getTypeAnnonce() );
        aFiltre.setTypeBien( getTypeBien() );
        aFiltre.setLocalisationBien( getLocalisationBien() );
        aFiltre.setDatePublication( getDatePublication() );
        aFiltre.setNbPiece( getNbPiece() );
        aFiltre.setIntervalPrix( getIntervalPrix() );
        aFiltre.setIntervalSurface( getIntervalSurface() );
        aFiltre.setTermeDescription( getTermeDescription() );
        aFiltre.setEtatFiltre( true );
        // je vais Récupérer l'id de l'utilisateur : (car il y a une clé
        // etrangère):
        String alias = getaUtilisateurBean().getAlias();

        List<Utilisateur> aUtilisateur = getaUtilisateurBean().getUtilisateurInterface().findByCreteria( "alias",
                alias );
        /*
         * j'ai met le l'index à 0 car je sais que il va juste revenir un seule
         * element
         */
        aFiltre.setUtilisateur( aUtilisateur.get( 0 ) );

        /*
         * Je valide mon insertion dans la BD:* /
         */
        getaFiltreInterface().creerFiltre( aFiltre );
        return "succesAjoueAnnotation";
    }

    /* methode pour modfier filtre : */
    @SuppressWarnings( "unchecked" )
    public String viewDetail() {
        List<Filtre> valueList = (List<Filtre>) filtreTable.getValue();
        Iterator<Object> keys = filtreTable.getSelection().getKeys();
        if ( keys.hasNext() ) {
            curentFiltre = valueList.get( ( (Integer) keys.next() ).intValue() );

            return "detailFiltre";
        } else {
            return null;
        }
    }

    @SuppressWarnings( "unchecked" )
    public String viewDetailSuuprimerFiltre() {
        List<Filtre> valueList = (List<Filtre>) filtreTableSup.getValue();
        Iterator<Object> keys = filtreTableSup.getSelection().getKeys();
        if ( keys.hasNext() ) {
            curentFiltre = valueList.get( ( (Integer) keys.next() ).intValue() );

            return "detailFiltreSupprimer";
        } else {
            return null;
        }
    }

    /* c'est pour update : */
    public String update() {
        getaFiltreInterface().updateFiltre( curentFiltre );

        return null;
    }

    /* methpde supprimer filtre : */
    public String deleteFiltre() {

        getaFiltreInterface().deleteFiltre( getCurentFiltre().getIdFiltre() );

        return "supprimerFiltre";
    }

    public Filtre getCurentFiltre() {
        return curentFiltre;
    }

    public void setCurentFiltre( Filtre curentFiltre ) {
        this.curentFiltre = curentFiltre;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur( Utilisateur utilisateur ) {
        this.utilisateur = utilisateur;
    }

    public String getTypeAnnonce() {
        return typeAnnonce;
    }

    public void setTypeAnnonce( String typeAnnonce ) {
        this.typeAnnonce = typeAnnonce;
    }

    public String getTypeBien() {
        return typeBien;
    }

    public void setTypeBien( String typeBien ) {
        this.typeBien = typeBien;
    }

    public String getLocalisationBien() {
        return localisationBien;
    }

    public void setLocalisationBien( String localisationBien ) {
        this.localisationBien = localisationBien;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication( Date datePublication ) {
        this.datePublication = datePublication;
    }

    public Integer getNbPiece() {
        return nbPiece;
    }

    public void setNbPiece( Integer nbPiece ) {
        this.nbPiece = nbPiece;
    }

    public Integer getIntervalPrix() {
        return intervalPrix;
    }

    public void setIntervalPrix( Integer intervalPrix ) {
        this.intervalPrix = intervalPrix;
    }

    public Integer getIntervalSurface() {
        return intervalSurface;
    }

    public void setIntervalSurface( Integer intervalSurface ) {
        this.intervalSurface = intervalSurface;
    }

    public String getTermeDescription() {
        return termeDescription;
    }

    public void setTermeDescription( String termeDescription ) {
        this.termeDescription = termeDescription;
    }

    public Boolean getEtatFiltre() {
        return etatFiltre;
    }

    public void setEtatFiltre( Boolean etatFiltre ) {
        this.etatFiltre = etatFiltre;
    }

}
