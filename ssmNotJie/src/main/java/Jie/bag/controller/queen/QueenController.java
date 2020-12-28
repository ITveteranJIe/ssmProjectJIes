package Jie.bag.controller.queen;

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
    @RequestMapping("/manager/login")
    public String login(Model model){
     return "backendlogin";
    }
}
