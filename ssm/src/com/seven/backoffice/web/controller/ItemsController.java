package com.seven.backoffice.web.controller;

import com.seven.backoffice.model.Items;
import com.seven.backoffice.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("items")
public class ItemsController {

    @Autowired
    private IItemService itemsService;

    @RequestMapping("list")
    public ModelAndView list(Model model){
        //1.查数据
        List<Items> itemsList = itemsService.findAllItems();
        ModelAndView mv   = new ModelAndView("/items/list");
        //2.存数据
        model.addAttribute("itemsList",itemsList);
        return mv;
    }

    @RequestMapping("save")
    public String save(){
        //创建商品
        Items items = new Items();
        items.setName("iphone11");
        items.setPrice(7999.00F);
        items.setCreatetime(new Date());
        items.setDetail("666好用");

        //保存数据
        itemsService.saveOrUpdate(items);

        return "items/list";
    }

    @RequestMapping("delete")
    public ModelAndView delete(Integer id){
        //1.查数据
        List<Items> itemsList = itemsService.findAllItems();
        ModelAndView mv   = new ModelAndView("/items/list");
        //删除
        itemsService.deleteById(id);

        //存数据
        mv.addObject("itemsList",itemsList);
        return mv;
    }
}
