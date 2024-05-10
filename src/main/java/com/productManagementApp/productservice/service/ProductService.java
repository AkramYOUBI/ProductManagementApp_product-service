package com.productManagementApp.productservice.service;

import com.productManagementApp.productservice.dao.dto.ProductDetails;
import com.productManagementApp.productservice.dao.dto.ProductModel;
import com.productManagementApp.productservice.dao.entities.Product;
import com.productManagementApp.productservice.dao.mappers.ProductMapper;
import com.productManagementApp.productservice.dao.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }


    public ProductDetails createProduct(ProductModel productModel) {
        Product productDb = productMapper.fromModelToDb(productModel);
        Product result = productRepository.save(productDb);
        ProductDetails productDetails = productMapper.fromDbToDetails(result);
        return productDetails;
    }

    public List<ProductDetails> getAllProducts() {
        List<Product> resultList =  productRepository.findAll();
        List<ProductDetails> productList = productMapper.fromDbToDetails(resultList);
        return productList;
    }
}
