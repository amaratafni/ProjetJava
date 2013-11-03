package com.services;

import java.util.List;

import com.model.Adresse;

public interface AdresseInterface {
    public void crieerAdresse( Adresse adresse );

    public void deleteAdresse( int idAdresse );

    public void updateAdresse( Adresse adresse );

    public Adresse getAdresse( int idAdresse );

    @SuppressWarnings( "rawtypes" )
    public List getAllAdresse();

    public List<Adresse> findByExample( Adresse adresse );

    public List<Adresse> findByCreteria( String login, Object value );

}
