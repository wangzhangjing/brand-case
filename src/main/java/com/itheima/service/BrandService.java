package com.itheima.service;

import com.itheima.pojo.Brand;
import com.itheima.pojo.PagBean;

import java.util.List;

public interface BrandService {

    /**
     * 查询所有
     * @return
     */
    List<Brand> selectAll();

    /**
     * 添加数据
     * @param brand
     */
    void add(Brand brand);
//删除数据·
    void delete(int id);
    void deleteByIds(int[] ids);

    //修改数据
    void update(Brand brand);
//    分页查询
    PagBean<Brand> selectByPage(int currentPage,int pageSize);

    PagBean<Brand> selectByPageAndCondition(int currentPage,int pageSize,Brand brand);
}
