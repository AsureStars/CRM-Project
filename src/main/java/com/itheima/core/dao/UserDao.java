package com.itheima.core.dao;

import com.itheima.core.po.User;



public interface UserDao {
   User findUser(String useecord , String password);
}
