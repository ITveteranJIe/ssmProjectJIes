package Jie.bag.Hand;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2821:13     拦截器      HandleIntercepttorClassConfig
 * -♥---J
 */
@Component
public class HandleIntercepttorClassConfig implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        System.out.println("-----------方法前------------");
        HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("userSession")!=null){
            httpServletRequest.setAttribute("mess","你还没有登录 请登录");
           return true;
        }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("-----------方法后------------");
    }
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("-----------清理------------");
    }
}
