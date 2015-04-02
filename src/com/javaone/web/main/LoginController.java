package com.javaone.web.main;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by Fred on 2015/3/31.
 */
@Controller
@RequestMapping("/main/")
public class LoginController {

    protected static Logger logger = Logger.getLogger("LoginController");

    @RequestMapping(value = "/login.htm",method = RequestMethod.POST)
    public String loginCheck(){
        logger.debug("Recieved request to login.htm");
        return "welcome";
    }

    @RequestMapping(value = "/register.htm",method = RequestMethod.GET)
    public String registerOp(){
        logger.debug("Recieved request to register.htm");
        return "register";
    }

    @RequestMapping(value = "/registerCheck.htm",method = RequestMethod.POST)
    public String registerChk(){
        logger.debug("Recieved request to registerCheck.htm");
        return "welcome";
    }
}
