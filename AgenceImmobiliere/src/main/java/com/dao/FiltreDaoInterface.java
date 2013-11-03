package com.dao;

import java.util.List;

import com.model.Filtre;

public interface FiltreDaoInterface {

    public void creerFiltre( Filtre filtre );

    public void deleteFiltre( int idFiltre );

    public void updateFiltre( Filtre filtre );

    public Filtre getFiltre( int idFiltre );

    public List<Filtre> getAllFiltre();

    public List getAllFiltreByIdUser( int idUserRecup );

    public void deleteFiltreByIdUser( int idUserCurent );

}
