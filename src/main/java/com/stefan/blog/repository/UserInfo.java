package com.stefan.blog.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserInfo {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate(String name, String password) {
        if(name.equals("stefan")&&password.equals("elder")) {
            return true;
        }

        return false;
    }
}
