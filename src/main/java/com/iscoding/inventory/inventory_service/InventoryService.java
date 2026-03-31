package com.iscoding.inventory.inventory_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repository;

    public boolean isInStock(String code) {
        return repository.findByProductCode(code)
                .map(inv -> inv.getQuantity() > 0)
                .orElse(false);
    }
}
