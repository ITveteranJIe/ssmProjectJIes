package Jie.bag.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Properties;
/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2716:27     数据 [dao]      DataSourceClassConfig
 * -♥---J
 */

/**用于 变量名 Class名 有波浪线 取消作用*/
@SuppressWarnings("all")
/**代表一个配置类*/
@Configuration
/**扫描 mapper 包下面的注解*/
@MapperScan(value= "Jie.bag.mapper")
public class DataSourceClassConfig {
     /**从连接数据库配置中 用 @value 注解 获取到*/
     @Value("${jdbc.driverClass}")
     private String driverClass;
     @Value("${jdbc.jdbcUrl}")
     private String jdbcUrl;
     @Value("${jdbc.user}")
     private String username;
     @Value("${jdbc.password}")
     private String password;

     /** 写一个 数据源 DataSource 在创建 DriverManagerDataSource 对象 的连接池 将从数据库配置用获取的数据 设置到
      *  DriverManagerDataSource 连接池 中 并且使用@Bean 给spring 托管
      * */
     @Bean
     public DataSource dataSource(){
         DriverManagerDataSource dataSource = new DriverManagerDataSource();
         dataSource.setDriverClassName(driverClass);
         dataSource.setUrl(jdbcUrl);
         dataSource.setUsername(username);
         dataSource.setPassword(password);
         return dataSource;
     }
     /**创建 DataSourceTransactionManager 事务 将 数据库连接的数据放到事务里面*/
     @Bean
     public DataSourceTransactionManager transactionManager(){
         return new DataSourceTransactionManager(dataSource());
     }
    /**Create a SqlSessionFactory method factory to store a new SqlSessionFactoryBean
     * The connection data configuration data is set through [SqlSessionFactoryBean] to return the Object type of an Object
     * The other types in the IOC container can then get the SqlSession instance and perform the related SQL execution task.*/
     @Bean
     public SqlSessionFactory sessionFactory() throws Exception {
         SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
         factoryBean.setDataSource(dataSource());
         PageInterceptor pageInterceptor = new PageInterceptor();
         Properties props = new Properties();
         props.setProperty("helperDialect", "mysql");
         props.setProperty("supportMethodsArguments", "true");
         props.setProperty("rowBoundsWithCount", "true");
         pageInterceptor.setProperties(props);
         factoryBean.setPlugins(new PageInterceptor[]{pageInterceptor});
         return factoryBean.getObject();
     }
}
