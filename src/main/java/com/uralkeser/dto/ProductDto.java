package com.uralkeser.dto;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class ProductDto {
    @Id
    private String id;
    private String name;
    private BigDecimal price;
    private String date;
    private String categoryId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public ProductDto(String id, String name, BigDecimal price, String date, String categoryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
        this.categoryId = categoryId;
    }
}
