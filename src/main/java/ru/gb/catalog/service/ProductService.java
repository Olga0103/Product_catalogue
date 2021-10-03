package ru.gb.catalog.service;

import ru.gb.catalog.dto.ProductDTO;
import java.util.List;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    List<ProductDTO> getProductsByBrand(String val);

    List<ProductDTO> getProductsByColor(String val);

    List<ProductDTO> getProductsBySize(String val);

    List<ProductDTO> getProductsBySKU(String sku);

    List<ProductDTO> getProductsBySeller(String sku);

}
