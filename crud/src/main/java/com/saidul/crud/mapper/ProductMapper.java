package com.saidul.crud.mapper;

import com.saidul.crud.Entity.Product;
import com.saidul.crud.dto.ProductDto;

public class ProductMapper {
    public static ProductDto mapToProductDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setCategory(product.getCategory());
        productDto.setDescription(productDto.getDescription());
        productDto.setUnit_price(productDto.getUnit_price());
        productDto.setManufactured_date(product.getManufactured_date());
        productDto.setQuantity_in_stock(productDto.getQuantity_in_stock());
        return productDto;
    }
    public static Product mapToProduct(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setCategory(productDto.getCategory());
        product.setDescription(productDto.getDescription());
        product.setUnit_price(productDto.getUnit_price());
        product.setManufactured_date(productDto.getManufactured_date());
        product.setQuantity_in_stock(productDto.getQuantity_in_stock());
        return product;
    }
}
