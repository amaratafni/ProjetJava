package com.dao;

import java.util.List;

import com.model.Annonce;

public interface AnnonceDaoInterace {

    public void crieerAnnonce( Annonce annonce );

    public void deleteAnnonce( int idAnnonce );

    public void updateAnnonce( Annonce annonce );

    public Annonce getAnnonce( int idAnnonce );

    @SuppressWarnings( "rawtypes" )
    public List getAllAnnonce();

    // other find by creteria:
    public List<Annonce> findByExample( Annonce annonce );

    public List<Annonce> findByCreteria( String champs, Object value );

}
