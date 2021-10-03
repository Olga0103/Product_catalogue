package ru.gb.catalog.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Seller {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "SELLER_NAME")
    private String sellerName;

    @OneToMany(mappedBy = "seller")
    private Set<ProductSeller> productSellers = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Set<ProductSeller> getProductSellers() {
        return productSellers;
    }

    public void setProductSellers(Set<ProductSeller> productSellers) {
        this.productSellers = productSellers;
    }
}