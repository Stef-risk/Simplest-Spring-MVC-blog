package com.stefan.blog.business;

import com.stefan.blog.repository.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogin {      //预存用户名与密码为用户登录提供验证

    @Autowired
    UserInfo user;

    public boolean ifUserValid(String name,String password) {
        return user.validate(name,password);
    }

}
