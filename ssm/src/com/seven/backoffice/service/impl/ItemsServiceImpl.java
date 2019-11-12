package com.seven.backoffice.service.impl;

import com.seven.backoffice.mapper.ItemsMapper;
import com.seven.backoffice.model.Items;
import com.seven.backoffice.service.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl   implements IItemService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllItems();
    }

    @Override
    public Items findById(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Items items) {

    }

    @Override
    public void deleteById(Integer id) {
    itemsMapper.deleteByPrimaryKey(id);
    }
}
