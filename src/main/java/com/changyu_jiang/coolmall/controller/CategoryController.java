package com.changyu_jiang.coolmall.controller;

import com.changyu_jiang.coolmall.pojo.Category;
import com.changyu_jiang.coolmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// 注解@controller 声明当前类是一个控制器；
// 注解@requestMapping("") 表明访问的时候无需额外的地址
@Controller
@RequestMapping("")
public class CategoryController {

    // @Autowired 把categoryServiceImpl自动装配进了 Cat
    @Autowired
    CategoryService categoryService;

    @RequestMapping("admin_category_list")
    public String list(Model model) {
        List<Category> cs = categoryService.list();
        model.addAttribute("cs", cs);
        return "admin/listCategory";
    }
}
