package Jie.bag.config;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * ♥--?
 * ♥O Copyright (C) JIe
 * ♥-Y <author>     <time>             <desc>          <ClassName>
 * ♥--J Jie   2020/12/2816:15           pagingClass
 * -♥---J
 */
@SuppressWarnings("all")
@Data
public class pagingClass<T> implements Serializable {
    private List<T> rows;	//每页的数据
    private Long total;		//总共有多少记录数
    private Integer currentPage;	//当前页数(从1开始)
    private Integer pages;		//总共页数
}
