package Jie.bag.config;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2716:45     spring上下文      RootClassConfig
 * -♥---J
 */
@SuppressWarnings("all")
/**代表是一个 配置类*/
@Configuration
/**扫描 Jie.bag 下面所有的注解*/
@ComponentScan(basePackages ="Jie.bag")
/**开启 动态代理  默认是 false*/
@EnableAspectJAutoProxy(proxyTargetClass = true)
/**开始 springBoot 事务*/
@EnableTransactionManagement
public class RootClassConfig {
    @Bean
    public PropertyPlaceholderConfigurer placeholderConfigurer(){
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setLocations(new ClassPathResource("jdbc.properties"));
        return configurer;
    }
}
