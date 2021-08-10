package com.stefan.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class PostController {

    @RequestMapping(value = "/post" ,method = RequestMethod.GET)
    public String doPost() {
        return "post";
    }

    @RequestMapping(value = "/post" , method = RequestMethod.POST)
    public String reviewPost(@RequestParam String title , @RequestParam String body,ModelMap modelMap ) {

        modelMap.put("title",title);
        modelMap.put("body",body);

        modelMap.put("date",new Date());
        return "reviewPost";
    }

}
