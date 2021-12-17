package com.itheima.core.service.impl;
/**
 * 用户Service接口实现类
 */

import com.itheima.core.dao.UserDao;
import com.itheima.core.po.User;
import com.itheima.core.service.UserService;

import java.beans.Transient;


//@Service("userService")
//@Transientional;
public class UserServiceImpl implements UserService {
    //注入USerDao
   // @Autowired
    private UserDao userDao;
    @Override
    public User findUser(String usercord, String password) {
        User user = this.findUser(usercord, password);
        return user;
    }
}
