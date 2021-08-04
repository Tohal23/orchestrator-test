package com.test.customerservice.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StoreItem {

    private Long id;
    private String name;
    private Number amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
