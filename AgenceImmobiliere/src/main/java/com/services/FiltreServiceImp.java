package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FiltreDaoInterface;
import com.model.Filtre;

@Service( "filtreService" )
public class FiltreServiceImp implements FiltreInterface {
    @Autowired
    FiltreDaoInterface filtreDaoInterface;

    @Override
    public void creerFiltre( Filtre filtre ) {
        getFiltreDaoInterface().creerFiltre( filtre );
    }

    @Override
    public void deleteFiltre( int idFiltre ) {
        getFiltreDaoInterface().deleteFiltre( idFiltre );

    }

    @Override
    public void updateFiltre( Filtre filtre ) {
        // TODO Auto-generated method stub
        getFiltreDaoInterface().updateFiltre( filtre );
    }

    @Override
    public Filtre getFiltre( int idFiltre ) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Filtre> getAllFiltre() {
        // TODO Auto-generated method stub
        return null;
    }

    public FiltreDaoInterface getFiltreDaoInterface() {
        return filtreDaoInterface;
    }

    public void setFiltreDaoInterface( FiltreDaoInterface filtreDaoInterface ) {
        this.filtreDaoInterface = filtreDaoInterface;
    }

    @Override
    public List getALLAnnanceByIdeUser( int idUserRecup ) {

        return getFiltreDaoInterface().getAllFiltreByIdUser( idUserRecup );
    }

    @Override
    public void deleteFiltreByIDUser( int idUserCurent ) {
        getFiltreDaoInterface().deleteFiltreByIdUser( idUserCurent );

    }

}
