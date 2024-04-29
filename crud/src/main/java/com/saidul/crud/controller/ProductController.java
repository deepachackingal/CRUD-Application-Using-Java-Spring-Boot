package com.saidul.crud.controller;

import com.saidul.crud.dto.ProductDto;
import com.saidul.crud.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/products")
public class ProductController{
    private ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto) {
        ProductDto savedProduct = productService.createProduct(productDto);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") int productId) {
        ProductDto productDto = productService.getProductById(productId);
        return ResponseEntity.ok(productDto);
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAllProduct() {
        List<ProductDto> productDto = productService.getAllProduct();
        return ResponseEntity.ok(productDto);
    }

    @PutMapping("{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable("id") int productId, @RequestBody ProductDto productDto) {
        ProductDto updatedProduct = productService.updateProduct(productId, productDto);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.ok("The product is deleted successfully");
    }
}
