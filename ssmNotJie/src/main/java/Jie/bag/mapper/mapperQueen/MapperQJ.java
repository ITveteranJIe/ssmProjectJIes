package Jie.bag.mapper.mapperQueen;
import Jie.bag.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2817:38     后台      MapperQJ
 * -♥---J
 */
@Repository
@SuppressWarnings("all")
public interface MapperQJ {
    /**手游后台管理系统登录*/
//    @Select("select * from backend_user where userCode=#{userCode} and userPassword=#{userPassword}")
    @Select("SELECT * FROM backend_user  INNER  JOIN data_dictionary  ON backend_user.id=data_dictionary.id\n" +
            "WHERE userCode=#{userCode} AND  userPassword=#{userPassword}")
    @Results(value = {
            @Result(column ="valueName",property = "userTypeName" ,id=true)
    })
    BackendUser selectBylogin(@Param("userCode") String userCode,@Param("userPassword") String userPassword);
}
