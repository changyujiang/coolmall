package com.changyu_jiang.coolmall.service.impl;

import com.changyu_jiang.coolmall.mapper.CategoryMapper;
import com.changyu_jiang.coolmall.pojo.Category;
import com.changyu_jiang.coolmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// annotation @Service declare the class is a service class.
@Service
public class CategoryServiceImpl implements CategoryService{

    // 通过自动装配引入CategoryMapper
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        return categoryMapper.list();
    }
}
