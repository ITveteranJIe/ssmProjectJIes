package Jie.bag.controller.queen;

import Jie.bag.service.serviceQuenn.inf.ServiceQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2816:31           QueenController
 * -♥---J
 */
@SuppressWarnings("all")
@Controller
public class QueenController {
    /**自动注入 ServiceQ*/
    @Autowired
    private ServiceQ  serviceQ;
    /**后台管理*/
    @RequestMapping("/manager/login")
    public String login(Model model){
     return "backendlogin";
    }

    /**manager/dologin 登录成功*/
    @RequestMapping("/manager/dologin")
    public String dologin(Model model){

        return "backend/main";
    }
}
