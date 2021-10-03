package ru.gb.catalog.dto;

import java.io.Serializable;

public class ColorDTO implements Serializable {

    private static  final long serialVersionUID = 1L;

    private Long colorId;
    private String colorName;

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
