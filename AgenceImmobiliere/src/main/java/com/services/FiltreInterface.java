package com.services;

import java.util.List;

import com.model.Filtre;

public interface FiltreInterface {

    public void creerFiltre( Filtre filtre );

    public void deleteFiltre( int idFiltre );

    public void updateFiltre( Filtre filtre );

    public Filtre getFiltre( int idFiltre );

    public List<Filtre> getAllFiltre();

    public List getALLAnnanceByIdeUser( int idUserRecup );

    public void deleteFiltreByIDUser( int idUserCurent );

}
