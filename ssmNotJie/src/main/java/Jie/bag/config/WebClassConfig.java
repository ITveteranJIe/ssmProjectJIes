package Jie.bag.config;
import Jie.bag.Hand.HandleIntercepttorClassConfig;
import org.hibernate.validator.HibernateValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.format.FormatterRegistry;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2716:53    就是controller 配置类       WebClassConfig
 * -♥---J
 */
@SuppressWarnings("all")
/**扫描 Jie.bag 下面的注解*/
@ComponentScan(basePackages = {"Jie.bag"})
/**是使用Java 注解快捷配置Spring Webmvc的一个注解*/
@EnableWebMvc
public class WebClassConfig extends WebMvcConfigurerAdapter {

    @Bean
    public LocalValidatorFactoryBean validatorFactoryBean(){
        LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
        validatorFactoryBean.setProviderClass(HibernateValidator.class);
        return validatorFactoryBean;
    }
    /**视图解析方法*/
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setExposeContextBeansAsAttributes(true);
        return viewResolver;
    }
    @Autowired
    private HandleIntercepttorClassConfig handleIntercepttorClassConfig;
    /**配置拦截器*/
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(handleIntercepttorClassConfig)
               .addPathPatterns("/WEB-INF/jsp/backend/**") // 拦截所有路径/backend/**","/developer/**
               .excludePathPatterns("/resources/**","/statics/**","/403.jsp","/index.jsp",
                       "/WEB-INF/jsp/backendlogin.jsp","/WEB-INF/jsp/devlogin.jsp","/WEB-INF/jsp/error.jsp"); // 不拦截请求资源
    }
    /**允许资源过滤*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/statics/**").addResourceLocations("/statics/");
    }
    /**配置日期*/
    @Override
    public void addFormatters(FormatterRegistry registry) {
       registry.addFormatter(new DateFormatter("yyyy-MM-dd"));
    }

}
