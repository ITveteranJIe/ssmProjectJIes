package Jie.bag.controller.queen;

import Jie.bag.pojo.BackendUser;
import Jie.bag.service.serviceQuenn.inf.ServiceQ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

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
    /**日志*/
    private static final Logger logger = LoggerFactory.getLogger(QueenController.class);
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
    public String dologin(Model model, HttpSession session,String userCode,String userPassword){
        BackendUser backendUser = serviceQ.selectBylogin(userCode, userPassword);
        if(backendUser==null){
            model.addAttribute("error","账号或密码错误");
            return "backendlogin";
        }
        session.setAttribute("userSession",backendUser);
//        model.addAttribute("userSession1",backendUser);
        logger.info("进来了");
        return "backend/main";
    }
}
