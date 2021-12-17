package com.itheima.core.dao;

import com.itheima.core.po.User;
// import org.apache.ibatis.annotation.Param;

public interface UserDao {
   User findUser(String useecord , String password);
}
