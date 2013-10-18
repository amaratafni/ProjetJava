package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDaoInterface;
import com.model.Admin;

@Service( "adminService" )
public class AdminServiceImp implements AdminInterface {

    @Autowired
    private AdminDaoInterface adminDAO;

    public AdminDaoInterface getAdminDAO() {
        return adminDAO;
    }

    @Override
    public List<Admin> findByExample( Admin admin ) {
        return getAdminDAO().findByExample( admin );
    }

    @Override
    public List<Admin> findByCreteria( String val, Object value ) {
        return getAdminDAO().findByCreteria( val, value );
    }

}
