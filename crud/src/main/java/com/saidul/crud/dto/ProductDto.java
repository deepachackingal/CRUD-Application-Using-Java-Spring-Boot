package com.saidul.crud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private int id;
    private int category;
    private String description;
    private Date manufactured_date;
    private String name;
    private int quantity_in_stock;
    private int unit_price;
}
