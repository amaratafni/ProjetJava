package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdresseDaoInterface;
import com.model.Adresse;

@Service( "adresseService" )
public class AdresseServiceImp implements AdresseInterface {

    @Autowired
    AdresseDaoInterface adresseDaoInterface;

    public AdresseDaoInterface getAdresseDaoInterface() {
        return adresseDaoInterface;
    }

    public void setAdresseDaoInterface( AdresseDaoInterface adresseDaoInterface ) {
        this.adresseDaoInterface = adresseDaoInterface;
    }

    @Override
    public void crieerAdresse( Adresse adresse ) {
        // TODO Auto-generated method stub
        getAdresseDaoInterface().crieerAdresse( adresse );

    }

    @Override
    public void deleteAdresse( int idAdresse ) {
        // TODO Auto-generated method stub
        getAdresseDaoInterface().deleteAdresse( idAdresse );

    }

    @Override
    public void updateAdresse( Adresse adresse ) {
        // TODO Auto-generated method stub
        getAdresseDaoInterface().updateAdresse( adresse );

    }

    @Override
    public Adresse getAdresse( int idAdresse ) {
        // TODO Auto-generated method stub
        return getAdresseDaoInterface().getAdresse( idAdresse );
    }

    @Override
    public List getAllAdresse() {
        // TODO Auto-generated method stub
        return getAdresseDaoInterface().getAllAdresse();
    }

    @Override
    public List<Adresse> findByExample( Adresse adresse ) {
        // TODO Auto-generated method stub
        return getAdresseDaoInterface().findByExample( adresse );
    }

    @Override
    public List<Adresse> findByCreteria( String champs, Object value ) {
        // TODO Auto-generated method stub
        return getAdresseDaoInterface().findByCreteria( champs, value );
    }

}
