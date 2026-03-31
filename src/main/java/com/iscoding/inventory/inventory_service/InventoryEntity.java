package com.iscoding.inventory.inventory_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class InventoryEntity {

    @Id
    private Long id;

    private String productCode;
    @Getter
    private Integer quantity;

}