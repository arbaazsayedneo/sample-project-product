package com.sample.sampleproject.service;

import com.sample.sampleproject.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> productList = new ArrayList<>();

    public ResponseEntity<Product> addProduct(Product product){
        this.productList.add(product);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    public ResponseEntity<List<Product>> getproducts(){
        return new ResponseEntity<>(this.productList,HttpStatus.OK);
    }
}
