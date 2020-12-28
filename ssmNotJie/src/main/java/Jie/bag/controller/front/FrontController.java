package Jie.bag.controller.front;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2816:57           FrontController
 * -♥---J
 */
@SuppressWarnings("all")
@Controller
public class FrontController {
    @RequestMapping("dev/login")
    public String login(Model model){
        return "devlogin";
    }
}
