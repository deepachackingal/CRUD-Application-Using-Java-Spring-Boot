package com.saidul.crud.service.impl;

import com.saidul.crud.Entity.Product;
import com.saidul.crud.dto.ProductDto;
import com.saidul.crud.exception.ResourceNotFoundException;
import com.saidul.crud.mapper.ProductMapper;
import com.saidul.crud.repository.ProductRepository;
import com.saidul.crud.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private ProductRepository productRepository;
    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = ProductMapper.mapToProduct(productDto);
        Product savedProduct = productRepository.save(product);
        return ProductMapper.mapToProductDto(savedProduct);
    }

    @Override
    public ProductDto getProductById(int productId) {
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product is not exist of given id: " + productId)
        );
        return ProductMapper.mapToProductDto(product);
    }

    @Override
    public List<ProductDto> getAllProduct() {
        List<Product> products = productRepository.findAll();
        return products.stream().map((product -> ProductMapper.mapToProductDto(product)))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto updateProduct(int productId, ProductDto productDto) {
        Product product = productRepository.findById(productId).orElseThrow(
                ()-> new ResourceNotFoundException("Product is not exist of given id: " + productId)
        );
        product.setName(productDto.getName());
        product.setDescription(product.getDescription());
        product.setCategory(productDto.getCategory());
        product.setUnit_price(productDto.getUnit_price());
        product.setManufactured_date(productDto.getManufactured_date());
        product.setQuantity_in_stock(productDto.getQuantity_in_stock());

        Product productObj = productRepository.save(product);

        return ProductMapper.mapToProductDto(productObj);
    }

    @Override
    public void deleteProduct(int productId) {
        Product product = productRepository.findById(productId).orElseThrow(
                () -> new ResourceNotFoundException("Product is not exist of given id: " + productId)
        );
        productRepository.deleteById(productId);
    }
}
