package com.productManagementApp.productservice.dao.mappers;

import com.productManagementApp.productservice.dao.dto.ProductDetails;
import com.productManagementApp.productservice.dao.dto.ProductModel;
import com.productManagementApp.productservice.dao.entities.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product fromModelToDb(ProductModel productModel);

    ProductDetails fromDbToDetails(Product result);
    List<ProductDetails> fromDbToDetails(List<Product> result);
}
