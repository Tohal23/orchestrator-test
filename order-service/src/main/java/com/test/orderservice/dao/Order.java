package com.test.orderservice.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
