package Jie.bag.service.serviceQuenn.inf;

import Jie.bag.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2817:54     后台接口      ServiceQ
 * -♥---J
 */
@Service
@SuppressWarnings("all")
public interface ServiceQ {
    BackendUser selectBylogin(String userCode,String userPassword);
}
