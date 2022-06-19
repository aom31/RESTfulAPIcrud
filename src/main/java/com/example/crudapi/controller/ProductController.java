package com.example.crudapi.controller;

import com.example.crudapi.entity.Product;
import com.example.crudapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return  productService.saveProduct(product);
    }

    @PostMapping("/addallproduct")
    public List<Product> addAllProducts(@RequestBody List<Product> product){
        return productService.saveAllProduct(product);
    }

    @GetMapping("/getallproduct")
    public List<Product> getAllProduct(){
        return  productService.getAllProduct();

    }

    @GetMapping("/getproduct/{id}")
    public Product getProductById(@PathVariable  int id){
        return productService.getProductById(id);
    }

    @GetMapping("/getproduct/{name}")
    public Product getProductByName(@PathVariable String name){
        return  productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return  productService.updateProduct(product);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteProductByID(@PathVariable  int id){
        return productService.deleteProductByID(id);

    }


}
