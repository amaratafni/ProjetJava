package com.dao;

import java.util.List;

import com.model.Admin;

public interface AdminDaoInterface {

    public List<Admin> findByExample( Admin admin );

    public List<Admin> findByCreteria( String login, Object value );

}
