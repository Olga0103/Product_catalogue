package ru.gb.catalog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "COLOR")
public class Color {

    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "color")
    private Set<ProductSeller> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductSeller> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductSeller> products) {
        this.products = products;
    }
}
