package Jie.bag.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2716:59     总 加载spring 和springmvc 配置      WebAppClassConfig
 * -♥---J
 */
@SuppressWarnings("all")
public class WebAppClassConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**spring 上下文 配置*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootClassConfig.class};
    }
    /**Web 【controller 配置】*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebClassConfig.class};
    }
    /**拦截 的 请求  【/ 所有】*/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
