package com.obabichev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by olegchuikin on 03/07/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }

}

