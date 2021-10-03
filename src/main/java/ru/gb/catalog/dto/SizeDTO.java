package ru.gb.catalog.dto;

import java.io.Serializable;

public class SizeDTO implements Serializable {

    private static  final long serialVersionUID = 1L;

    private Long sizeId;
    private String SizeCode;

    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeCode() {
        return SizeCode;
    }

    public void setSizeCode(String sizeCode) {
        SizeCode = sizeCode;
    }
}
