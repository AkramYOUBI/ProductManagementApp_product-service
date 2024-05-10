package com.productManagementApp.productservice.dao.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDetails {
    private int product_id;
    private double price;
    private String description;
    private Date created_at;
}
