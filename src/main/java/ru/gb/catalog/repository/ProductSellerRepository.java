package ru.gb.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.catalog.entity.ProductSeller;
import java.util.List;

@Repository
public interface ProductSellerRepository extends JpaRepository<ProductSeller, Long> {

    List<ProductSeller> findByBrandId(Long id);

    List<ProductSeller> findByBrandName(String name);

    List<ProductSeller> findByColorId(Long id);

    List<ProductSeller> findByColorName(String name);

    List<ProductSeller> findBySizeId(Long id);

    List<ProductSeller> findBySizeCode(String name);

    List<ProductSeller> findBySku(String sku);

    List<ProductSeller> findBySellerId(Long id);

    List<ProductSeller> findBySellerSellerName(String sellerName);

}
