package ru.gb.catalog.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO implements Serializable {

    private static  final long serialVersionUID = 1L;

    private Long productId;
    private String productName;
    private String category;
    private List<SellerDTO> sellerInfo;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<SellerDTO> getSellerInfo() {
        return sellerInfo;
    }

    public void setSellerInfo(List<SellerDTO> sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

}
