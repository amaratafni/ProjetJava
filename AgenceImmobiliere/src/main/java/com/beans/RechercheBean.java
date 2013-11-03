package com.beans;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.swing.ImageIcon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.model.Annonce;
import com.model.File;
import com.services.AnnonceInterface;

@Controller( "rechercheBean" )
@Scope( "session" )
public class RechercheBean {

    private Annonce               annonce;
    @Autowired
    private AnnonceInterface      annonceInterface;
    private Annonce               annonceRecherche;
    private ImageIcon             img;
    private File                  file;
    @Autowired
    AnnonceBean                   annonceBean;
    private ByteArrayOutputStream b;

    // le constructeur
    public RechercheBean() {
        annonce = new Annonce();
    }

    public String recherche() {

        Annonce aAnnonce = new Annonce();
        aAnnonce.setAdresse( annonce.getAdresse() );
        System.out.println( "l'adresse que j'ai saisie est : " + annonce.getAdresse() );
        aAnnonce.setTypeBien( annonce.getTypeBien() );
        System.out.println( "Le type du bien  que j'ai saisie est : " + annonce.getTypeBien() );
        annonceInterface.getAllAnnonce();
        List<Annonce> aAnnonceCorespondante = annonceInterface.findByExample( aAnnonce );

        for ( Iterator iterator = aAnnonceCorespondante.iterator(); iterator.hasNext(); ) {
            annonceRecherche = (Annonce) iterator.next();
            System.out.println( "je suis dans la recherche : " + annonceRecherche.getTitre() );
        }

        setImg( new ImageIcon( annonceRecherche.getBytes() ) );
        byte[] bAvatar = annonceRecherche.getBytes();
        file = new File();
        file.setData( bAvatar );
        file.setName( "test.gif" );
        /*
         * file = new File(); file.setData( bAvatar ); file.setName( "test.gif"
         * ); try { FileOutputStream fos = new FileOutputStream( "F:/test.gif"
         * ); fos.write( bAvatar ); fos.close(); } catch ( Exception e ) {
         * e.printStackTrace(); }
         */
        // annonceRecherche.getBytes();

        return "resultatRecherche";
    }

    public void paint( OutputStream stream, Object object ) throws IOException {
        stream.write( getFile().getData() );
    }

    public Annonce getAnnonceRecherche() {
        return annonceRecherche;
    }

    public void setAnnonceRecherche( Annonce annonceRecherche ) {
        this.annonceRecherche = annonceRecherche;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg( ImageIcon img ) {
        this.img = img;
    }

    public ByteArrayOutputStream getB() {
        return b;
    }

    public void setB( ByteArrayOutputStream b ) {
        this.b = b;
    }

    public Annonce getAnnonce() {
        return annonce;
    }

    public void setAnnonce( Annonce annonce ) {
        this.annonce = annonce;
    }

    public AnnonceBean getAnnonceBean() {
        return annonceBean;
    }

    public void setAnnonceBean( AnnonceBean annonceBean ) {
        this.annonceBean = annonceBean;
    }

    public File getFile() {
        return file;
    }

    public void setFile( File file ) {
        this.file = file;
    }

}
