package ru.gb.catalog.dto;

import java.io.Serializable;

public class BrandDTO implements Serializable {

    private static  final long serialVersionUID = 1L;

    private Long brandId;
    private String brandName;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
