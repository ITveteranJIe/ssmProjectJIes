package Jie.bag.service.serviceQuenn.imp;

import Jie.bag.mapper.mapperQueen.MapperQJ;
import Jie.bag.pojo.BackendUser;
import Jie.bag.service.serviceQuenn.inf.ServiceQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2817:55     后太管理系统service 实现类      ServiceQJL
 * -♥---J
 */
@Service
@SuppressWarnings("all")
public class ServiceQJL implements ServiceQ {
    @Autowired
    private MapperQJ mapperQJ;
    /**后台登录*/
    public BackendUser selectBylogin(String userCode, String userPassword) {
        return mapperQJ.selectBylogin(userCode,userPassword);
    }
}
