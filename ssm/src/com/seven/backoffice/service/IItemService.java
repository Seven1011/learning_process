package com.seven.backoffice.service;

import com.seven.backoffice.model.Items;

import java.util.List;

public interface IItemService {

    public List<Items> findAllItems();
    public Items findById( Integer id);
    public void saveOrUpdate(Items items);
    public void deleteById(Integer id);
}
