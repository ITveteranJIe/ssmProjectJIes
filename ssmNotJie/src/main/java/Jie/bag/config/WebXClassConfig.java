package Jie.bag.config;

import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2716:52     web.xml      WebXClassConfig
 * -♥---J
 */
@SuppressWarnings("all")
/** 数值越小 越先加载*/
@Order(1)
public class WebXClassConfig implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {

    }
}
