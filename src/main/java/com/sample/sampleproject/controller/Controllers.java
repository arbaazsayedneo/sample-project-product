package com.sample.sampleproject.controller;

import com.sample.sampleproject.model.Product;
import com.sample.sampleproject.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controllers {

    @Autowired
    private ProductService productService;

    Logger logger = LoggerFactory.getLogger(Controllers.class);
    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Response From Hello Controller",HttpStatus.OK);
    }

    @GetMapping("/product")
    public ResponseEntity<?> getAllProducts(){
        logger.info("Request Recieved: GET product");
      return this.productService.getproducts();
    }

    @PostMapping("/product")
    public ResponseEntity<?> postProduct(@RequestBody Product product){
        logger.info("product input: {}",product);
        logger.info("Request Recieved: POST product");
    return this.productService.addProduct(product);
    }

}
