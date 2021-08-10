package com.stefan.blog.controller;

import com.stefan.blog.business.UserLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@Configuration
public class LoginController {

    @Autowired
    UserLogin userLogin;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getLoginPage() {
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String getWelcomePage(@RequestParam String name,@RequestParam String password, ModelMap modelMap) {

        if(!userLogin.ifUserValid(name,password)) {   //登陆不成功时返回登陆页面
            modelMap.put("invalidation","Invalidate Info");
            return "login";
        }

        modelMap.put("name",name);
        return "welcome";           //登陆成功直接进入欢迎页面
    }
}
