package ru.gb.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.catalog.dto.ProductDTO;
import ru.gb.catalog.exception.ProductNotFound;
import ru.gb.catalog.service.ProductService;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/by-brand/{val}")
    @Cacheable(cacheNames = "brand", key = "#val")
    public ResponseEntity<List<ProductDTO>> getProductsByBrand(@PathVariable String val) {
        List<ProductDTO> products = productService.getProductsByBrand(val);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/by-color/{val}")
    @Cacheable(cacheNames = "color", key = "#val")
    public ResponseEntity<List<ProductDTO>> getProductsByColor(@PathVariable String val) {
        List<ProductDTO> products = productService.getProductsByColor(val);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/by-size/{val}")
    @Cacheable(cacheNames = "size", key = "#val")
    public ResponseEntity<List<ProductDTO>> getProductsBySize(@PathVariable String val) {
        List<ProductDTO> products = productService.getProductsBySize(val);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/by-sku/{sku}")
    @Cacheable(cacheNames = "sku", key = "#sku")
    public ResponseEntity<List<ProductDTO>> getProductBySKU(@PathVariable String sku) {
        List<ProductDTO> products = productService.getProductsBySKU(sku);
        if (products == null) {
            throw new ProductNotFound("Product not found!");
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/by-seller/{val}")
    @Cacheable(cacheNames = "seller", key = "#val")
    public ResponseEntity<List<ProductDTO>> getProductsBySeller(@PathVariable String val) {

        System.out.println("===========FETCHING FROM DB==========");
        List<ProductDTO> products = productService.getProductsBySeller(val);
        if (products == null) {
            throw new ProductNotFound("Product not found!");
        }
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}