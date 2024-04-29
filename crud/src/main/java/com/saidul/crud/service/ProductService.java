package com.saidul.crud.service;

import com.saidul.crud.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    ProductDto getProductById(int productId);
    List<ProductDto> getAllProduct();
    ProductDto updateProduct(int productId, ProductDto productDto);
    void deleteProduct(int productId);
}
