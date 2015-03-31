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

    protected static Logger logger = Logger.getLogger("LoginContriller.class");

    @RequestMapping(value="/login.htm",method = RequestMethod.POST)
    public String loginCheck(){
        logger.debug("Recieved request to login.htm");
        return "welcome";
    }
}
