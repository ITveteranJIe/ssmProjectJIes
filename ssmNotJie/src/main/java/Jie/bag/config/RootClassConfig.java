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
@Configuration
@ComponentScan(basePackages ="Jie.bag")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement
public class RootClassConfig {
    @Bean
    public PropertyPlaceholderConfigurer placeholderConfigurer(){
        PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
        configurer.setLocations(new ClassPathResource("jdbc.properties"));
        return configurer;
    }
}
