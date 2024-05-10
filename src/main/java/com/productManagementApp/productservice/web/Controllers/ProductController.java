package com.productManagementApp.productservice.web.Controllers;

import com.productManagementApp.productservice.dao.dto.ProductDetails;
import com.productManagementApp.productservice.dao.dto.ProductModel;
import com.productManagementApp.productservice.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    private ProductDetails createProduct(@RequestBody ProductModel productModel){
        return productService.createProduct(productModel);
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    private List<ProductDetails> getAllProducts(){
        return productService.getAllProducts();
    }
}
