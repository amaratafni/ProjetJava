package com.services;

import java.util.List;

import com.model.Admin;

public interface AdminInterface {

    public List<Admin> findByExample( Admin admin );

    public List<Admin> findByCreteria( String login, Object value );
}
