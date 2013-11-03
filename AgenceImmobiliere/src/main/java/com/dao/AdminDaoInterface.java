package com.dao;

import java.util.List;

import com.model.Admin;

public interface AdminDaoInterface {

    public List<Admin> findByExample( Admin admin );

    public List<Admin> findByCreteria( String login, Object value );
<<<<<<< HEAD

=======
>>>>>>> 8c63594929b1919f5027131683e9315ed575f7f5
}
